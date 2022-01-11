package com.project.infinitivus.customerbase.data.file;

import com.project.infinitivus.customerbase.data.IDelete;

public class DeleteFile implements IDelete {

    @Override
    public void delete() {
        new UpdateFile().update(0);
    }
}