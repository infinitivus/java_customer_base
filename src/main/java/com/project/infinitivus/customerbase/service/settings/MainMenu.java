package com.project.infinitivus.customerbase.service.settings;

import com.project.infinitivus.customerbase.service.work_with_person.*;
import com.project.infinitivus.customerbase.view.input.menu.InputMainMenu;
import com.project.infinitivus.customerbase.view.output.OutputInfoPerson;

/**
 * @author infinitivus
 */
public class MainMenu {
    int inputNumber;
    InputMainMenu inputMainMenu = new InputMainMenu();

    public void mainMenu() {
        do {
            inputNumber = inputMainMenu.inputNumberMenu();
            switch (inputNumber) {
                case 1:
                    new OutputInfoPerson().shortOutputListPerson();
                    break;
                case 2:
                    new OutputInfoPerson().longOutputListPerson();
                    break;
                case 3:
                    new CreatePerson().createPerson();
                    break;
                case 4:
                    new EditPerson().editDataPerson();
                    break;
                case 5:
                    new DeletePerson().deletePerson();
                    break;
                case 6:
                    new SearchPerson().searchPerson();
                    break;
                case 7:
                    new SortedPerson().menuSorted();
                    break;
                case 8: // Create File Print Person
                    break;
                case 9: // Settings
                    break;
            }
        } while (inputNumber != 0);
    }
}
