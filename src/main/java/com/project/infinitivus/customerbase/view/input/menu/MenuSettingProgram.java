package com.project.infinitivus.customerbase.view.input.menu;

import com.project.infinitivus.customerbase.view.input.InputInt;
import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

/**
 * @author infinitivus
 */
public class MenuSettingProgram {

    public int settingLanguage() {
        boolean outLanguage = true;
        int lang;
        do {
            System.out.println("Выберите язык(Select a language): \n1-Русский \n2-English");
           lang = new InputInt().inputInt();
            if (lang == 1 || lang == 2) {
                outLanguage = false;
            } else {
                System.out.println("Ошибка!(Error!). Введите цифру '1' или '2'");
            }
        } while (outLanguage);
        return lang;
    }

    public int settingOptionSave() {
        boolean outOptionSaving = true;
        IOutputMessage iOutputMessage = new OutputMessageColumn();
        int optionSave;
        do {
            iOutputMessage.outputMessage("optionSave", 1);
            optionSave = new InputInt().inputInt();
            if (optionSave == 1 || optionSave == 2) {
                outOptionSaving = false;
            } else {
                iOutputMessage.outputMessage("optionSave", 4);
            }
        } while (outOptionSaving);
        return optionSave;
    }
}
