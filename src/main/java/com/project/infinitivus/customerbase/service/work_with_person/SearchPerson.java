package com.project.infinitivus.customerbase.service.work_with_person;


import com.project.infinitivus.customerbase.view.input.InputSearchPerson;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;
import com.project.infinitivus.customerbase.view.output.OutputTable;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author infinitivus
 */
public class SearchPerson {

    private List<Person> searchList;

    public void searchPerson() {
        String recordToSearch = new InputSearchPerson().searchPerson();
        searchList = Person.list.stream()
                .filter(per -> per.getName().equalsIgnoreCase(recordToSearch)
                        || per.getSurname().equalsIgnoreCase(recordToSearch)
                        || per.getPhone().equalsIgnoreCase(recordToSearch)
                        || per.getEmail().equalsIgnoreCase(recordToSearch)
                        || per.getBirthday().equalsIgnoreCase(recordToSearch)
                        || per.getBrand().equalsIgnoreCase(recordToSearch)
                        || per.getModel().equalsIgnoreCase(recordToSearch)
                        || per.getVin().equalsIgnoreCase(recordToSearch)
                        || per.getYear().equalsIgnoreCase(recordToSearch)
                        || per.getLicensePlate().equalsIgnoreCase(recordToSearch))
                .collect(Collectors.toList());
        outputSearchPerson();
    }

    private void outputSearchPerson() {
        OutputMessageColumn outputMessageColumn = new OutputMessageColumn();
        OutputTable outputTable = new OutputTable();
        if (searchList.isEmpty()) {
            outputMessageColumn.outputMessage("inputSearch", 2);
        } else {
            outputMessageColumn.outputMessage("inputSearch", 3);
            for (int i = 1; i < Person.list.size(); i++) {
                for (Person person : searchList) {
                    if (Person.list.get(i).equals(person)) {
                        outputTable.longHeader();
                        outputTable.outputNumberPerson(i);
                    }
                }
            }
        }
    }
}
