import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformation {
    public static Scanner keys = new Scanner(System.in);
    public static ArrayList<String[]> personalInfoList = new ArrayList<String[]>();

    public static void addEntry() {
        // personal information format:Name, DOB, age, height, weight, blood type, emergency contacts
        boolean keepGoing = true;
        while (keepGoing) {
            String[] personalData = new String[7];
            System.out.println("What is your name?");
            String PTName = keys.nextLine();
            personalData[0] = PTName;

            System.out.println("What is your date of birth? \n Please enter it in MM/DD/YYYY format");
            String DOB = keys.nextLine();
            personalData[1] = DOB;

            System.out.println("What is your age?");
            String age = keys.nextLine();
            personalData[2] = age;

            System.out.println("What is your height?");
            String height = keys.nextLine();
            personalData[3] = height;

            System.out.println("What is your weight?");
            String weight = keys.nextLine();
            personalData[4] = weight;

            System.out.println("Do you know your blood type? \n Enter Y for yes and N for no.");
            String typeCheck = keys.nextLine();
            if (typeCheck.equals("Y")) {
                System.out.println("What is your blood type");
                String bloodType = keys.nextLine();
                personalData[5] = bloodType;
            }
            else {
                personalData[5] = ("PT does not know their blood type");
            }
            System.out.println("Who is your emergency contact?");
            String emergencyContactName = keys.nextLine();
            System.out.println("What is your relation to " + emergencyContactName);
            String emergencyContactRelation = keys.nextLine();
            System.out.println("What is " + emergencyContactName +"'s phone number?");
            String emergencyContactNumber = keys.nextLine();
            String emergencyContact = ("Name: " + emergencyContactName + "," + " Relation: " + emergencyContactRelation + "," +
                 " Phone number: " + emergencyContactNumber);
            personalData[6] = emergencyContact;

            personalInfoList.add(personalData);
            keepGoing = false;
            printList();
            writeToFile();
        }

    }
    // personal information format:Name, DOB, age, height, weight, blood type, emergency contacts
    public static void printList(){
        for (int i = 0; personalInfoList.size() > i; i++) {
            System.out.println("Patient name: " + personalInfoList.get(i)[0] + "," + " Date of birth: " + personalInfoList.get(i)[1]
                    + "," + " Age: " + personalInfoList.get(i)[2] +"," + " Height: " + personalInfoList.get(i)[3] + "," + " Weight: "
                    + personalInfoList.get(i)[4] + "," + " Blood type: " + personalInfoList.get(i)[5] + "," + " Emergency Contact: " +
                     personalInfoList.get(i)[6]);
        }
    }
    public static void writeToFile() {
        File personalInformationFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\personalData.txt");
        try (Writer writer = new BufferedWriter(new FileWriter(personalInformationFile, true))) {
            for (int i = 0; personalInfoList.size() > i; i++) {
                String content = ("Patient name: " + personalInfoList.get(i)[0] + "," + " Date of birth: " + personalInfoList.get(i)[1]
                        + "," + " Age: " + personalInfoList.get(i)[2] +"," + " Height: " + personalInfoList.get(i)[3] + "," + "Weight: "
                        + personalInfoList.get(i)[4] + "," + " Blood type: " + personalInfoList.get(i)[5] + "," + "Emergency Contact: " +
                        personalInfoList.get(i)[6] + "\n");
                writer.append(content);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
