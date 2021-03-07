import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class allergies {

        public static Scanner keys = new Scanner(System.in);
        public static ArrayList<String[]> allergyList = new ArrayList<String[]>();

        public static void addEntry() {
            // allergy format: allergy name, symptoms, triggers
            boolean keepGoing = true;
            while (keepGoing) {
                String[] allergy = new String[3];
                System.out.println("What is the allergy? \nThis could be from a medication " +
                    "or some allergen");
                String allergyName = keys.nextLine();
                allergy[0] = allergyName;

                System.out.println("What symptoms do you get with this allergy?");
                String symptoms = keys.nextLine();
                allergy[1] = symptoms;

                System.out.println("What triggers this allergy?");
                String triggers = keys.nextLine();
                allergy[2] = triggers;

                allergyList.add(allergy);
                System.out.println("Would you like to add another allergy?" +
                        "Enter Y for yes and N for no");
                String addAnother = keys.nextLine();
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
            for (int i = 0; allergyList.size() > i; i++) {
                System.out.println("Allergy name: " + allergyList.get(i)[0] + "," + " Symptoms: " + allergyList.get(i)[1]
                        + "," + " Triggers: " + allergyList.get(i)[2]);
            }
        }

        public static void writeToFile() {
            File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\allergieHistory.txt");
            try (Writer writer = new BufferedWriter(new FileWriter(file, true))) {
                for (int i = 0; allergyList.size() > i; i++) {
                    String content = ("Allergy name: " + allergyList.get(i)[0] + "," + " Symptoms: " + allergyList.get(i)[1]
                            + "," + " Triggers: " + allergyList.get(i)[2] + "\n");
                    writer.append(content);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
}

