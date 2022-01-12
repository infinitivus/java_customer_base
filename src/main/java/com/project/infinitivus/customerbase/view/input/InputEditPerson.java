package com.project.infinitivus.customerbase.view.input;

import com.project.infinitivus.customerbase.service.work_with_person.Person;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;
import com.project.infinitivus.customerbase.view.output.OutputTable;

/**
 * @author infinitivus
 */
public class InputEditPerson {
    private final OutputMessageColumn outputMessageColumn = new OutputMessageColumn();
    private final InputInt inputInt = new InputInt();


    public int inputNumberPerson() {
        OutputTable outputTable = new OutputTable();
        do {
            outputMessageColumn.outputMessage("inputEdit", 1);
            int numberEditPerson = inputInt.inputInt();
            if (numberEditPerson > 0 && numberEditPerson < Person.list.size()) {
                outputTable.longHeader();
                outputTable.outputNumberPerson(numberEditPerson);
                return numberEditPerson;
            } else {
                outputMessageColumn.outputMessage("errorInputOutput", 2);
            }
        } while (true);
    }

    public int inputNumberFieldPerson() {
        do {
            for (int i = 3; i < 13; i++) {
                outputMessageColumn.outputMessage("inputEdit", i);
            }
            outputMessageColumn.outputMessage("inputEdit", 2);
            int numberFieldPerson = inputInt.inputInt();
            if (numberFieldPerson > 0 && numberFieldPerson < 11) {
                return numberFieldPerson;
            } else {
                outputMessageColumn.outputMessage("errorInputOutput", 2);
            }
        } while (true);
    }
}
