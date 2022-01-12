package com.project.infinitivus.customerbase.view.input.choose_from_two;

import com.project.infinitivus.customerbase.view.input.InputString;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

public class InputOneOrTwo implements IChooseFromTwo {
    private final InputString inputString = new InputString();
    private final OutputMessageColumn messageColumn = new OutputMessageColumn();
    private final OutputMessageColumn outputMessageColumn = new OutputMessageColumn();

    @Override
    public boolean choose(String key, int value) {
        String chooseNumber;
        do {
            messageColumn.outputMessage(key, value); // выберете 1 или 2
            chooseNumber = inputString.inputString();
            if (chooseNumber.equals("1")) {
                return true;
            } else if (chooseNumber.equals("2")) {
                return false;
            } else {
                outputMessageColumn.outputMessage("errorInputOutput", 4);
            }
        } while (true);
    }
}
