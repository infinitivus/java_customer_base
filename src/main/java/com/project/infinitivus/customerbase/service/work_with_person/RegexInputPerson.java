package com.project.infinitivus.customerbase.service.work_with_person;

/**
 *
 * @author infinitivus
 */
public class RegexInputPerson {

    public boolean regexSurName(String surName) {
        return  surName.matches("^([А-Яа-яЁё]|[A-Za-z]){3,15}$");
    }

    public boolean regexName(String name) {return name.matches("^[A-Za-zА-Яа-яёЁ]{3,15}\\s?([A-Za-zА-Яа-яёЁ]{3,15})?$"); }

    public boolean regexPhone(String phone) { return phone.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$"); }

    public boolean regexEmail(String email) { return email.matches("^(\\w+@\\w+\\.(com|ru))?$"); }

    public boolean regexBirthday(String birthday) { return  birthday.matches("^((0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)\\d\\d))?$");}

    public boolean regexBrand(String brand) { return brand.matches("^([A-Za-zА-Яа-яёЁ]{3,10}\\s?([A-Za-zА-Яа-яёЁ]{3,10})?)?$");}

    public boolean regexModel(String model) { return model.matches("^([A-Za-zА-Яа-яёЁ]{3,10}\\s?([A-Za-zА-Яа-яёЁ]{3,10})?)?$");}

    public boolean regexVin(String vin) { return vin.matches("^([a-zA-Z0-9]{15,30})?$");}

    public boolean regexYear(String year) { return year.matches("^((19|20)[0-9][0-9])?$");}

    public boolean regexLicensePlate(String licensePlate) { return licensePlate.matches("^([a-zA-Z0-9А-Яа-я]{3,10})?$");}

}
