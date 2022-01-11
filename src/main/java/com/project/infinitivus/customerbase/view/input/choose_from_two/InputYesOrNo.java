package com.project.infinitivus.customerbase.view.input.choose_from_two;

import com.project.infinitivus.customerbase.view.input.InputString;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

public class InputYesOrNo implements IChooseFromTwo {

    @Override
    public boolean choose(String key, int value) {
         InputString inputString = new InputString();
         OutputMessageColumn outputMessageColumn= new OutputMessageColumn();
        outputMessageColumn.outputMessage(key, value);
        String chooseChar = inputString.inputString();
        return chooseChar.equalsIgnoreCase("Y");
    }
}
