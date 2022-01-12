package com.project.infinitivus.customerbase.data.file;

import com.project.infinitivus.customerbase.data.IInsert;
import com.project.infinitivus.customerbase.service.work_with_person.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author infinitivus
 */
public class InsertFile extends CreateDirectoryAndFile implements IInsert {

    @Override
    public void insert(int numRec) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PERSON_LIBRARY_LINE, true))) {
            writer.write(Person.list.get(numRec).getSurname() + ":"
                    + Person.list.get(numRec).getName() + ":"
                    + Person.list.get(numRec).getPhone() + ":"
                    + Person.list.get(numRec).getEmail() + ":"
                    + Person.list.get(numRec).getBirthday() + ":"
                    + Person.list.get(numRec).getBrand() + ":"
                    + Person.list.get(numRec).getModel() + ":"
                    + Person.list.get(numRec).getVin() + ":"
                    + Person.list.get(numRec).getYear() + ":"
                    + Person.list.get(numRec).getLicensePlate() + ":");
        } catch (IOException ex) {
            Logger.getLogger(InsertFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
