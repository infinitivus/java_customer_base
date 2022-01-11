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
        Person person = new Person("Infinitivus", "Alex", "89104378665", "aals@ya.ru", "21.02.1975", "", "", "", "", "");
        Person.list.add(person);
        new FirstStart().firstStart();
        new SettingProgram().readSettingsProgram();
        new SecurityComparePassword().comparePassword();
        new MainMenu().mainMenu();

//        Settings set=new Settings();
//        set.firstLaunch();
//        Person.list.clear();
//        if (set.optionSaving.equals("1")) {
//          new ReadingFile().readFilePersonList();
//        } else {
//            new SqlMethods().selectData();
//        }
//        new Menu().menuPerson();
    }
}
