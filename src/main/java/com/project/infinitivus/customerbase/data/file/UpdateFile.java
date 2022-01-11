package com.project.infinitivus.customerbase.data.file;

import com.project.infinitivus.customerbase.data.IUpdate;
import com.project.infinitivus.customerbase.service.work_with_person.Person;

public class UpdateFile extends CreateDirectoryAndFile implements IUpdate {
    @Override
    public void update(int notUsed) {
        new ClearFile().clear();
        for (int i = 1; i < Person.list.size(); i++) {
            new InsertFile().insert(i);
        }
    }
}
