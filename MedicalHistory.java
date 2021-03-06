import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class MedicaHistory {
    public static Scanner keys = new Scanner(System.in);
    public static ArrayList<String[]> medHistoryList = new ArrayList<String[]>();

    public static void addEntry() {

        boolean keepGoing = true;
        while (keepGoing) {
            String[] entry = new String[3];
            System.out.println("What is the name of the illness/disease");
            String name = keys.next();
            entry[0] = name;

            System.out.println("How long have you had a history of " + name + "?");
            String duration = keys.next();
            entry[1] = duration;

            System.out.println("Are you taking any medications for " + name + "? enter Y for yes" +
             " and N for no");
            String medCheck = keys.next();
            if (medCheck.equals("Y")) {
                System.out.println("Is the medication on your medication list? \n" +
                 "Enter Y for yes and N for no");
                 String medOnList = keys.next();

                 if (medOnList.equals("Y")) {
                     System.out.println("Good job adsasdadad this needs to be replaced");
                 }
                 else {
                     System.out.println("would you like to add it now? \n Enter Y for yes and N for no");
                     String addmed = keys.next();
                     if (addmed.equals("Y")) {
                         MedicationList.addEntry();
                     }
                     else {
                         break;
                     }
                 }
            }
            else {
                entry[2] = ("Not controlled with medication");
            }

            System.out.println("Would you like to add another record?" +
                    "Enter Y for yes and N for no");
            String addAnother = keys.next();
            if (addAnother.equals("Y")) {
                keepGoing = true;
                printList();
            }
            else {
                keepGoing = false;
                printList();
            }
        }

    }
    public static void printList(){
        for (int i = 0; medHistoryList.size() > i; i++) {
            System.out.println("Medication name: " + medHistoryList.get(i)[0] + "," + " Dose: " + medHistoryList.get(i)[1]
                    + "," + " Frequency: " + medHistoryList.get(i)[2]);
        }
    }
}
