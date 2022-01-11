
package com.project.infinitivus.customerbase.view.input;

import com.project.infinitivus.customerbase.service.work_with_person.RegexInputPerson;
import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

/**
 * @author aals
 */
public class InputDataPerson {
    private boolean verificationResult;

    public String inputData(int numberField) {
        InputString input = new InputString();
        RegexInputPerson regexInputPerson = new RegexInputPerson();
        IOutputMessage inputPerson = new OutputMessageColumn();
        String fieldValue;
        do {
            inputPerson.outputMessage("inputPerson", numberField);
            fieldValue = input.inputString();
            switch (numberField) {
                case 1:
                    verificationResult = regexInputPerson.regexSurName(fieldValue);
                    break;
                case 2:
                    verificationResult = regexInputPerson.regexName(fieldValue);
                    break;
                case 3:
                    verificationResult = regexInputPerson.regexPhone(fieldValue);
                    break;
                case 4:
                    verificationResult = regexInputPerson.regexEmail(fieldValue);
                    break;
                case 5:
                    verificationResult = regexInputPerson.regexBirthday(fieldValue);
                    break;
                case 6:
                    verificationResult = regexInputPerson.regexBrand(fieldValue);
                    break;
                case 7:
                    verificationResult = regexInputPerson.regexModel(fieldValue);
                    break;
                case 8:
                    verificationResult = regexInputPerson.regexVin(fieldValue);
                    break;
                case 9:
                    verificationResult = regexInputPerson.regexYear(fieldValue);
                    break;
                case 10:
                    verificationResult = regexInputPerson.regexLicensePlate(fieldValue);
                    break;
            }
            if (!verificationResult) {
                inputPerson.outputMessage("errorInputPerson", 1);
            }
        } while (!verificationResult);
        return fieldValue;
    }
}
