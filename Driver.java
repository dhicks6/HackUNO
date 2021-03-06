import java.io.*;
import java.util.Scanner;

public class Driver {
    public static Scanner keys = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean HIPPACheck = true;
        boolean patientCheck = true;

        System.out.println("Are you a patient, or provider \n Enter 1 for patient, and 2 for provider");
        String userCheck = keys.nextLine();
        if (userCheck.equals("1")) {
            patientCheck = patientLogin();
            if (patientCheck == true) {
                // ask the user if they would like to look up their information, add to their information
                // delete an entry, update an entry

                System.out.println("To view your medical or personal data enter 1. \n To add to your medical or personal data enter 2. \n" +
                    "To delete one of your entries enter 3. \n To update one of your entries enter 4.");
                String selection = keys.nextLine();
                // search/display
                if (selection.equals("1")) {
                    System.out.println("Enter 1 to see your medications. \n Enter 2 to see your medical history. \n" +
                        "Enter 3 to see your allergies. \n Enter 4 to see your personal data. \n Enter 5 to see all data.");
                    String displaySelection = keys.nextLine();
                    if (displaySelection.equals("1")) {
                        System.out.println("You are taking: ");
                        DisplayInformation.displayMeds();
                    }
                    else if (displaySelection.equals("2")) {
                        System.out.println("Your medical history is:");
                        DisplayInformation.displayMedicalHistory();
                    }
                    else if (displaySelection.equals("3")) {
                        System.out.println("Your allergies are:");
                        DisplayInformation.displayAllergies();
                    }
                    else if (displaySelection.equals("4")) {
                        System.out.println("Your personal information is: ");
                        DisplayInformation.displayPersonalInformation();
                    }
                    else if (displaySelection.equals("5")) {
                        System.out.println("Your personal information is: ");
                        DisplayInformation.displayPersonalInformation();
                        System.out.println("\n");
                        System.out.println("You are taking: ");
                        DisplayInformation.displayMeds();
                        System.out.println("\n");
                        System.out.println("Your medical history is:");
                        DisplayInformation.displayMedicalHistory();
                        System.out.println("\n");
                        System.out.println("Your allergies are:");
                        DisplayInformation.displayAllergies();
                    }
                    else {
                        System.out.println("Invalid entry");
                    }

                }

                // add
                else if (selection.equals("2")) {
                    System.out.println("What would you like to add? \n To add a medication enter 1. \n" +
                            "To add to your medical history enter 2. \n To add to your allergies enter 3. \n" +
                                "To add to your personal information enter 4.");
                    String addSelection = keys.next();
                    if (addSelection.equals("1")) {
                        MedicationList.addEntry();
                    }
                    else if (addSelection.equals("2")) {
                        MedicaHistory.addEntry();
                    }
                    else if (addSelection.equals("3")) {
                        allergies.addEntry();
                    }
                    else if (addSelection.equals("4")) {
                        PersonalInformation.addEntry();
                    }
                }

            // delete
            else if (selection.equals("3")) {
                    System.out.println("To delete a medication enter 1 \n To delete a medical history enter 2 \n" +
                        "To delete an allergy enter 3 \n To delete personal information enter 4");
                        String deleteSelection = keys.nextLine();
                        if (deleteSelection.equals("1")) {
                            DeleteInformation.deleteMeds();
                        }
                        else if (deleteSelection.equals("2")) {
                            DeleteInformation.deleteMedicalHistory();
                        }
                        else if (deleteSelection.equals("3")) {
                            DeleteInformation.deleteAllergies();
                        }
                        else if (deleteSelection.equals("4")) {
                            DeleteInformation.deletePersonalInformation();
                        }
                        else {
                            System.out.println("Invalid entery");
                        }
                }

            // update
            else if (selection.equals("4")) {

                }

            else {
                    System.out.println("Input not in list. \n Goodbye");
                }
            }
        }

        else if (userCheck.equals("2")) {
            HIPPACheck = providerLogin();
            if (HIPPACheck) {
                //Display the information
                System.out.println("The patients personal information is: ");
                DisplayInformation.displayPersonalInformation();
                System.out.println("The patient reports taking: ");
                DisplayInformation.displayMeds();
                System.out.println("\n");
                System.out.println("The patients reported medical history is:");
                DisplayInformation.displayMedicalHistory();
                System.out.println("\n");
                System.out.println("The patients reported allergies are:");
                DisplayInformation.displayAllergies();
            }
        }
    }
    public static boolean patientLogin() {
        System.out.println("What is your password");
        for (int i = 0; i < 3; i++) {
            String pass = keys.nextLine();
            if (pass.equals("pass"))
                return true;
            else {
                System.out.println("Invalid password");
                if (i == 0) {
                    System.out.println("Try again");
                }
                else if (i == 1) {
                    System.out.println("Try again. You have one attempt left");
                }
                else {
                    System.out.println("Please contact us to reset your password");
                }
            }
        }
        return false;
    }
     public static boolean providerLogin() {
        System.out.println("Enter HIPPA code");

         for (int i = 0; i < 3; i++) {
             String code = keys.nextLine();
             if (code.equals("123"))
                 return true;
             else {
                 System.out.println("Invalid code");
                 if (i == 0) {
                     System.out.println("Try again");
                 }
                 else if (i == 1) {
                     System.out.println("Try again. You have one attempt left");
                 }
                 else {
                     System.out.println("Please contact us to reset your code");
                 }
             }
         }
         return false;
    }
}
