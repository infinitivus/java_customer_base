package com.project.infinitivus.customerbase.data.file;

import com.project.infinitivus.customerbase.data.ISelect;
import com.project.infinitivus.customerbase.service.work_with_person.Person;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author infinitivus
 */
public class SelectFile extends CreateDirectoryAndFile implements ISelect {

    @Override
    public void select() {

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader
                (new File(PERSON_LIBRARY_LINE))))) {
            scanner.useDelimiter(":");
            while (scanner.hasNext()) {
                String surname = scanner.next();
                String name = scanner.next();
                String phone = scanner.next();
                String email = scanner.next();
                String birthday = scanner.next();
                String brand = scanner.next();
                String model = scanner.next();
                String vin = scanner.next();
                String year = scanner.next();
                String licensePlate = scanner.next();
                Person.list.add(new Person(surname, name, phone, email, birthday, brand, model, vin, year, licensePlate));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SelectFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
