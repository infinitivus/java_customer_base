package com.project.infinitivus.customerbase.view.input.menu;

import com.project.infinitivus.customerbase.data.data_base.SaveFullListToDB;
import com.project.infinitivus.customerbase.data.file.SaveFullListToFile;
import com.project.infinitivus.customerbase.view.input.choose_from_two.InputOneOrTwo;
import com.project.infinitivus.customerbase.view.input.choose_from_two.InputYesOrNo;
import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

/**
 * @author aals
 */
public class MenuFullSaveList {
    private final OutputMessageColumn messageColumn = new OutputMessageColumn();
    private final InputOneOrTwo inputOneOrTwo = new InputOneOrTwo();
    private final InputYesOrNo yesOrNo = new InputYesOrNo();

    public void selectFullSaveList() {
        if (inputOneOrTwo.choose("fullSaveList", 1)) {
            if (yesOrNo.choose("fullSaveList", 2)) {
                new SaveFullListToFile().checkingExistenceDirectory();
                messageColumn.outputMessage("fullSaveList", 3);
            }
            }else{
            if (yesOrNo.choose("fullSaveList", 2)) {
                new SaveFullListToDB().checkingExistenceDB();
                messageColumn.outputMessage("fullSaveList", 4);
            }
        }
    }
}
