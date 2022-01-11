package com.project.infinitivus.customerbase.view.output;

import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageLine;

public class OutputInfoSetting {
   private IOutputMessage iOutputMessage = new OutputMessageColumn();

    public void OutputSettingProgram(int optionSave) {
        iOutputMessage.outputMessage("outputSettingProgram", 1);
        iOutputMessage.outputMessage("outputSettingProgram", 2);
        if (optionSave == 2) {
            iOutputMessage.outputMessage("outputSettingProgram", 4);
        } else {
            iOutputMessage.outputMessage("outputSettingProgram", 3);
        }
    }

    public void OutputSettingDB(String dbType, String dbPath, String dbLogin,String dbPassword,String tableName) {

        iOutputMessage.outputMessage("outputSettingDB", 1);
        if (dbType.equals("1")) {
            iOutputMessage.outputMessage("outputSettingDB", 2);
        } else {
            iOutputMessage.outputMessage("outputSettingDB", 3);
        }
        IOutputMessage iOutputMessage = new OutputMessageLine();
        iOutputMessage.outputMessage("outputSettingDB", 4);
        System.out.println(dbPath);
        iOutputMessage.outputMessage("outputSettingDB", 5);
        System.out.println(dbLogin);
        iOutputMessage.outputMessage("outputSettingDB", 6);
        System.out.println(dbPassword);
        iOutputMessage.outputMessage("outputSettingDB", 7);
        System.out.println(tableName);
    }
}
