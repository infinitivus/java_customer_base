package com.project.infinitivus.customerbase.data.data_base;

import com.project.infinitivus.customerbase.service.settings.setting_db.NewSettingDB;
import com.project.infinitivus.customerbase.service.settings.setting_db.SettingDB;
import com.project.infinitivus.customerbase.service.work_with_person.Person;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author aals
 */
public class SaveFullListToDB extends SettingDB {
    private final Path SETTING_DB= Paths.get(SETTING_LINE_DB);
    private final InsertData insertData = new InsertData();

    public void checkingExistenceDB() {
        if(!Files.exists(SETTING_DB)){
            new NewSettingDB().getSettingDB();
        }else{
            new SettingDB().readSettingsDB();
            new ClearData().clear();
        }
        saveFullListToDB();
    }

    private void saveFullListToDB() {
        for (int i = 1; i < Person.list.size(); i++) {
            insertData.insert(i);
        }
    }
}
