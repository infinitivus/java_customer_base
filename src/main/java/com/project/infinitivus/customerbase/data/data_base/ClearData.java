package com.project.infinitivus.customerbase.data.data_base;

import com.project.infinitivus.customerbase.data.IClear;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClearData implements IClear {
    private Connection dbConnection = null;
    private Statement statement = null;

    @Override
    public void clear() {

        try {
            dbConnection = ApplySettingDB.iSqlConnect.connect();
            statement = dbConnection.createStatement();
            String sql = "TRUNCATE TABLE " +ApplySettingDB.tableName  + ";";
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClearData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClearData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClearData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
