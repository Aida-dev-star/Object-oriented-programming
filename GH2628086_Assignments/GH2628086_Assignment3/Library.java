import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Borrower> borrowers = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void addUser(Borrower borrower) {
        borrowers.add(borrower);
    }

    public Item searchItem(String title) {
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public Borrower searchBorrower(String name) {
        for (Borrower b : borrowers) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n******* MENU ********");
            System.out.println("1- Add User");
            System.out.println("2- Add Book");
            System.out.println("3- Borrow a Book");
            System.out.println("4- Return a Book");
            System.out.println("5- Search Book by Name");
            System.out.println("6- Search Borrower by Name");
            System.out.println("7- Quit");
            System.out.println("************************");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 7) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String uname = sc.nextLine();
                    lib.addUser(new Borrower(uid, uname));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int bid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();
                    lib.addItem(new Book(bid, title, author, genre));
                    break;

                case 3:
                    System.out.print("Enter borrower name: ");
                    Borrower b = lib.searchBorrower(sc.nextLine());
                    System.out.print("Enter book title: ");
                    Item item = lib.searchItem(sc.nextLine());

                    if (b != null && item != null) {
                        b.borrowItem(item);
                    } else {
                        System.out.println("Borrower or Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter borrower name: ");
                    Borrower br = lib.searchBorrower(sc.nextLine());
                    System.out.print("Enter book title: ");
                    Item it = lib.searchItem(sc.nextLine());

                    if (br != null && it != null) {
                        br.returnItem(it);
                    } else {
                        System.out.println("Borrower or Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter book title: ");
                    Item found = lib.searchItem(sc.nextLine());
                    if (found != null) {
                        found.displayInfo();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter borrower name: ");
                    Borrower foundB = lib.searchBorrower(sc.nextLine());
                    if (foundB != null) {
                        foundB.displayInfo();
                    } else {
                        System.out.println("Borrower not found.");
                    }
                    break;
            }
        }

        sc.close();
        System.out.println("Program exited.");
    }
}