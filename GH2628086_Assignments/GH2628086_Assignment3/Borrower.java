import java.util.ArrayList;

public class Borrower extends User {
    private ArrayList<Item> borrowedItems;

    public Borrower(int id, String name) {
        super(id, name);
        borrowedItems = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Borrower ID: " + id);
        System.out.println("Name: " + name);
        displayBorrowedItems();
    }

    public void borrowItem(Item item) {
        if (item instanceof Book) {
            Book book = (Book) item;

            if (book.isAvailable()) {
                borrowedItems.add(book);
                book.setBorrowed(true);
                System.out.println("Book borrowed successfully.");
            } else {
                System.out.println("Book is already borrowed.");
            }
        }
    }

    public void returnItem(Item item) {
        if (borrowedItems.remove(item)) {
            ((Book) item).setBorrowed(false);
            System.out.println("Book returned.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void displayBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("No borrowed items.");
        } else {
            for (Item item : borrowedItems) {
                item.displayInfo();
            }
        }
    }
}