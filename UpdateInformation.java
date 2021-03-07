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
        String updateMedString = medList.get(updateNum-1);
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
                medValues[0] = ("");
                System.out.println("What would you like to update the name to?");
                String updateName =("Medication name: " + keys.nextLine());
                medValues[0] = updateName;
            }
            else if (updateSelection.equals("2")) {
                medValues[1] = ("");
                System.out.println("What would you like to update the dose to?");
                String updateDose = ("Dose: " + keys.nextLine());
                medValues[1] = updateDose;
            }
            else if (updateSelection.equals("3")) {
                medValues[2] = ("");
                System.out.println("What would you like to update the frequency to?");
                String updateFreq = ("Frequency: " + keys.nextLine());
                medValues[2] = updateFreq;
            }

            medList.set(updateNum, Arrays.toString(medValues));
            System.out.println(medList.toString());
        }

    /*
            String[] medAR = new String[3];

        BufferedReader medBR = new BufferedReader(med);
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            for (String str : values) {
                System.out.println(str);
            }
        }
    */
    }
}
