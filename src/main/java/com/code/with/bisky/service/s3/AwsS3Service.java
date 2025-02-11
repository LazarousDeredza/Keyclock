package com.code.with.bisky.service.s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectResult;

import java.io.IOException;
import java.io.InputStream;

public interface AwsS3Service {

    AmazonS3 getClient();
    String getPreSignedUrl(String bucketName, String key);

    byte[] getObject(String bucketName, String key) throws IOException;
    boolean deleteObject(String bucketName, String key);
    PutObjectResult uploadObject(String bucketName, String key, InputStream inputStream, ObjectMetadata metadata);

}
