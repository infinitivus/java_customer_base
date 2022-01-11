package com.project.infinitivus.customerbase.service.work_with_person;

/**
 * @author infinitivus
 */

import com.project.infinitivus.customerbase.view.output.OutputInfoPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    public static List<Person> list = new ArrayList<>();
    private String surname;
    private String name;
    private String phone;
    private String email;
    private String birthday;
    private String brand;
    private String model;
    private String vin;
    private String year;
    private String licensePlate;

    public Person(String surname, String name, String phone, String email,
                  String birthday, String brand, String model, String vin, String year,
                  String licensePlate) {
        this.surname = surname;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format(new OutputInfoPerson().SPECIFIER, surname, name, phone, email,
                birthday, brand, model, vin, year, licensePlate);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.surname);
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.phone);
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.birthday);
        hash = 59 * hash + Objects.hashCode(this.brand);
        hash = 59 * hash + Objects.hashCode(this.model);
        hash = 59 * hash + Objects.hashCode(this.vin);
        hash = 59 * hash + Objects.hashCode(this.year);
        hash = 59 * hash + Objects.hashCode(this.licensePlate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.birthday, other.birthday)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.vin, other.vin)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        if (!Objects.equals(this.licensePlate, other.licensePlate)) {
            return false;
        }
        return true;
    }
}