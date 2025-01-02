package com.proje.service;

import com.google.zxing.WriterException;
import com.proje.dto.DtoStudent;

import java.io.IOException;
import java.util.List;

public interface IQrService {

    public byte[] generateQRCode(String text, int width, int height) throws WriterException, IOException;
    public List<DtoStudent> recordAttendance(Long studentId, String classId);
    public void incrementCounter();
    public List<DtoStudent> getUpdatedStudents(String classId);
    public void clearUpdatedStudents();
}
