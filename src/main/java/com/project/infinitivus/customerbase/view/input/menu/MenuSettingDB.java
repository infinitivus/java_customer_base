package com.project.infinitivus.customerbase.view.input.menu;

import com.project.infinitivus.customerbase.view.input.InputString;
import com.project.infinitivus.customerbase.view.output.OutputMessage.IOutputMessage;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

/**
 * @author infinitivus
 */
public class MenuSettingDB {
    private IOutputMessage iOutputMessage = new OutputMessageColumn();
    private InputString input = new InputString();

    public String typeDB(String keyMessage,int valueMessage) {
        String dbType;
        do {
            iOutputMessage.outputMessage("settingDB", 1);
            dbType = input.inputString();
            if (!(dbType.equals("1") || dbType.equals("2"))) {
                iOutputMessage.outputMessage("settingDB", 7);
            }
        } while (!(dbType.equals("1") || dbType.equals("2")));
        return dbType;
    }

    public String settingDB(String keyMessage, int valueMessage) {
        iOutputMessage.outputMessage(keyMessage, valueMessage);
        return input.inputString();
    }
}
