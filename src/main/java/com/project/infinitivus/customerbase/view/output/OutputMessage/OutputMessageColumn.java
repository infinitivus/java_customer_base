package com.project.infinitivus.customerbase.view.output.OutputMessage;

import com.project.infinitivus.customerbase.view.output.Localization;

import java.util.List;

/**
 * @author infinitivus
 */
public class OutputMessageColumn implements IOutputMessage {
    @Override
    public void outputMessage(String key, int valueList) {
        List<String> outputList = Localization.message.get(key);
        String str = outputList.get(valueList);
        System.out.println(str);
    }
}
