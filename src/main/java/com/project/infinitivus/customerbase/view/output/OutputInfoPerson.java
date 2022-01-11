package com.project.infinitivus.customerbase.view.output;

import com.project.infinitivus.customerbase.service.work_with_person.Person;

/**
 * @author infinitivus
 */
public class OutputInfoPerson extends OutputTable {

    public void longOutputListPerson() {
        longHeader();
        for (int i = 1; i < Person.list.size(); i++) {
            outputNumberPerson(i);
        }
    }

    public void shortOutputListPerson() {
        shortHeader();
        for (int i = 1; i < Person.list.size(); i++) {
            System.out.printf(i + ". " + SHORT_SPECIFIER,
                    Person.list.get(i).getSurname(),
                    Person.list.get(i).getName(),
                    Person.list.get(i).getPhone(),
                    Person.list.get(i).getEmail(),
                    Person.list.get(i).getBirthday());
            System.out.println(SHORT_DODDEDLINE);
        }
    }
}
