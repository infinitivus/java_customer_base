package com.project.infinitivus.customerbase.service.settings.setting_program;

import com.project.infinitivus.customerbase.data.ChoosingStorage;
import com.project.infinitivus.customerbase.data.file.CreateDirectoryAndFile;
import com.project.infinitivus.customerbase.service.settings.setting_db.NewSettingDB;
import com.project.infinitivus.customerbase.view.input.menu.MenuSettingProgram;
import com.project.infinitivus.customerbase.view.output.Localization;

/**
 * @author infinitivus
 */

public class NewSettingProgram {

    public void newSettingProgram() {
        MenuSettingProgram menuSettingProgram = new MenuSettingProgram();
        int lang = menuSettingProgram.settingLanguage();
        new Localization().installationLanguage(lang);
        int optionSave = menuSettingProgram.settingOptionSave();
        new ChoosingStorage().choosingStorageMethod(optionSave);
        new SaveSettingProgram().saveSettingProgram(lang, optionSave);
        if (optionSave == 1) {
            new CreateDirectoryAndFile().createDirectory();
        } else {
            new NewSettingDB().getSettingDB();
        }
    }
}
