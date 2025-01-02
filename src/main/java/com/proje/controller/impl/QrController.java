package com.proje.controller.impl;

import com.google.zxing.WriterException;
import com.proje.controller.IQrController;
import com.proje.dto.DtoStudent;
import com.proje.service.impl.QrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@RestController
@RequestMapping("/rest/api/school")
public class QrController implements IQrController {

    private static final Logger logger = LoggerFactory.getLogger(QrController.class);

    @Autowired
    private QrService qrCodeService;

    @GetMapping("/generate-qr")
    public ResponseEntity<byte[]> generateQRCode() {
        try {
            String qrText = "http://localhost:8080/rest/api/school/record-attendance";
            byte[] qrCode = qrCodeService.generateQRCode(qrText, 200, 200);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "image/png");
            return new ResponseEntity<>(qrCode, headers, HttpStatus.OK);
        } catch (WriterException | IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/record-attendance")
    public ResponseEntity<List<DtoStudent>> recordAttendance() {
        Long studentId = (Long) RequestContextHolder.getRequestAttributes().getAttribute("studentId", RequestAttributes.SCOPE_SESSION);
        String classId = "BZ106";
        logger.info("Received request to record attendance: studentId={}, classId={}", studentId, classId);

        try {
            List<DtoStudent> updatedStudents = qrCodeService.recordAttendance(studentId, classId);
            return ResponseEntity.ok(updatedStudents);
        } catch (Exception e) {
            logger.error("Error recording attendance", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}