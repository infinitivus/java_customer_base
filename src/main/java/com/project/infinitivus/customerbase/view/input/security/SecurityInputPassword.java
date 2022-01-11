package com.project.infinitivus.customerbase.view.input.security;

import com.project.infinitivus.customerbase.service.security.CreateSecurityPassword;
import com.project.infinitivus.customerbase.view.input.InputString;
import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

/**
 *
 * @author infinitivus
 */
public class SecurityInputPassword {

    public void createPassword() {
        IOutputMessage iOutputMessage= new OutputMessageColumn();
        InputString inputString = new InputString();
        String password1;
        String password2;
        do {
            iOutputMessage.outputMessage("security", 1);
            password1 = inputString.inputString();
            iOutputMessage.outputMessage("security", 2);
            password2 = inputString.inputString();
            if (password1.equals(password2)) {
                iOutputMessage.outputMessage("security", 3);
            } else {
                iOutputMessage.outputMessage("security", 4);
            }
        } while (!password1.equals(password2));
        new CreateSecurityPassword().createPassword(password1);
    }
}
