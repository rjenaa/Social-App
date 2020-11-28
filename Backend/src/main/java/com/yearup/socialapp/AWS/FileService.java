package com.yearup.socialapp.AWS;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.yearup.socialapp.models.Picture;
import com.yearup.socialapp.models.Resume;
import com.yearup.socialapp.models.YearUpStudent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
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


    @Value("${aws.url}")
    private String bucketURL;


    @Override
    public Resume uploadResume(MultipartFile multipartFile, YearUpStudent yearUpStudent){
        Resume resume = new Resume();

        LOGGER.info("Resume upload in progress.");

        File uploadFile = convertFile(multipartFile);

        String updatedFileName = yearUpStudent.getLastName() + "_"+resume.getId()+"Resume_"  + LocalDate.now() + "_" + multipartFile.getOriginalFilename();
        LOGGER.info("Uploading file with name= " + updatedFileName);

        final PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, updatedFileName, uploadFile);

        LOGGER.info("Setting metadata for file: " + uploadFile.getName());

        ObjectMetadata objectMetadata = new ObjectMetadata();

        objectMetadata.setContentType("application/pdf");

        putObjectRequest.setMetadata(objectMetadata);

        resume.setURL(bucketURL + updatedFileName);

        uploadToS3(putObjectRequest);

        uploadFile.delete();

        return resume;

    }

    @Override
    public Picture uploadPicture(MultipartFile file, YearUpStudent yearUpStudent) {

        Picture picture = new Picture();

        LOGGER.info("Picture upload in progress.");

        LOGGER.info(file.getContentType());
        File uploadFile = convertFile(file);

        String updatedFileName = yearUpStudent.getLastName() + "_"+picture.getId()+"Image_"  + LocalDate.now() + "_" +file.getOriginalFilename();

        LOGGER.info("Uploading file with name= " + updatedFileName);

        final PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, updatedFileName, uploadFile);

        LOGGER.info("Setting metadata for file: " + uploadFile.getName());

        ObjectMetadata objectMetadata = new ObjectMetadata();

        objectMetadata.setContentType("image/jpeg");

        putObjectRequest.setMetadata(objectMetadata);

        picture.setURL(bucketURL + updatedFileName);

        uploadToS3(putObjectRequest);

        uploadFile.delete();

        return picture;
    }

    private File convertFile(MultipartFile multipartFile) {
        LOGGER.info("Converting multipart to file ...");
        File file = new File(multipartFile.getOriginalFilename());
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            LOGGER.error("Error finding file: "+multipartFile.getOriginalFilename());
        }
        try {
            fileOutputStream.write(multipartFile.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            LOGGER.error("Error while writing to new file using file : "+multipartFile.getOriginalFilename());
        }

        return file;
    }

    private void uploadToS3(PutObjectRequest putObjectRequest){
        amazonS3.putObject(putObjectRequest);
        LOGGER.info("Successfully uploaded file with name: " + putObjectRequest.getKey());
    }

}
