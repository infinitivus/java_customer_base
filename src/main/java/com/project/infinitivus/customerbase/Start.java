package com.project.infinitivus.customerbase;

import com.project.infinitivus.customerbase.service.settings.FirstStart;
import com.project.infinitivus.customerbase.service.settings.MainMenu;
import com.project.infinitivus.customerbase.service.settings.setting_program.SettingProgram;
import com.project.infinitivus.customerbase.service.work_with_person.Person;
import com.project.infinitivus.customerbase.view.input.security.SecurityComparePassword;

/**
 * @author infinitivus
 */
public class Start {

    public static void main(String[] args) {
        new FirstStart().firstStart();
        new SettingProgram().readSettingsProgram();
        new SecurityComparePassword().comparePassword();
        new MainMenu().mainMenu();
    }
}
