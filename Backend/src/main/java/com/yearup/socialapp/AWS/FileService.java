package com.yearup.socialapp.AWS;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.yearup.socialapp.models.YearUpStudent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

@Service
public class FileService implements FileServiceInterface{

    private static final Logger LOGGER = LoggerFactory.getLogger(FileServiceInterface.class);

    @Autowired
    private AmazonS3 amazonS3;
    @Value("${aws.s3.bucket}")
    private String bucketName;


    @Override
    public void uploadFile(MultipartFile multipartFile, YearUpStudent yearUpStudent){
        LOGGER.info("File upload in progress.");
        try {
            final File file = new File(multipartFile.getOriginalFilename());
            try (final FileOutputStream outputStream = new FileOutputStream(file)) {
                outputStream.write(multipartFile.getBytes());
            } catch (final IOException ex) {
                LOGGER.error("Error converting the multi-part file to file= ", ex.getMessage());
            }
            final String rename = yearUpStudent.getLastName() +  "_" + LocalDate.now();
            LOGGER.info("Uploading file with name= " + rename);

            final PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, rename, file);

            amazonS3.putObject(putObjectRequest);
        }
        catch (final AmazonServiceException ex) {
            LOGGER.info("File upload is failed.");
            LOGGER.error("Error= {} while uploading file.", ex.getMessage());
        }
    }
}
