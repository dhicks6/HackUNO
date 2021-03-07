import java.io.*;
import java.util.*;

public class MedicationList {
        public static Scanner keys = new Scanner(System.in);
        public static ArrayList<String[]> medList = new ArrayList<String[]>();

    public static void addEntry() {
            // medication format: med name, dose, frequency
            boolean keepGoingMed = true;
            while (keepGoingMed) {
                String[] medication = new String[3];
                System.out.println("What is the name of the medication?");
                String medName = keys.nextLine();
                medication[0] = medName;

                System.out.println("What is the dose of the medication");
                String dose = keys.nextLine();
                medication[1] = dose;

                System.out.println("How frequently do you take the medication?");
                String freq = keys.nextLine();
                medication[2] = freq;

                medList.add(medication);
                System.out.println("Would you like to add another medication?" +
                 "\n Enter Y for yes and N for no");
                 String addAnother = keys.nextLine();
                 if (addAnother.equals("Y")) {
                     keepGoingMed = true;
                     printList();

                }
                else {
                    keepGoingMed = false;
                    printList();

                }
            }
            writeToFile();
    }
    public static void printList(){
        for (int i = 0; medList.size() > i; i++) {
            System.out.println("Medication name: " + medList.get(i)[0] + "," + " Dose: " + medList.get(i)[1]
                    + "," + " Frequency: " + medList.get(i)[2]);
        }
    }
    public static void writeToFile() {
        File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medList.txt");
        try (Writer writer = new BufferedWriter(new FileWriter(file, true))) {
            for (int i = 0; medList.size() > i; i++) {
                String content = ("Medication name: " + medList.get(i)[0] + "," + " Dose: " + medList.get(i)[1]
                        + "," + " Frequency: " + medList.get(i)[2] + "\n");
                writer.append(content);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
