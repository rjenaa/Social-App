package com.yearup.socialapp.AWS;

import com.yearup.socialapp.models.YearUpStudent;
import org.springframework.web.multipart.MultipartFile;

import java.time.Year;

public interface FileServiceInterface {

    void uploadFile (MultipartFile file, YearUpStudent yearUpStudent);
}
