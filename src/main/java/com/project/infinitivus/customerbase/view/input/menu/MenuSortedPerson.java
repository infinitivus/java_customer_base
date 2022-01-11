package com.project.infinitivus.customerbase.view.input.menu;

import com.project.infinitivus.customerbase.view.input.InputInt;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

public class MenuSortedPerson {

    public int inputSortedPerson() {
        OutputMessageColumn outputMessageColumn = new OutputMessageColumn();
        InputInt inputInt = new InputInt();
        do {
            outputMessageColumn.outputMessage("sortingMenu", 1);
            for (int i = 2; i < 6; i++) {
                outputMessageColumn.outputMessage("sortingMenu", i);
            }
            int sortedNumber = inputInt.inputInt();
            if (sortedNumber > 0 && sortedNumber < 5) {
                return sortedNumber;
            } else {
                outputMessageColumn.outputMessage("errorInputOutput",3 );
            }
        } while (true);
    }
}
