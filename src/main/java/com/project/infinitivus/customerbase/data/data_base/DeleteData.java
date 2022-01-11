package com.project.infinitivus.customerbase.data.data_base;

import com.project.infinitivus.customerbase.data.IDelete;
import com.project.infinitivus.customerbase.service.work_with_person.Person;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteData implements IDelete {
    private Connection dbConnection = null;
    private Statement statement = null;

    @Override
    public void delete() {
        InsertData insertData=new InsertData();
        try {
            dbConnection = ApplySettingDB.iSqlConnect.connect();
            statement = dbConnection.createStatement();
            statement.executeUpdate("DELETE FROM " + ApplySettingDB.tableName );
            for(int i=1;i< Person.list.size();i++){ 
                insertData.insert(i);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
