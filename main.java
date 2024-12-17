import java.util.*;

import static java.util.Comparator.*;

public class main {

    LinkedList<Contact> contactlist = new LinkedList<Contact>();

    int count = 0;

    public main() {
        this.contactlist = contactlist;
    }

    // Method MENU
    static void menu() {
        System.out.println();
        System.out.println("~ Contacts List ~");
        System.out.println("[1] Add Contact");
        System.out.println("[2] Remove Contact");
        System.out.println("[3] View All Contacts");
        System.out.println("[4] View Contacts By Name");
        System.out.println("[5] Quit");
        System.out.print("Choose: ");
    }

    // MAIN
    public static void main(String[] args) {

        main list = new main();

        while(true){
        menu();

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        while (choice > 5 || choice < 1){
            System.out.print("Wrong Input, Try Again: ");
            input = new Scanner(System.in);
            choice = input.nextInt();
        }


            switch (choice) {
                case 1:
                    list.addContact();
                    break;
                case 2:
                    list.removeContact();
                    break;
                case 3:
                    list.viewAll();
                    break;
                case 4:
                    list.sortAll();
                    break;
                case 5:
                    System.out.println("Closing...");
                    System.exit(0);
                    break;
            }
        }

    }

    // Method REMOVE CONTACT
    private void removeContact() {
        System.out.println();
        System.out.println("Enter First Name (to be deleted): ");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.next();
        System.out.print("Enter Last Name (to be deleted): ");
        Scanner lastNameInput = new Scanner(System.in);
        String lastName = lastNameInput.next();
        for (int index = 0; index < count; index++){

            if(contactlist.get(index).getFirstName().equals(name) &&
                    contactlist.get(index).getLastName().equals(lastName)){
                contactlist.remove(index);
                count--;
            }

        }
    }

    // Method ADD CONTACT
    private void addContact() {
        System.out.print("First Name: ");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.next();
        System.out.print("Last Name: ");
        Scanner lastNameInput = new Scanner(System.in);
        String lastName = lastNameInput.next();
        System.out.print("Phone number: ");
        Scanner numberInput = new Scanner(System.in);
        String number = numberInput.next();

        Contact entry;
        entry = new Contact(name, lastName, number);
        contactlist.add(entry);
        count++;
    }

    // Method VIEW CONTACTS
    public void viewAll() {
        System.out.println();
        for (int index = 0; index < count; index++) {
            System.out.println("--> " + index);
            contactlist.get(index).viewContacts();
            System.out.println();
        }
    }

    // Method SORT ALL
    public void sortAll() {
        System.out.println();
        contactComparator s = new contactComparator();
        Collections.sort(contactlist, s);
        for (int index = 0; index < count; index++) {
            System.out.println("--> " + index);
            contactlist.get(index).viewContacts();
            System.out.println();
        }
    }
}

class contactComparator implements Comparator<Contact> {

    @Override
    public int compare(Contact o1, Contact o2) {
        Contact s1 = (Contact) o1;
        Contact s2 = (Contact) o2;

        return s1.getFirstName().compareTo(s2.getFirstName());
    }

}

