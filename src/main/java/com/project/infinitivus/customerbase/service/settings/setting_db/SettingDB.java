package com.project.infinitivus.customerbase.service.settings.setting_db;

import com.project.infinitivus.customerbase.data.ChoosingStorageMethod;
import com.project.infinitivus.customerbase.data.data_base.ApplySettingDB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author aals
 */
public class SettingDB {

    final String SETTING_LINE_DB = "src\\main\\java\\com\\project"
            + "\\infinitivus\\customerbase\\service\\system_file\\settingsDB.txt";

    public void readSettingsDB() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SETTING_LINE_DB))) {
            String dbType = reader.readLine();
            String dbPath = reader.readLine();
            String dbLogin = reader.readLine();
            String dbPassword = reader.readLine();
            String tableName = reader.readLine();
            dataTransmission(dbType, dbPath, dbLogin, dbPassword, tableName);
            ChoosingStorageMethod.iSelect.select();
        } catch (IOException e) {
            Logger.getLogger(SettingDB.class
                    .getName()).log(Level.SEVERE, null, e);
        }
    }

    void dataTransmission(String dbType, String dbPath, String dbLogin, String dbPassword, String tableName) {
        new ApplySettingDB(dbType, dbPath, dbLogin, dbPassword, tableName);
    }
}
