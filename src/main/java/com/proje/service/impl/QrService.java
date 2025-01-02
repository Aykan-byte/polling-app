package com.proje.service.impl;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.proje.dto.DtoStudent;
import com.proje.model.Attendance;
import com.proje.model.Student;
import com.proje.model.Lesson;
import com.proje.repository.AttendanceRepository;
import com.proje.repository.PollingStudentRepository;
import com.proje.repository.PollingLessonRepository;
import com.proje.service.IQrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class QrService implements IQrService {

    private static final Logger logger = LoggerFactory.getLogger(QrService.class);
    private final List<Student> updatedStudents = new ArrayList<>();
    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private PollingStudentRepository studentRepository;

    @Autowired
    private PollingLessonRepository lessonRepository;

    private int counter = 0;

    public List<DtoStudent> recordAttendance(Long studentId, String classId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        Lesson lesson = lessonRepository.findById(classId)
                .orElseThrow(() -> new RuntimeException("Lesson not found"));

        Attendance attendance = attendanceRepository.findByStudentAndLesson(student, lesson);

        if (attendance != null) {
            attendance.incrementCount();
        } else {
            attendance = new Attendance(student, lesson, LocalDateTime.now(), 1);
        }
        attendanceRepository.save(attendance);

        if (!updatedStudents.contains(student)) {
            updatedStudents.add(student);
        }

        incrementCounter();

        return updatedStudents.stream()
                .map(s -> new DtoStudent(s.getId(), s.getName()))
                .collect(Collectors.toList());//dto dönüştürme yoklama artanların
    }


    @Override
    public byte[] generateQRCode(String text, int width, int height) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);
        return pngOutputStream.toByteArray();
    }

    public void incrementCounter() {
        counter++;
        logger.info("Counter: " + counter);
    }
    public List<DtoStudent> getUpdatedStudents(String classId) {
        Lesson lesson = lessonRepository.findById(classId).orElseThrow(() -> new RuntimeException("Lesson not found"));
        List<Attendance> attendances = attendanceRepository.findAllByLesson(lesson);

        return attendances.stream()
                .map(attendance -> new DtoStudent(
                        attendance.getStudent().getId(),
                        attendance.getStudent().getName()))
                .collect(Collectors.toList());
    }
    public void clearUpdatedStudents() {
        updatedStudents.clear();
    }
}