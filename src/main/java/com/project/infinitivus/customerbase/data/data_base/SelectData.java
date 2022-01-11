package com.project.infinitivus.customerbase.data.data_base;

import com.project.infinitivus.customerbase.data.ISelect;
import com.project.infinitivus.customerbase.service.work_with_person.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectData implements ISelect {
    private Connection dbConnection = null;
    private Statement statement = null;

    @Override
    public void select() {
        try {
            dbConnection = ApplySettingDB.iSqlConnect.connect();
            statement = dbConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM " + ApplySettingDB.tableName + " ORDER BY id ASC");
            while (rs.next()) {
                String surName = rs.getString("SURNAME");
                String name = rs.getString("NAME");
                String phone = rs.getString("PHONE");
                String email = rs.getString("EMAIL");
                String birthday = rs.getString("BIRTHDAY");
                String brand = rs.getString("BRAND");
                String model = rs.getString("MODEL");
                String vin = rs.getString("VIN");
                String year = rs.getString("YEAR");
                String licensePlate = rs.getString("LICENSEPLATE");
                Person.list.add( new Person(surName, name, phone, email, birthday, brand, model, vin, year, licensePlate));
            }
        } catch (SQLException e) {
            Logger.getLogger(SelectData.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SelectData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SelectData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
