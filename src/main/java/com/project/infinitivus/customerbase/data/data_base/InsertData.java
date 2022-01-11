package com.project.infinitivus.customerbase.data.data_base;

import com.project.infinitivus.customerbase.data.IInsert;
import com.project.infinitivus.customerbase.service.work_with_person.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertData implements IInsert {
    private Connection dbConnection = null;
    private Statement statement = null;

    @Override
    public void insert(int i) {
        try {
            dbConnection = ApplySettingDB.iSqlConnect.connect();
            String sql = "INSERT INTO " + ApplySettingDB.tableName + "(ID ,SURNAME, NAME ,PHONE ,EMAIL ,BIRTHDAY ,BRAND ,MODEL ,VIN ,YEAR ,LICENSEPLATE)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            preparedStatement.setInt(1, i);
            preparedStatement.setString(2, Person.list.get(i).getSurname());
            preparedStatement.setString(3, Person.list.get(i).getName());
            preparedStatement.setString(4, Person.list.get(i).getPhone());
            preparedStatement.setString(5, Person.list.get(i).getEmail());
            preparedStatement.setString(6, Person.list.get(i).getBirthday());
            preparedStatement.setString(7, Person.list.get(i).getBrand());
            preparedStatement.setString(8, Person.list.get(i).getModel());
            preparedStatement.setString(9, Person.list.get(i).getVin());
            preparedStatement.setString(10, Person.list.get(i).getYear());
            preparedStatement.setString(11, Person.list.get(i).getLicensePlate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
