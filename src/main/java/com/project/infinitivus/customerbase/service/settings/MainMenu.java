package com.project.infinitivus.customerbase.service.settings;

import com.project.infinitivus.customerbase.service.settings.setting_program.NewSettingProgram;
import com.project.infinitivus.customerbase.service.work_with_person.*;
import com.project.infinitivus.customerbase.view.input.menu.MainMenuInput;
import com.project.infinitivus.customerbase.view.input.menu.MenuFullSaveList;
import com.project.infinitivus.customerbase.view.output.OutputInfoPerson;

/**
 * @author infinitivus
 */
public class MainMenu {
    int inputNumber;
    MainMenuInput inputMainMenu = new MainMenuInput();

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
                case 8:
                    new MenuFullSaveList().selectFullSaveList();
                    break;
                case 9:
                    new NewSettingProgram().newSettingProgram();
                    break;
            }
        } while (inputNumber != 0);
    }
}
