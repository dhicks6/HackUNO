import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

public class MedicationList {
        public static Scanner keys = new Scanner(System.in);
        public static ArrayList<String[]> medList = new ArrayList<String[]>();

    public static void addEntry() {
            // medication format: med name, dose, frequency
            boolean keepGoing = true;
            while (keepGoing) {
                String[] medication = new String[3];
                System.out.println("What is the name of the medication?");
                String medName = keys.next();
                medication[0] = medName;

                System.out.println("What is the dose of the medication");
                String dose = keys.next();
                medication[1] = dose;

                System.out.println("How frequently do you take the medication?");
                String freq = keys.next();
                medication[2] = freq;

                medList.add(medication);
                System.out.println("Would you like to add another medication?" +
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
        for (int i = 0; medList.size() > i; i++) {
            System.out.println("Medication name: " + medList.get(i)[0] + "," + " Dose: " + medList.get(i)[1]
                    + "," + " Frequency: " + medList.get(i)[2]);
        }
    }
}
