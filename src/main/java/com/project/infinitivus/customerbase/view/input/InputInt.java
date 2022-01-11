/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.infinitivus.customerbase.view.input;

import com.project.infinitivus.customerbase.view.output.OutputMessage.OutputMessageColumn;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author aals
 */
public class InputInt {
   public int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = -1;
        try {
            if (scanner.hasNextInt()) {
                inputNumber = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            new OutputMessageColumn().outputMessage("errorInputOutput",1);
            Logger.getLogger(InputInt.class.getName()).log(Level.SEVERE, null, e);
        }
        return inputNumber;
    }
}

