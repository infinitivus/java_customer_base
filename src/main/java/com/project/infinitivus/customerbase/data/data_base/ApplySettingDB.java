package com.project.infinitivus.customerbase.data.data_base;

import com.project.infinitivus.customerbase.data.data_base.connect.MySqlConnect;
import com.project.infinitivus.customerbase.data.data_base.connect.PostgreSqlConnect;
import com.project.infinitivus.customerbase.data.data_base.connect.IConnect;

public class ApplySettingDB {
    static IConnect iSqlConnect;
    private static String dbType;
    public static String dbPath;
    public static String dbLogin;
    public static String dbPassword;
    static String tableName;

    public ApplySettingDB(String dbType, String dbPath, String dbLogin, String dbPassword, String tableName) {
        ApplySettingDB.dbType = dbType;
        ApplySettingDB.dbPath = dbPath;
        ApplySettingDB.dbLogin = dbLogin;
        ApplySettingDB.dbPassword = dbPassword;
        ApplySettingDB.tableName = tableName;
        iSqlConnect = selectDB();
    }

    private IConnect selectDB() {
        if (dbType.equals("1")) {
            iSqlConnect = new MySqlConnect();
        } else {
            iSqlConnect = new PostgreSqlConnect();
        }
        return iSqlConnect;
    }
}
