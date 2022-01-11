package com.project.infinitivus.customerbase.service.work_with_person;

import com.project.infinitivus.customerbase.view.input.menu.MenuSortedPerson;
import com.project.infinitivus.customerbase.view.output.OutputInfoPerson;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author infinitivus
 */
public class SortedPerson {

    private void sortingBySurName() {
        Person.list = Person.list.stream()
                .sorted(Comparator.comparing(Person::getSurname))
                .collect(Collectors.toList());
    }

    private void sortingByName() {
        Person.list = Person.list.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
    }

    private void sortingByBrand() {
        Person.list = Person.list.stream()
                .sorted(Comparator.comparing(Person::getBrand))
                .collect(Collectors.toList());
    }

    private void sortingByYear() {
        Person.list = Person.list.stream()
                .sorted(Comparator.comparing(Person::getYear))
                .collect(Collectors.toList());
    }

    public void menuSorted() {
        int sortedMenu = new MenuSortedPerson().inputSortedPerson();
        switch (sortedMenu) {
            case 1:
                sortingBySurName();
                break;
            case 2:
                sortingByName();
                break;
            case 3:
                sortingByBrand();
                break;
            case 4:
                sortingByYear();
        }
        new OutputMessageColumn().outputMessage("sortingMenu",6);
        new OutputInfoPerson().longOutputListPerson();
    }
}
