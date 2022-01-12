package com.project.infinitivus.customerbase.data.data_base;

import com.project.infinitivus.customerbase.data.IUpdate;
import com.project.infinitivus.customerbase.service.work_with_person.Person;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author infinitivus
 */
public class UpdateData implements IUpdate {
    private Connection dbConnection = null;
    private final Statement statement = null;

    @Override
    public void update(int i) {
        try {
            dbConnection = ApplySettingDB.iSqlConnect.connect();
            String sql = "UPDATE " + ApplySettingDB.tableName + " SET SURNAME=?, NAME=? "
                    + ",PHONE=? ,EMAIL=? ,BIRTHDAY=? ,BRAND=? ,MODEL=? ,VIN=? ,YEAR=? ,LICENSEPLATE=? WHERE ID=" + i;
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            preparedStatement.setString(1, Person.list.get(i).getSurname());
            preparedStatement.setString(2, Person.list.get(i).getName());
            preparedStatement.setString(3, Person.list.get(i).getPhone());
            preparedStatement.setString(4, Person.list.get(i).getEmail());
            preparedStatement.setString(5, Person.list.get(i).getBirthday());
            preparedStatement.setString(6, Person.list.get(i).getBrand());
            preparedStatement.setString(7, Person.list.get(i).getModel());
            preparedStatement.setString(8, Person.list.get(i).getVin());
            preparedStatement.setString(9, Person.list.get(i).getYear());
            preparedStatement.setString(10, Person.list.get(i).getLicensePlate());
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
