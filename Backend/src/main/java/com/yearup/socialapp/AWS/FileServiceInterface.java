package com.yearup.socialapp.AWS;

import com.yearup.socialapp.models.YearUpStudent;
import org.springframework.web.multipart.MultipartFile;

public interface FileServiceInterface {

    void uploadFile(MultipartFile file, YearUpStudent yearUpStudent);
}
