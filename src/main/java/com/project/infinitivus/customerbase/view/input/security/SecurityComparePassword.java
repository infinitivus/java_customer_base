package com.project.infinitivus.customerbase.view.input.security;

import com.project.infinitivus.customerbase.service.security.ComparisonSecurityPassword;
import com.project.infinitivus.customerbase.view.input.InputString;
import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author infinitivus
 */
public class SecurityComparePassword {

    public void comparePassword() {
        IOutputMessage iOutputMessage= new OutputMessageColumn();
        InputString enteringDataVerification = new InputString();
        try {
            boolean result;
            String password;
            do {
                iOutputMessage.outputMessage("security", 5);
                password = enteringDataVerification.inputString();
                result = new ComparisonSecurityPassword().comparisonPassword(password);
                if (result) {
                    iOutputMessage.outputMessage("security", 6);
                } else {
                    iOutputMessage.outputMessage("security", 7);
                }
            } while (!result);
        } catch (IOException | NoSuchAlgorithmException | InvalidKeySpecException ex) {
            iOutputMessage.outputMessage("errorSecurity",1);
            Logger.getLogger(SecurityComparePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
