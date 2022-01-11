package com.project.infinitivus.customerbase.view.input;

import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author infinitivus
 */
public class InputString {

    public String inputString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = null;
        try {
            inputLine = reader.readLine();
        } catch (IOException e) {
            new OutputMessageColumn().outputMessage("errorInputOutput",1);
            Logger.getLogger(InputString.class.getName()).log(Level.SEVERE, null, e);
        }
        return inputLine;
    }
}
