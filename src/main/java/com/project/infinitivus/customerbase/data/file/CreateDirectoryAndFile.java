package com.project.infinitivus.customerbase.data.file;

import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author infinitivus
 */
public class CreateDirectoryAndFile {
    public final Path CREATE_DIRECTORY_LIBRARY = Paths.get("src\\main\\java\\com"
            + "\\project\\infinitivus\\customerbase\\data\\file\\library");
    final String PERSON_LIBRARY_LINE = "src\\main\\java\\com\\project\\"
            + "infinitivus\\customerbase\\data\\file\\library\\person_list.txt";
    private final Path PERSON_LIBRARY = Paths.get(PERSON_LIBRARY_LINE);


    public void createDirectory() {
        IOutputMessage iOutputMessage = new OutputMessageColumn();
        try {
            if (!Files.exists(CREATE_DIRECTORY_LIBRARY)) {
                Files.createDirectories(CREATE_DIRECTORY_LIBRARY);
                iOutputMessage.outputMessage("createFile", 1);
                Files.createFile(PERSON_LIBRARY);
                iOutputMessage.outputMessage("createFile", 2);
            }
        } catch (IOException ex) {
            Logger.getLogger(CreateDirectoryAndFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
