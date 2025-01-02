package com.proje.controller;

import com.proje.dto.DtoStudent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IQrController {
    public ResponseEntity<byte[]> generateQRCode();
    public ResponseEntity<List<DtoStudent>> recordAttendance();
}