package com.project.infinitivus.customerbase.view.input;

import com.project.infinitivus.customerbase.service.work_with_person.Person;
import com.project.infinitivus.customerbase.view.input.choose_from_two.IChooseFromTwo;
import com.project.infinitivus.customerbase.view.input.choose_from_two.InputYesOrNo;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;
import com.project.infinitivus.customerbase.view.output.OutputTable;

/**
 * @author infinitivus
 */
public class InputDeletePerson {
    private final InputInt numberDeletePerson = new InputInt();
    private final OutputMessageColumn outputMessageColumn = new OutputMessageColumn();
    private final IChooseFromTwo chooseDelete = new InputYesOrNo();
    private final OutputTable outputTable = new OutputTable();

    public int inputDeletePerson() {
        int numberDelete;
        boolean outDelete = true;
        do {
            outputMessageColumn.outputMessage("inputDelete", 1);
            numberDelete = numberDeletePerson.inputInt();
            if (numberDelete > 0 && numberDelete < Person.list.size()) {
                outDelete = false;
            } else {
                outputMessageColumn.outputMessage("errorInputOutput",2);
            }
        } while (outDelete);
        outputTable.longHeader();
        outputTable.outputNumberPerson(numberDelete);
        boolean result = chooseDelete.choose("inputDelete", 2);
        if (result) {
            return numberDelete;
        } else {
            return -1;
        }
    }
}
