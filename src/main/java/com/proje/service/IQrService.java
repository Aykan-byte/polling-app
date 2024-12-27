package com.proje.service;

import com.google.zxing.WriterException;

import java.io.IOException;

public interface IQrService {

    public byte[] generateQRCode(String text, int width, int height) throws WriterException, IOException;
    public void generateQRCodeToFile(String text, int width, int height, String filePath) throws WriterException,IOException;
}
