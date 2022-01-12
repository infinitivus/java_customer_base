package com.project.infinitivus.customerbase.service.work_with_person;

import com.project.infinitivus.customerbase.data.ChoosingStorage;
import com.project.infinitivus.customerbase.view.input.InputDeletePerson;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

/**
 *
 * @author Infinitivus
 */
public class DeletePerson {
    private final InputDeletePerson inputDeletePerson = new InputDeletePerson();
    private final OutputMessageColumn outputMessageColumn = new OutputMessageColumn();

    public void deletePerson() {
        int personDelete = inputDeletePerson.inputDeletePerson();
            Person.list.remove(personDelete);
            threadInsert();
            outputMessageColumn.outputMessage("inputDelete", 3);
    }

    private void threadInsert() {
        new Thread(() -> {
            ChoosingStorage.iDelete.delete();    /////////////////////////////////////////
        }).start();
    }
}

