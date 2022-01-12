package com.project.infinitivus.customerbase.data;

import com.project.infinitivus.customerbase.data.data_base.*;
import com.project.infinitivus.customerbase.data.file.*;

/**
 * @author infinitivus
 */
public class ChoosingStorageMethod {
    public static IUpdate iUpdate;
    public static ISelect iSelect;
    public static IInsert iInsert;
    public static IDelete iDelete;
    public static IClear iClear;

    public void choosingStorageMethod(int optionSave) {
        if (optionSave == 1) {
            iUpdate = new UpdateFile();
            iClear = new ClearFile();
            iDelete = new DeleteFile();
            iInsert = new InsertFile();
            iSelect = new SelectFile();
        } else {
            iUpdate = new UpdateData();
            iClear = new ClearData();
            iDelete = new DeleteData();
            iInsert = new InsertData();
            iSelect = new SelectData();
        }
    }
}
