package com.project.infinitivus.customerbase.view.input.menu;

import com.project.infinitivus.customerbase.view.input.InputInt;
import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

/**
 * @author infinitivus
 */
public class InputMainMenu {

    public int inputNumberMenu() {
        IOutputMessage mainMenu = new OutputMessageColumn();
        do {
            mainMenu.outputMessage("mainMenu", 12);
            for (int i = 1; i <= 11; i++) {
                mainMenu.outputMessage("mainMenu", i);
            }
            int inputNumberMenu = new InputInt().inputInt();
            if (inputNumberMenu >= 0 && inputNumberMenu <= 9) {
                return inputNumberMenu;
            } else {
                mainMenu.outputMessage("mainMenu", 13);
            }
        } while (true);
    }
}
