import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteInformation {
// load the .txt files into an array. Add to the strings a number and display them. Ask the
// user which number they would like to delete.
    public static Scanner keys = new Scanner(System.in);
    public static void deleteMeds() throws Exception {
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
        System.out.println("Please enter the number you would like to delete.");
        int deleteNum = keys.nextInt();
        medList.remove(deleteNum - 1);
        System.out.println(medList.toString());

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
        }


    public static void deleteMedicalHistory() throws Exception {
        File medicalHistoryFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medicalHistory.txt");
        BufferedReader br = new BufferedReader(new FileReader(medicalHistoryFile));
        ArrayList<String> medicalHistoryList = new ArrayList<>();

        String st;
        while ((st = br.readLine()) != null){
            medicalHistoryList.add(st);
        }
        for (int i = 0; i <medicalHistoryList.size(); i++) {
            int outPutNum = (i + 1);
            System.out.println("Item number " + outPutNum + " "  + medicalHistoryList.get(i).toString());
        }
        System.out.println("Please enter the number you would like to delete.");
        int deleteNum = keys.nextInt();
        medicalHistoryList.remove(deleteNum);
        System.out.println(medicalHistoryList.toString());

        File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medList.txt");
        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; medicalHistoryList.size() > i; i++) {
                String content = medicalHistoryList.get(i);
                writer.write(content + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllergies() throws Exception {
        File allergyFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\allergieHistory.txt");
        BufferedReader br = new BufferedReader(new FileReader(allergyFile));
        ArrayList<String> allergyList = new ArrayList<>();

        String st;
        while ((st = br.readLine()) != null){
            allergyList.add(st);
        }
        for (int i = 0; i <allergyList.size(); i++) {
            int outPutNum = (i + 1);
            System.out.println("Item number " + outPutNum + " "  + allergyList.get(i).toString());
        }
        System.out.println("Please enter the number you would like to delete.");
        int deleteNum = keys.nextInt();
        allergyList.remove(deleteNum);
        System.out.println(allergyList.toString());

        File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medList.txt");
        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; allergyList.size() > i; i++) {
                String content = allergyList.get(i);
                writer.write(content + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deletePersonalInformation() throws Exception {
        File personalInformationFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\personalData.txt");
        BufferedReader br = new BufferedReader(new FileReader(personalInformationFile));
        ArrayList<String> personalInformationList = new ArrayList<>();

        String st;
        while ((st = br.readLine()) != null){
            personalInformationList.add(st);
        }
        for (int i = 0; i <personalInformationList.size(); i++) {
            int outPutNum = (i + 1);
            System.out.println("Item number " + outPutNum + " "  + personalInformationList.get(i).toString());
        }
        System.out.println("Please enter the number you would like to delete.");
        int deleteNum = keys.nextInt();
        personalInformationList.remove(deleteNum);
        System.out.println(personalInformationList.toString());

        File file = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medList.txt");
        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; personalInformationList.size() > i; i++) {
                String content = personalInformationList.get(i);
                writer.write(content + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
