package com.project.infinitivus.customerbase.service.settings;

import com.project.infinitivus.customerbase.service.settings.setting_program.NewSettingProgram;
import com.project.infinitivus.customerbase.service.settings.setting_program.SettingProgram;
import com.project.infinitivus.customerbase.service.work_with_person.Person;
import com.project.infinitivus.customerbase.view.input.security.SecurityInputPassword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author infinitivus
 */
public class FirstStart extends SettingProgram {

    private final Path CREATE_DIRECTORY_SYSTEM = Paths.get("src\\main\\java\\com"
            + "\\project\\infinitivus\\customerbase\\service\\system_file");

    public void firstStart() {
        try {
            if (!Files.exists(CREATE_DIRECTORY_SYSTEM)) {
                Files.createDirectories(CREATE_DIRECTORY_SYSTEM);
                new NewSettingProgram().newSettingProgram();
                new SecurityInputPassword().createPassword();
            }
        } catch (
                IOException e) {
            Logger.getLogger(FirstStart.class
                    .getName()).log(Level.SEVERE, null, e);
        }
    }
}

