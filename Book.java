public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;
    private static int totalBooks = 0;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        totalBooks++;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book \"" + title + "\" borrowed successfully.");
        } else {
            System.out.println("Book \"" + title + "\" is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book \"" + title + "\" returned successfully.");
        } else {
            System.out.println("Book \"" + title + "\" is not currently borrowed.");
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "978-0547928227");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "978-0141439518");
        Book book3 = new Book("1984", "George Orwell", "978-0451524935");

        System.out.println("Total number of books: " + Book.getTotalBooks());
        book1.borrowBook();
        book2.borrowBook();
        book1.borrowBook();
        book1.returnBook();

        System.out.println("Total number of books: " + Book.getTotalBooks());

        System.out.println("Book 1 title: " + book1.getTitle());
        System.out.println("Book 1 author: " + book1.getAuthor());
        System.out.println("Book 1 ISBN: " + book1.getIsbn());
    }
}
