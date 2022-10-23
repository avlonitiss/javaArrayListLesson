/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.iek.javaarraylistlesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
            
            complexArray.add(Arrays.asList("Giannis",14,30.35));
              //εδώ προστέθηκε μια εγγγραφή με τρία διαφορετικά data types σε μία εγγραφή
            //(String, double, int) διαφιρετικά από την προηγούμενη εγγραφή
            
            complexArray.add(Arrays.asList("Elenh",15,32.20));
            //εδώ προστέθηκαν μία εγγραφή με ένα data type σε μία εγγραφή
            

            //Τροποποίηση εκτύπωσης με απόκρυψη βάρους
            System.out.println("Name,  Age");
            for (List myRecords : complexArray) {
                System.out.println(
                    myRecords.get(0)+" "+myRecords.get(1));
            }
            
            //Αναζήτηση βάρους με Input το όνομα
            Scanner myKeyboard = new Scanner(System.in);
            
            System.out.println("Enter name to find weight");
            String name=myKeyboard.nextLine();
            
            System.out.println("I'm searchnig "+name+" weight");
            
            
            complexArray.forEach(arrayName->{
                
                if(arrayName.get(0).equals(name)){
                    System.out.println("I found the person...");
                    System.out.println(name+" is weighting "+arrayName.get(2)+" Kg");
                    System.exit(0);
                }else {
                    System.out.println("This person isn't found yet");
                }
            
            });
            
  
    }
    
}
