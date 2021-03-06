import java.io.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Would you like to add a medication?" +
         "Enter Y for yes and N for no.");
         String selection = keys.next();
         if (selection.equals("Y")) {
             MedicationList.addEntry();
         }
         else {
             System.out.println("Goodbye");
         }
    }
}

