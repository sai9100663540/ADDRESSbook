package Main;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static <NumberFOrmatException extends Throwable> void main(StringSelection[] args) throws IOException, NumberFOrmatException {
        Scanner input = new Scanner(System.in);
        int exit = 0;
        int answer;
        do {
            System.out.println("...Welcome to Adress Book...");
            System.out.println("Enter '1' to Add contact");
            System.out.println("Enter '2' to Search contact");
            System.out.println("Enter '3' to Print contact");
            System.out.println("Enter '4' to Edit contact");
            System.out.println("Enter '5' to Delete contact");
            System.out.println("Enter '0' to Exit");
            System.out.println("Do you want to print contact, add contact, Search contact, edit contact or delete contact");
            System.out.println("Answer with '1', '2', '3', '4', '5' or '0' to exit application");
            answer = input.nextInt();
            Object Print = null;
            Add add = null;
            if (answer == 1)
                Add.add_contact();

            else if (answer == 2)
                Search.choose_field();
            else if (answer == 4)
                Change.choose_field();
            else if (answer == 5)
                Delete.choose_field();
        }
        while (answer != exit);
        System.out.println("Application terminating");

    }
}