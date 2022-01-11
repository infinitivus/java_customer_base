package com.project.infinitivus.customerbase.view.output;

import com.project.infinitivus.customerbase.service.work_with_person.Person;

import java.util.ArrayList;

/**
 *
 * @author infinitivus
 */
public class OutputTable {
     private final ArrayList<String> HEADER_DATA = Localization.message.get("headerTable");
    public final String SPECIFIER = "%-15s%-30s%-20s%-20s%-15s%-20s%-20s%-30s%-6s%-10s";
     final String SHORT_SPECIFIER = "%-15s%-30s%-20s%-20s%-15s%n";
     private final String HEADER = String.format("N. " + SPECIFIER, HEADER_DATA .get(1), HEADER_DATA .get(2), HEADER_DATA .get(3),
            HEADER_DATA .get(4), HEADER_DATA .get(5), HEADER_DATA .get(6), HEADER_DATA .get(7), HEADER_DATA .get(8), HEADER_DATA .get(9),
            HEADER_DATA .get(10));
     private final String SHORT_HEADER = String.format("N. " + SHORT_SPECIFIER, HEADER_DATA .get(1), HEADER_DATA .get(2), HEADER_DATA .get(3),
            HEADER_DATA .get(4), HEADER_DATA .get(5));
    private String DODDEDLINE = "------------------------------------------------------------------------------"
            + "----------------------------------------------------------------------------------------------------------------";
    String SHORT_DODDEDLINE = "-----------------------------------------------------------------------------------------------------";

   public void longHeader(){
        System.out.println(DODDEDLINE);
        System.out.format(HEADER);
        System.out.println("\n" + DODDEDLINE);
    }

    public void outputNumberPerson(int numberPerson){
        System.out.print(numberPerson + ". " + Person.list.get(numberPerson) + "\n");
        System.out.println(DODDEDLINE);
    }

    void shortHeader(){
        System.out.println(SHORT_DODDEDLINE);
        System.out.format(SHORT_HEADER);
        System.out.println(SHORT_DODDEDLINE);
    }
}
