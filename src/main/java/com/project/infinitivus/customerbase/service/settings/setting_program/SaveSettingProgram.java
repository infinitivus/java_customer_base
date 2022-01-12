package com.project.infinitivus.customerbase.service.settings.setting_program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author infinitivus
 */
class SaveSettingProgram extends SettingProgram {
    void saveSettingProgram(int language, int optionSaving) {
        try (FileOutputStream fileOutput = new FileOutputStream(SETTING_LINE_PROGRAM);
             PrintStream printStream = new PrintStream(fileOutput)) {
            printStream.println(language);
            printStream.println(optionSaving);
        } catch (IOException ex) {
            Logger.getLogger(SaveSettingProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
