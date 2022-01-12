package com.project.infinitivus.customerbase.service.work_with_person;

import com.project.infinitivus.customerbase.data.ChoosingStorage;
import com.project.infinitivus.customerbase.view.input.InputDataPerson;
import com.project.infinitivus.customerbase.view.input.InputEditPerson;
import com.project.infinitivus.customerbase.view.input.choose_from_two.IChooseFromTwo;
import com.project.infinitivus.customerbase.view.input.choose_from_two.InputYesOrNo;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;
import com.project.infinitivus.customerbase.view.output.OutputTable;

/**
 * @author infinitivus
 */
public class EditPerson {

    public void editDataPerson() {
        boolean continueEditPerson;
       IChooseFromTwo iChooseFromTwo=new InputYesOrNo();
        OutputTable outputTable=new OutputTable();
        OutputMessageColumn outputMessageColumn=new OutputMessageColumn();
        InputEditPerson inputEditPerson = new InputEditPerson();
        InputDataPerson inputDataPerson = new InputDataPerson();
        int numberPerson = inputEditPerson.inputNumberPerson(); // получаем номер редактируемой записи
        do {
            int numberFieldPerson = inputEditPerson.inputNumberFieldPerson(); // получаем номер редактируемого поля
            String valueFieldPerson = inputDataPerson.inputData(numberFieldPerson);// получаем новое значение редактируемого поля
            switch (numberFieldPerson) {
                case 1:
                    Person.list.get(numberPerson).setSurname(valueFieldPerson);
                    break;
                case 2:
                    Person.list.get(numberPerson).setName(valueFieldPerson);
                    break;
                case 3:
                    Person.list.get(numberPerson).setPhone(valueFieldPerson);
                    break;
                case 4:
                    Person.list.get(numberPerson).setEmail(valueFieldPerson);
                    break;
                case 5:
                    Person.list.get(numberPerson).setBirthday(valueFieldPerson);
                    break;
                case 6:
                    Person.list.get(numberPerson).setBrand(valueFieldPerson);
                    break;
                case 7:
                    Person.list.get(numberPerson).setModel(valueFieldPerson);
                    break;
                case 8:
                    Person.list.get(numberPerson).setVin(valueFieldPerson);
                    break;
                case 9:
                    Person.list.get(numberPerson).setYear(valueFieldPerson);
                    break;
                case 10:
                    Person.list.get(numberPerson).setLicensePlate(valueFieldPerson);
                    break;
            }
            threadInsert(numberPerson);
            outputMessageColumn.outputMessage("inputEdit",14); // Вывод сооющения- запись отредактирована
            outputTable.longHeader();// Вывод шапки таблицы
            outputTable.outputNumberPerson(numberPerson); //Вывод отредактированного Person
            continueEditPerson= iChooseFromTwo.choose("inputEdit",15); // boolean method(y or n)- хотите далее редактировать эту запись?
        }while(continueEditPerson);
    }

    private void threadInsert(int numberPerson) {
        new Thread(() -> {
            ChoosingStorage.iUpdate.update(numberPerson);   /////////////////////////////////////////
        }).start();
    }
}




