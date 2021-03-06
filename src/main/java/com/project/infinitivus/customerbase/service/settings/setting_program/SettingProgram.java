package com.project.infinitivus.customerbase.service.settings.setting_program;

import com.project.infinitivus.customerbase.data.ChoosingStorage;
import com.project.infinitivus.customerbase.service.settings.setting_db.SettingDB;
import com.project.infinitivus.customerbase.service.work_with_person.Person;
import com.project.infinitivus.customerbase.view.input.security.SecurityComparePassword;
import com.project.infinitivus.customerbase.view.output.Localization;
import com.project.infinitivus.customerbase.view.output.OutputInfoSetting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author aals
 */
public class SettingProgram {

    final String SETTING_LINE_PROGRAM = "src\\main\\java\\com\\project"
            + "\\infinitivus\\customerbase\\service\\system_file\\settingsProgram.txt";

    private int optionSaving;
    private int language;

    public void readSettingsProgram() {
        try (Scanner scanner = new Scanner(new File(SETTING_LINE_PROGRAM))) {
            language = scanner.nextInt();
            optionSaving = scanner.nextInt();
            applySetting();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SettingProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void applySetting() {
        new Localization().installationLanguage(language);
        new ChoosingStorage().choosingStorageMethod(optionSaving);
        new SecurityComparePassword().comparePassword();
        new OutputInfoSetting().OutputSettingProgram(optionSaving);
        Person person = new Person("Infinitivus", "Alex", "89104378665", "aals@ya.ru", "", "", "", "", "", "");
        Person.list.add(person);
        if (optionSaving == 2) {
            new SettingDB().readSettingsDB();
        }
        ChoosingStorage.iSelect.select();
    }
}
