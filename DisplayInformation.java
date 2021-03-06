import java.io.*;

public class DisplayInformation {

    public static void displayMeds() throws Exception {
        File medFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medList.txt");
        BufferedReader br = new BufferedReader(new FileReader(medFile));

        String st;
        while ((st = br.readLine()) != null){
            System.out.println(st);
        }
    }

    public static void displayMedicalHistory() throws Exception {
        File medicalHistoryFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\medicalHistory.txt");
        BufferedReader br = new BufferedReader(new FileReader(medicalHistoryFile));

        String st;
        while ((st = br.readLine()) != null){
            System.out.println(st);
        }
    }

    public static void displayAllergies() throws Exception {
        File allergyFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\allergieHistory.txt");
        BufferedReader br = new BufferedReader(new FileReader(allergyFile));

        String st;
        while ((st = br.readLine()) != null){
            System.out.println(st);
        }
    }
    public static void displayPersonalInformation() throws Exception {
        File personalInformationFile = new File("C:\\Users\\dusti\\Desktop\\personalprograms\\Java\\HackUNO\\src\\personalData.txt");
        BufferedReader br = new BufferedReader(new FileReader(personalInformationFile));

        String st;
        while ((st = br.readLine()) != null){
            System.out.println(st);
        }
    }
}
