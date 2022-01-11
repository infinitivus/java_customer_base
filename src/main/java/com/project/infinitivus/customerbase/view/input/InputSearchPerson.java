package com.project.infinitivus.customerbase.view.input;

import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

/**
 * @author infinitivus
 */
public class InputSearchPerson {

    public String searchPerson() {
        OutputMessageColumn outputMessageColumn = new OutputMessageColumn();
        InputString inputString = new InputString();
        outputMessageColumn.outputMessage("inputSearch", 1);
        return inputString.inputString();
    }
}
