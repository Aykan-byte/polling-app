package com.proje.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface IQrController {
    public ResponseEntity<byte[]> generateQRCode(@RequestParam String text);
}