package com.project.infinitivus.customerbase.service.security;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author infinitivus
 */
public class CreateSecurityPassword extends Security {

    public void createPassword(String password) {
        try {
            byte[] salt = generateSalt();
            writingBytesToFile(SECURITY_PROGRAM_SALT, salt);
            writingBytesToFile(SECURITY_PROGRAM_KEY, getEncryptedPassword(password, salt));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            Logger.getLogger(Security.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void writingBytesToFile(String nameLine, byte[] data) {

        try (FileOutputStream output = new FileOutputStream(nameLine)) {
            output.write(data, 0, data.length);
        } catch (IOException ex) {
            Logger.getLogger(CreateSecurityPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
