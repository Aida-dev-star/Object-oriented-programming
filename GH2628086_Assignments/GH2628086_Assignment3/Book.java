public class Book extends Item {
    private String author;
    private String genre;
    private boolean isBorrowed;

    public Book(int id, String title, String author, String genre) {
        super(id, title);
        this.author = author;
        this.genre = genre;
        this.isBorrowed = false;
    }

    public boolean isAvailable() {
        return !isBorrowed;
    }

    public void setBorrowed(boolean status) {
        isBorrowed = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + (!isBorrowed));
    }
}