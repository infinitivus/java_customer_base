package com.project.infinitivus.customerbase.service.settings.setting_db;

import com.project.infinitivus.customerbase.data.data_base.CreateSchemaAndTable;
import com.project.infinitivus.customerbase.view.input.menu.MenuSettingDB;

/**
 * @author infinitivus
 */

public class NewSettingDB extends SettingDB {
    private final CreateSchemaAndTable createSchemaAndTable = new CreateSchemaAndTable();

    public void getSettingDB() {
        MenuSettingDB menuSettingDB = new MenuSettingDB();
        String dbType = menuSettingDB.typeDB("settingDB", 1);
        String dbPath = menuSettingDB.settingDB("settingDB", 2);
        String dbLogin = menuSettingDB.settingDB("settingDB", 3);
        String dbPassword = menuSettingDB.settingDB("settingDB", 4);
        String schemaName = menuSettingDB.settingDB("settingDB", 5);
        String tableName = menuSettingDB.settingDB("settingDB", 6);
        transmissionSettingDB(dbType, dbPath, dbLogin, dbPassword, schemaName, tableName);
    }

    private void transmissionSettingDB(String dbType, String dbPath, String dbLogin,
                                       String dbPassword, String schemaName, String tableName) {
        dataTransmission(dbType, dbPath, dbLogin, dbPassword, tableName);
        dbPath = createSchemaDB(dbPath, schemaName);
        dataTransmission(dbType, dbPath, dbLogin, dbPassword, tableName);
        createTableDB();
        new SaveSettingDB().saveSettingDB(dbType, dbPath, dbLogin, dbPassword, tableName);
    }

    private String createSchemaDB(String dbPath, String schemaName) {
        createSchemaAndTable.createSchema(schemaName);
        dbPath = dbPath + schemaName;
        return dbPath;
    }

    private void createTableDB() {
        createSchemaAndTable.createTable();
    }
}
