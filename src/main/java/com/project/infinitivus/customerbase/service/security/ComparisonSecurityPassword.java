package com.project.infinitivus.customerbase.service.security;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 *
 * @author aals
 */
public class ComparisonSecurityPassword extends Security {

    public boolean comparisonPassword(String password) throws IOException,
            NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] salt = readingBytesFromFile(SECURITY_PROGRAM_SALT);
        byte[] key = readingBytesFromFile(SECURITY_PROGRAM_KEY);
        return authenticate(password, key, salt);
    }

    private byte[] readingBytesFromFile(String nameLine) throws  IOException {
        try (FileInputStream input = new FileInputStream(nameLine)) {
            byte[] buffer = new byte[input.available()];
            input.read(buffer, 0, buffer.length);
            return buffer;
        }
    }
}
