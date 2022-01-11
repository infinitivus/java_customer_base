package com.project.infinitivus.customerbase.data.file;

import com.project.infinitivus.customerbase.data.IClear;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClearFile extends CreateDirectoryAndFile implements IClear {

    public void clear() {
        try {
            FileChannel.open(Paths.get(PERSON_LIBRARY_LINE), StandardOpenOption.WRITE).truncate(0).close();
        } catch (IOException ex) {
            Logger.getLogger(ClearFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
