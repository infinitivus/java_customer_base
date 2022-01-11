package com.project.infinitivus.customerbase.service.work_with_person;


import com.project.infinitivus.customerbase.data.ChoosingStorageMethod;
import com.project.infinitivus.customerbase.view.input.InputDataPerson;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;
import com.project.infinitivus.customerbase.view.output.OutputTable;

/**
 * @author Infinitivus
 */
public class CreatePerson {
    private InputDataPerson dataPerson = new InputDataPerson();
    private OutputTable outputTable = new OutputTable();
    private OutputMessageColumn outputMessageColumn = new OutputMessageColumn();

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
            ChoosingStorageMethod.iInsert.insert(i);    /////////////////////////////////////////
        }).start();
    }
}


//    }
//    private void threadInsert() {
//        new Thread(() -> {
//            int i = Person.list.size()-1;
//            if (Settings.optionSaving.equals("1")) {
//                new SaveToFile().savePersonToFile(i);
//            } else {
//                 new SqlMethods().insertRows(i);
//            }
//        }
//        ).start();
//    }


//
//    PatternInputPerson patternPerson = new PatternInputPerson();
//    String surName, name, phone, email, birthday, brand, model, vin, year, licensePlate;
//    
//    public void inputCreatePerson() {
//        
//        System.out.println(Localization.inputPersonArray[0]);
//        do {
//            surName = InputData.inputString();
//        } while (!patternPerson.patternSurName(surName));
//        
//        System.out.println(Localization.inputPersonArray[1]);
//        do {
//            name = InputData.inputString();
//        } while (!patternPerson.patternName(name));
//        
//        System.out.println(Localization.inputPersonArray[2]);
//        do {
//            phone = InputData.inputString();
//        } while (!patternPerson.patternPhone(phone));
//        
//        System.out.println(Localization.inputPersonArray[3]);
//        do {
//            email = InputData.inputString();
//        } while (!patternPerson.patternEmail(email));
//        
//        System.out.println(Localization.inputPersonArray[4]);
//        do {
//            birthday = InputData.inputString();
//        } while (!patternPerson.patternBirthday(birthday));
//        
//        System.out.println(Localization.inputPersonArray[5]);
//        do {
//            brand = InputData.inputString();
//        } while (!patternPerson.patternBrand(brand));
//        
//        System.out.println(Localization.inputPersonArray[6]);
//        do {
//            model = InputData.inputString();
//        } while (!patternPerson.patternModel(model));
//        
//        System.out.println(Localization.inputPersonArray[7]);
//        do {
//            vin = InputData.inputString();
//        } while (!patternPerson.patternVin(vin));
//        
//        System.out.println(Localization.inputPersonArray[8]);
//        do {
//            year = InputData.inputString();
//        } while (!patternPerson.patternYear(year));
//        
//        System.out.println(Localization.inputPersonArray[9]);
//        do {
//            licensePlate = InputData.inputString();
//        } while (!patternPerson.patternLicensePlate(licensePlate));
//    }

//    private void outputCreatePerson() {
//        System.out.println(DODDEDLINE + "\n" + Localization.message[0] + DODDEDLINE);
//        System.out.format(HEADER);
//        System.out.println("\n" + DODDEDLINE);
//        System.out.println(Person.list.size() - 1 + ". " + Person.list.get(Person.list.size() - 1));
//        System.out.println(DODDEDLINE);
//    }

//    public void saveNewPerson() {
//        Person inputPerson = new Person(surName, name, phone, email, birthday, brand, model, vin, year, licensePlate);
//        Person.list.add(inputPerson);
//    }
//    
//    public void mainCreatePerson() {
//        inputCreatePerson();
//        saveNewPerson();
//        threadInsert();
//        outputCreatePerson();
//    }
//    
//    private void threadInsert() {
//        new Thread(() -> {
//            int i = Person.list.size()-1;
//            if (Settings.optionSaving.equals("1")) {
//                new SaveToFile().savePersonToFile(i);
//            } else {
//                 new SqlMethods().insertRows(i);
//            }
//        } 
//        ).start();
//    }
//}
