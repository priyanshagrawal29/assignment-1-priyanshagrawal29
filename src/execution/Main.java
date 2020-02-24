package execution;

import definition.MyContact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyContact User = new MyContact();
        boolean response = true;
        do {
            System.out.println("Welcome to Srishti's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            String str = sc.next();
            if (str.length() > 1) {
                System.out.println("Invaild Option");
                continue;
            }
            char choice = str.charAt(0);
            switch (choice) {
                case '1':
                    User.addContact();
                    break;
                case '2':
                    User.viewContacts();
                    break;
                case '3':
                    User.searchContact();
                    break;
                case '4':
                    User.deleteContact();
                    break;
                case '5':
                    System.out.println("Thank You");
                    System.out.println("Have a great Day");
                    response = false;
                    break;
                default:
                    System.out.println("Invaild Option");
            }

        } while (response);

        sc.close();
    }
}
