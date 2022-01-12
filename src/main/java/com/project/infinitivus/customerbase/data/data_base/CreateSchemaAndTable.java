package com.project.infinitivus.customerbase.data.data_base;

import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author infinitivus
 */
public class CreateSchemaAndTable {
    private Connection dbConnection = null;
    private Statement statement = null;
    private final IOutputMessage iOutputMessage = new OutputMessageColumn();
    private String sql;

    public void createSchema(String dbName) {
        try {
            iOutputMessage.outputMessage("connectivityDB", 1);
            dbConnection = ApplySettingDB.iSqlConnect.connect(); /////////////////////////////////////////
            statement = dbConnection.createStatement();
             sql = "CREATE DATABASE " + dbName;
            statement.executeUpdate(sql);
            iOutputMessage.outputMessage("connectivityDB", 2);
        } catch (SQLException ex) {
            Logger.getLogger(CreateSchemaAndTable.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnect();
        }
    }

    public void createTable() {
        try {
            iOutputMessage.outputMessage("connectivityDB", 3);

            dbConnection = ApplySettingDB.iSqlConnect.connect(); //////////////////////////////////////////////
            sql = "CREATE TABLE " + ApplySettingDB.tableName ///////////////////////////////////////
                    + "(id INT NOT NULL , "
                    + " SURNAME VARCHAR(15) NOT NULL, "
                    + " NAME VARCHAR(31) NOT NULL, "
                    + " PHONE VARCHAR(15) NOT NULL, "
                    + " EMAIL VARCHAR (20), "
                    + " BIRTHDAY VARCHAR(10), "
                    + " BRAND VARCHAR(20), "
                    + " MODEL VARCHAR(20), "
                    + " VIN VARCHAR(30), "
                    + " YEAR VARCHAR (4), "
                    + " LICENSEPLATE VARCHAR(10)) ";
            statement = dbConnection.createStatement();
            statement.executeUpdate(sql);
            iOutputMessage.outputMessage("connectivityDB", 4);
//
        } catch (SQLException ex) {
            Logger.getLogger(CreateSchemaAndTable.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnect();
        }
    }

    private void closeConnect() {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(CreateSchemaAndTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (dbConnection != null) {
            try {
                dbConnection.close();
            } catch (SQLException ex) {
                Logger.getLogger(CreateSchemaAndTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
