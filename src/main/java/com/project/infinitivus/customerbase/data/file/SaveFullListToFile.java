package com.project.infinitivus.customerbase.data.file;

import com.project.infinitivus.customerbase.service.work_with_person.Person;

import java.nio.file.Files;

/**
 * @author aals
 */
public class SaveFullListToFile extends CreateDirectoryAndFile {
    private final InsertFile insertFile = new InsertFile();

    public void checkingExistenceDirectory() {
        if (!Files.exists(CREATE_DIRECTORY_LIBRARY)) {
            createDirectory();
        } else {
            new ClearFile().clear();
        }
        saveFullListToFile();
    }

    private void saveFullListToFile() {
        for (int i = 1; i < Person.list.size(); i++) {
            insertFile.insert(i);
        }
    }
}
