package com.yearup.socialapp.AWS;

import com.yearup.socialapp.models.Picture;
import com.yearup.socialapp.models.Resume;
import com.yearup.socialapp.models.YearUpStudent;
import org.springframework.web.multipart.MultipartFile;

public interface FileServiceInterface {


    Resume uploadResume (MultipartFile file, YearUpStudent yearUpStudent);

    Picture uploadPicture (MultipartFile file, YearUpStudent yearUpStudent);

    void uploadFile(MultipartFile file, YearUpStudent yearUpStudent);

}
