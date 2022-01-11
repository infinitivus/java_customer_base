package com.project.infinitivus.customerbase.service.settings.setting_program;

import com.project.infinitivus.customerbase.data.ChoosingStorageMethod;
import com.project.infinitivus.customerbase.data.file.CreateDirectoryAndFile;
import com.project.infinitivus.customerbase.service.settings.setting_db.NewSettingDB;
import com.project.infinitivus.customerbase.view.input.menu.MenuSettingProgram;
import com.project.infinitivus.customerbase.view.output.Localization;

public class NewSettingProgram {
    private int optionSave;

    public void newSettingProgram() {
        MenuSettingProgram menuSettingProgram = new MenuSettingProgram();
        int lang = menuSettingProgram.settingLanguage();
        new Localization().installationLanguage(lang);
        optionSave = menuSettingProgram.settingOptionSave();
        new ChoosingStorageMethod().choosingStorageMethod(optionSave);
        new SaveSettingProgram().saveSettingProgram(lang, optionSave);
        if (optionSave == 1) {
            new CreateDirectoryAndFile().createDirectory();
        } else {
            new NewSettingDB().getSettingDB();
        }
    }

    public int getOptionSave() {
        return optionSave;
    }
}


//        if (optionSave == 1) {
//            IDataStorageMethod iDataStorageMethod = new StoringDataFile();
//
//        } else {
//            IDataStorageMethod iDataStorageMethod = new StoringDataBase();
//
//        }
//    }
//}
//        public void overwritingDataListToFile() {
//        try {
//            if (!Files.exists(PERSON_LIBRARY)) {
//                Files.createFile(PERSON_LIBRARY);
//                // Файл для локального хранения списка клиентов создан
//            } else {
//// Файл с записями клиентов был создан ранее. хотите перезаписать?
//                    Files.delete(PERSON_LIBRARY);
//                    Files.createFile(PERSON_LIBRARY);
//      //          }
//            }
//            if (!Person.list.isEmpty()) {
//                System.out.println(Localization.messageOverWritingDataListToFile[1]);
//                String select = inputString();
//                if (select.equalsIgnoreCase("y")) {
//                    for (int i = 0; i < Person.list.size(); i++) {
//                        saveToFile.savePersonToFile(i);
//                    }
//                } else {
//                    Person.list.clear();
//                    zeroIndexPersonList();
//                    saveToFile.savePersonToFile(0);
//                }
//            } else {
//                zeroIndexPersonList();
//                saveToFile.savePersonToFile(0);
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(NewSettingProgram.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}