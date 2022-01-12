package com.project.infinitivus.customerbase.data.data_base.connect;

import com.project.infinitivus.customerbase.data.data_base.ApplySettingDB;
import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author infinitivus
 */
public class PostgreSqlConnect implements IConnect {
    private Connection dbConnection = null;

//    jdbc:postgresql://localhost:5432/
//    postgres
//    admin

    @Override
    public Connection connect() {
        IOutputMessage iOutputMessage = new OutputMessageColumn();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            iOutputMessage.outputMessage("errorConnectivityDB", 1);
            Logger.getLogger(PostgreSqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            return dbConnection;
        }
        try {
            dbConnection = DriverManager.getConnection(ApplySettingDB.dbPath, ApplySettingDB.dbLogin, ApplySettingDB.dbPassword); //////////////
        } catch (SQLException ex) {
            iOutputMessage.outputMessage("errorConnectivityDB", 2);
            Logger.getLogger(PostgreSqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbConnection;
    }
}
