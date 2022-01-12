package com.project.infinitivus.customerbase.service.work_with_person;


import com.project.infinitivus.customerbase.data.ChoosingStorage;
import com.project.infinitivus.customerbase.view.input.InputDataPerson;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;
import com.project.infinitivus.customerbase.view.output.OutputTable;

/**
 * @author Infinitivus
 */
public class CreatePerson {
    private final InputDataPerson dataPerson = new InputDataPerson();
    private final OutputTable outputTable = new OutputTable();
    private final OutputMessageColumn outputMessageColumn = new OutputMessageColumn();

    public void createPerson() {
        String surname = dataPerson.inputData(1);
        String name = dataPerson.inputData(2);
        String phone = dataPerson.inputData(3);
        String email = dataPerson.inputData(4);
        String birthday = dataPerson.inputData(5);
        String brand = dataPerson.inputData(6);
        String model = dataPerson.inputData(7);
        String vin = dataPerson.inputData(8);
        String year = dataPerson.inputData(9);
        String licensePlate = dataPerson.inputData(10);
        Person.list.add(new Person(surname, name, phone, email, birthday, brand, model, vin, year, licensePlate));
        threadInsert();
        outputTable.longHeader();
        outputTable.outputNumberPerson(Person.list.size() - 1);
        outputMessageColumn.outputMessage("inputPerson", 11);
    }

    private void threadInsert() {
        new Thread(() -> {
            int i = Person.list.size() - 1;
            ChoosingStorage.iInsert.insert(i);
        }).start();
    }
}
