package com.project.infinitivus.customerbase.service.settings.setting_program;

import com.project.infinitivus.customerbase.data.ChoosingStorageMethod;
import com.project.infinitivus.customerbase.service.settings.setting_db.SettingDB;
import com.project.infinitivus.customerbase.view.output.Localization;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author aals
 */
public class SettingProgram {
    //    final String LIBRARY_LINE_BACKUP = "src\\main\\java\\com\\project"
//            + "\\infinitivus\\customerbase\\data\\file\\library\\backup_copy.txt";
//     final Path LIBRARY_BACKUP = Paths.get(LIBRARY_LINE_BACKUP);
    final String SETTING_LINE_PROGRAM = "src\\main\\java\\com\\project"
            + "\\infinitivus\\customerbase\\logic\\system_file\\settingsProgram.txt";

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
        new ChoosingStorageMethod().choosingStorageMethod(optionSaving);
        if (optionSaving == 2) {
            new SettingDB().readSettingsDB();
        }
    }
}
