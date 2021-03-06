import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MedicaHistory {
    public static Scanner keys = new Scanner(System.in);
    public static ArrayList<String[]> medHistoryList = new ArrayList<String[]>();

    public static void addEntry() {
        // med history format: Name, how long the pt has had it, if it is controlled by medication
        boolean keepGoing = true;
        while (keepGoing) {
            String[] entry = new String[3];
            System.out.println("What is the name of the illness/disease");
            String name = keys.nextLine();
            entry[0] = name;

            System.out.println("How long have you had a history of " + name + "?");
            String duration = keys.nextLine();
            entry[1] = duration;

            System.out.println("Are you taking any medications for " + name + "? enter Y for yes" +
             " and N for no");
            String medCheck = keys.nextLine();
            if (medCheck.equals("Y")) {
                System.out.println("Is the medication on your medication list? \n" +
                 "Enter Y for yes and N for no");
                 String medOnList = keys.nextLine();

                 if (medOnList.equals("Y")) {
                     System.out.println("What is the name of the medication?");
                     String med = keys.nextLine();
                     entry[2] = med;
                 }
                 else {
                     System.out.println("would you like to add it now? \n Enter Y for yes and N for no.");
                     String addmed = keys.next();
                     if (addmed.equals("Y")) {
                         System.out.println("Here you will enter the name of the medication twice \n " +
                          "What is the name of the medication?");
                          String medName = keys.nextLine();
                          entry[2] = medName;
                          MedicationList.addEntry();

                     }
                     else if (addmed.equals("N")) {
                         entry[2] = ("Controlled with medication");
                     }
                 }
            }
            else {
                entry[2] = ("Not controlled with medication");
            }

            System.out.println("Would you like to add another record?" +
                    "Enter Y for yes and N for no");
            String addAnother = keys.next();
            medHistoryList.add(entry);
            if (addAnother.equals("Y")) {
                keepGoing = true;
                printList();
                writeToFile();
            }
            else {
                keepGoing = false;
                printList();
                writeToFile();
            }
        }

    }
    public static void printList(){
        for (int i = 0; medHistoryList.size() > i; i++) {
            System.out.println("Name of illness: " + medHistoryList.get(i)[0] + "," + " Length of illness: " + medHistoryList.get(i)[1]
                    + "," + " Controlled by: " + medHistoryList.get(i)[2]);
        }
    }

    public static void writeToFile() {
        File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medicalHistory.txt");
        try (Writer writer = new BufferedWriter(new FileWriter(file, true))) {
            for (int i = 0; medHistoryList.size() > i; i++) {
                String content = ("Medication name: " + medHistoryList.get(i)[0] + "," + " Dose: " + medHistoryList.get(i)[1]
                        + "," + " Frequency: " + medHistoryList.get(i)[2] + "\n");
                writer.append(content);
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
