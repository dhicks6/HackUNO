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
                String updateDose = ("Length of illness: " + keys.nextLine());
                medHistoryValues[1] = updateDose;
                String setMedHistoryList = (medHistoryValues[0] + "," + medHistoryValues[1] + "," + medHistoryValues[2]);
                medHistoryList.remove(updateNum);
                medHistoryList.add(setMedHistoryList);
            }
            else if (updateSelection.equals("3")) {
                System.out.println("What would you like to update the frequency to?");
                String updateFreq = ("Frequency: " + keys.nextLine());
                medHistoryValues[2] = updateFreq;
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
}

