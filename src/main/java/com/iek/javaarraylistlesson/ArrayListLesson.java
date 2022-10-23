/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.iek.javaarraylistlesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Spyros
 */
public class ArrayListLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            ArrayList<List> complexArray = new ArrayList<>();
                
            // προσθήκη εγγραφών στοιχείων διαφορετικών data types στη λίστα
            
            complexArray.add(Arrays.asList("Costas",15,34.12));
            //εδώ προστέθηκε μια εγγραφή με τρία διαφορετικά data types σε μία εγγραφή
            //(String, int, double)
            
            complexArray.add(Arrays.asList("Giannis",850.32,14));
              //εδώ προστέθηκε μια εγγγραφή με τρία διαφορετικά data types σε μία εγγραφή
            //(String, double, int) διαφιρετικά από την προηγούμενη εγγραφή
            
            complexArray.add(Arrays.asList(420));
            //εδώ προστέθηκαν μία εγγραφή με ένα data type σε μία εγγραφή
            
            for (List myRecords : complexArray) {
                System.out.println(
                    myRecords.get(0));
            }
            
            
  
    }
    
}
