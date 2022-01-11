package com.project.infinitivus.customerbase.service.settings.setting_db;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

class SaveSettingDB extends SettingDB {

    void saveSettingDB(String dbType, String dbPath, String dbLogin, String dbPassword, String tableName) {
        try (RandomAccessFile random = new RandomAccessFile(SETTING_LINE_DB, "rw")) {
            random.seek(0);
            random.writeBytes(dbType + "\n");
            random.writeBytes(dbPath + "\n");
            random.writeBytes(dbLogin + "\n");
            random.writeBytes(dbPassword + "\n");
            random.writeBytes(tableName);
        } catch (IOException e) {
            Logger.getLogger(SaveSettingDB.class
                    .getName()).log(Level.SEVERE, null, e);
        }
    }
}
