import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateInformation {
/*
 load the .txt files into an arraylist of arrays. Number the arrays and display them. Ask the user
 which array they would like to update. Get the index of that array. Ask the user what piece of info
 they want to update in the array. Get the index for that data point and replace the data inside with
 what the user wants
*/
    public static Scanner keys = new Scanner(System.in);
    public static void updateMeds() throws Exception {
        File medFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medList.txt");
        BufferedReader br = new BufferedReader(new FileReader(medFile));
        ArrayList<String> medList = new ArrayList<>();

        String st;
        while ((st = br.readLine()) != null){
            medList.add(st);
        }
        for (int i = 0; i <medList.size(); i++) {
            int outPutNum = (i + 1);
            System.out.println("Item number " + outPutNum + " " + medList.get(i).toString());
        }

        System.out.println("Please enter the number of the entry you would like to update.");
        String updateNumString = keys.nextLine();
        int updateNum = Integer.parseInt(updateNumString);
        updateNum--;
        String updateMedString = medList.get(updateNum);
        Reader inputString = new StringReader(updateMedString);
        BufferedReader medBR = new BufferedReader(inputString);
        while ((updateMedString = medBR.readLine()) != null) {
            String[] medValues = updateMedString.split(",");
            for (String str : medValues) {
                System.out.println(str);
            }
            System.out.println("To update the medication name enter 1. \n To update the dose enter 2." +
                    "\n To update the frequency enter 3.");
            String updateSelection = keys.nextLine();
            if (updateSelection.equals("1")) {
                System.out.println("What would you like to update the name to?");
                String updateName =("Medication name: " + keys.nextLine());
                medValues[0] = updateName;
                String setMedList = (medValues[0] + "," + medValues[1] + "," + medValues[2]);
                medList.remove(updateNum);
                medList.add(setMedList);
            }
            else if (updateSelection.equals("2")) {
                System.out.println("What would you like to update the dose to?");
                String updateDose = ("Dose: " + keys.nextLine());
                medValues[1] = updateDose;
                String setMedList = (medValues[0] + "," + medValues[1] + "," + medValues[2]);
                medList.remove(updateNum);
                medList.add(setMedList);
            }
            else if (updateSelection.equals("3")) {
                System.out.println("What would you like to update the frequency to?");
                String updateFreq = ("Frequency: " + keys.nextLine());
                medValues[2] = updateFreq;
                String setMedList = (medValues[0] + "," + medValues[1] + "," + medValues[2]);
                medList.remove(updateNum);
                medList.add(setMedList);
            }
            File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medList.txt");
            try (Writer writer = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; medList.size() > i; i++) {
                    String content = medList.get(i);
                    writer.write(content + "\n");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < medList.size(); i++) {
                System.out.println(medList.get(i).toString());
            }
        }
    }
    public static void updateMedicalHistory() throws Exception {
        File medHistoryFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medicalHistory.txt");
        BufferedReader br = new BufferedReader(new FileReader(medHistoryFile));
        ArrayList<String> medHistoryList = new ArrayList<>();

        String st;
        while ((st = br.readLine()) != null){
            medHistoryList.add(st);
        }
        for (int i = 0; i <medHistoryList.size(); i++) {
            int outPutNum = (i + 1);
            System.out.println("Item number " + outPutNum + " " + medHistoryList.get(i).toString());
        }

        System.out.println("Please enter the number of the entry you would like to update.");
        String updateNumString = keys.nextLine();
        int updateNum = Integer.parseInt(updateNumString);
        updateNum--;
        String updatMedHistoryString = medHistoryList.get(updateNum);
        Reader inputString = new StringReader(updatMedHistoryString);
        BufferedReader medBR = new BufferedReader(inputString);
        while ((updatMedHistoryString = medBR.readLine()) != null) {
            String[] medHistoryValues = updatMedHistoryString.split(",");
            for (String str : medHistoryValues) {
                System.out.println(str);
            }
            System.out.println("To update the illness name enter 1. \n To update the length of illness enter 2." +
                    "\n To update the controlled by method enter 3.");
            String updateSelection = keys.nextLine();
            if (updateSelection.equals("1")) {
                System.out.println("What would you like to update the name to?");
                String updateName =("Illness name: " + keys.nextLine());
                medHistoryValues[0] = updateName;
                String setMedHistoryList = (medHistoryValues[0] + "," + medHistoryValues[1] + "," + medHistoryValues[2]);
                medHistoryList.remove(updateNum);
                medHistoryList.add(setMedHistoryList);
            }
            else if (updateSelection.equals("2")) {
                System.out.println("What would you like to update the length of illness to?");
                String updateLength = ("Length of illness: " + keys.nextLine());
                medHistoryValues[1] = updateLength;
                String setMedHistoryList = (medHistoryValues[0] + "," + medHistoryValues[1] + "," + medHistoryValues[2]);
                medHistoryList.remove(updateNum);
                medHistoryList.add(setMedHistoryList);
            }
            else if (updateSelection.equals("3")) {
                System.out.println("What would you like to update the frequency to?");
                String updateControlMesures = ("Frequency: " + keys.nextLine());
                medHistoryValues[2] = updateControlMesures;
                String setMedHistoryList = (medHistoryValues[0] + "," + medHistoryValues[1] + "," + medHistoryValues[2]);
                medHistoryList.remove(updateNum);
                medHistoryList.add(setMedHistoryList);
            }
            File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medicalHistory.txt");
            try (Writer writer = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; medHistoryList.size() > i; i++) {
                    String content = medHistoryList.get(i);
                    writer.write(content + "\n");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < medHistoryList.size(); i++) {
                System.out.println(medHistoryList.get(i).toString());
            }
        }
    }

    public static void updateAllergies() throws Exception {
        File allergyFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\allergieHistory.txt");
        BufferedReader br = new BufferedReader(new FileReader(allergyFile));
        ArrayList<String> allergyList = new ArrayList<>();

        String st;
        while ((st = br.readLine()) != null){
            allergyList.add(st);
        }
        for (int i = 0; i <allergyList.size(); i++) {
            int outPutNum = (i + 1);
            System.out.println("Item number " + outPutNum + " " + allergyList.get(i).toString());
        }

        System.out.println("Please enter the number of the entry you would like to update.");
        String updateNumString = keys.nextLine();
        int updateNum = Integer.parseInt(updateNumString);
        updateNum--;
        String updateAllergyString = allergyList.get(updateNum);
        Reader inputString = new StringReader(updateAllergyString);
        BufferedReader medBR = new BufferedReader(inputString);
        while ((updateAllergyString = medBR.readLine()) != null) {
            String[] allergyValues = updateAllergyString.split(",");
            for (String str : allergyValues) {
                System.out.println(str);
            }
            System.out.println("To update the medication name enter 1. \n To update the dose enter 2." +
                    "\n To update the frequency enter 3.");
            String updateSelection = keys.nextLine();
            if (updateSelection.equals("1")) {
                System.out.println("What would you like to update the name of the allergy to?");
                String updateName =("Allergy name: " + keys.nextLine());
                allergyValues[0] = updateName;
                String setAllergyList = (allergyValues[0] + "," + allergyValues[1] + "," + allergyValues[2]);
                allergyList.remove(updateNum);
                allergyList.add(setAllergyList);
            }
            else if (updateSelection.equals("2")) {
                System.out.println("What would you like to update the symptoms to?");
                String updateSymptoms = ("Symptoms: " + keys.nextLine());
                allergyValues[1] = updateSymptoms;
                String setMedList = (allergyValues[0] + "," + allergyValues[1] + "," + allergyValues[2]);
                allergyList.remove(updateNum);
                allergyList.add(setMedList);
            }
            else if (updateSelection.equals("3")) {
                System.out.println("What would you like to update the triggers to?");
                String updateTriggers = ("Triggers: " + keys.nextLine());
                allergyValues[2] = updateTriggers;
                String setMedList = (allergyValues[0] + "," + allergyValues[1] + "," + allergyValues[2]);
                allergyList.remove(updateNum);
                allergyList.add(setMedList);
            }
            File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\allergieHistory.txt");
            try (Writer writer = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; allergyList.size() > i; i++) {
                    String content = allergyList.get(i);
                    writer.write(content + "\n");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < allergyList.size(); i++) {
                System.out.println(allergyList.get(i).toString());
            }
        }
    }



    public static void updatePersonalInformation() throws Exception {
        File personalInfoFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\personalData.txt");
        BufferedReader br = new BufferedReader(new FileReader(personalInfoFile));
        ArrayList<String> personalInfoList = new ArrayList<>();

        String st;
        while ((st = br.readLine()) != null){
            personalInfoList.add(st);
        }
        for (int i = 0; i <personalInfoList.size(); i++) {
            int outPutNum = (i + 1);
            System.out.println("Item number " + outPutNum + " " + personalInfoList.get(i).toString());
        }

        System.out.println("Please enter the number of the entry you would like to update.");
        String updateNumString = keys.nextLine();
        int updateNum = Integer.parseInt(updateNumString);
        updateNum--;
        String updatePersonalInfoString = personalInfoList.get(updateNum);
        Reader inputString = new StringReader(updatePersonalInfoString);
        BufferedReader medBR = new BufferedReader(inputString);
        while ((updatePersonalInfoString = medBR.readLine()) != null) {
            String[] personalInfoValues = updatePersonalInfoString.split(",");
            for (String str : personalInfoValues) {
                System.out.println(str);
            }
            System.out.println("To update the medication name enter 1. \n To update the dose enter 2." +
                    "\n To update the frequency enter 3.");
            String updateSelection = keys.nextLine();
            if (updateSelection.equals("1")) {
                System.out.println("What would you like to update your name to?");
                String updateName =("Patient name: " + keys.nextLine());
                personalInfoValues[0] = updateName;
                String setPersonalInfoList = (personalInfoValues[0] + "," + personalInfoValues[1] + "," + personalInfoValues[2] +
                    "," + personalInfoValues[3] + "," + personalInfoValues[4] + "," + "," + personalInfoValues[5] + ","
                        + "," + personalInfoValues[6]);
                personalInfoList.remove(updateNum);
                personalInfoList.add(setPersonalInfoList);
            }
            else if (updateSelection.equals("2")) {
                System.out.println("What would you like to update your date of birth to?");
                String updateDOB = ("Date of birth: " + keys.nextLine());
                personalInfoValues[1] = updateDOB;
                String setPersonalInfoList = (personalInfoValues[0] + "," + personalInfoValues[1] + "," + personalInfoValues[2] +
                        "," + personalInfoValues[3] + "," + personalInfoValues[4] + "," + "," + personalInfoValues[5] + ","
                        + "," + personalInfoValues[6]);                personalInfoList.remove(updateNum);
                personalInfoList.add(setPersonalInfoList);
            }
            else if (updateSelection.equals("3")) {
                System.out.println("What would you like to update your age to?");
                String updateAge = ("Frequency: " + keys.nextLine());
                personalInfoValues[2] = updateAge;
                String setPersonalInfoList = (personalInfoValues[0] + "," + personalInfoValues[1] + "," + personalInfoValues[2] +
                        "," + personalInfoValues[3] + "," + personalInfoValues[4] + "," + "," + personalInfoValues[5] + ","
                        + "," + personalInfoValues[6]);                personalInfoList.remove(updateNum);
                personalInfoList.add(setPersonalInfoList);
            }
            else if (updateSelection.equals("4")) {
                System.out.println("What would you like to update your height to?");
                String updateHeight = ("Frequency: " + keys.nextLine());
                personalInfoValues[3] = updateHeight;
                String setPersonalInfoList = (personalInfoValues[0] + "," + personalInfoValues[1] + "," + personalInfoValues[2] +
                        "," + personalInfoValues[3] + "," + personalInfoValues[4] + "," + "," + personalInfoValues[5] + ","
                        + "," + personalInfoValues[6]);                personalInfoList.remove(updateNum);
                personalInfoList.add(setPersonalInfoList);
            }
            else if (updateSelection.equals("5")) {
                System.out.println("What would you like to update your weight to?");
                String updateWeight = ("Frequency: " + keys.nextLine());
                personalInfoValues[4] = updateWeight;
                String setPersonalInfoList = (personalInfoValues[0] + "," + personalInfoValues[1] + "," + personalInfoValues[2] +
                        "," + personalInfoValues[3] + "," + personalInfoValues[4] + "," + "," + personalInfoValues[5] + ","
                        + "," + personalInfoValues[6]);                personalInfoList.remove(updateNum);
                personalInfoList.add(setPersonalInfoList);
            }
            else if (updateSelection.equals("6")) {
                System.out.println("What would you like to update your blood type to?");
                String updateBloodType = ("Frequency: " + keys.nextLine());
                personalInfoValues[5] = updateBloodType;
                String setPersonalInfoList = (personalInfoValues[0] + "," + personalInfoValues[1] + "," + personalInfoValues[2] +
                        "," + personalInfoValues[3] + "," + personalInfoValues[4] + "," + "," + personalInfoValues[5] + ","
                        + "," + personalInfoValues[6]);                personalInfoList.remove(updateNum);
                personalInfoList.add(setPersonalInfoList);
            }
            else if (updateSelection.equals("7")) {
                System.out.println("What would you like to update the emergency contact to?");
                String updateEmergencyContact = ("Frequency: " + keys.nextLine());
                personalInfoValues[6] = updateEmergencyContact;
                String setPersonalInfoList = (personalInfoValues[0] + "," + personalInfoValues[1] + "," + personalInfoValues[2] +
                        "," + personalInfoValues[3] + "," + personalInfoValues[4] + "," + "," + personalInfoValues[5] + ","
                        + "," + personalInfoValues[6]);                personalInfoList.remove(updateNum);
                personalInfoList.add(setPersonalInfoList);
            }
            File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\personalData.txt");
            try (Writer writer = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; personalInfoList.size() > i; i++) {
                    String content = personalInfoList.get(i);
                    writer.write(content + "\n");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < personalInfoList.size(); i++) {
                System.out.println(personalInfoList.get(i).toString());
            }
        }
    }
}
