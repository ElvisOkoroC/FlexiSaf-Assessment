import java.util.ArrayList;

// Class representing a Book
class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to display book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

// Class to manage a collection of books
public class BookManager {
    private ArrayList<Book> bookCollection;

    // Constructor
    public BookManager() {
        bookCollection = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added successfully: " + book);
    }

    // Method to remove a book by ISBN
    public void removeBook(String isbn) {
        boolean found = false;
        for (Book book : bookCollection) {
            if (book.getIsbn().equals(isbn)) {
                bookCollection.remove(book);
                System.out.println("Book removed successfully: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Method to display all books
    public void displayBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : bookCollection) {
                System.out.println(book);
            }
        }
    }
}
import java.util.ArrayList;

// Class representing a Book
class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to display book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

// Class to manage a collection of books
public class BookManager {
    private ArrayList<Book> bookCollection;

    // Constructor
    public BookManager() {
        bookCollection = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added successfully: " + book);
    }

    // Method to remove a book by ISBN
    public void removeBook(String isbn) {
        boolean found = false;
        for (Book book : bookCollection) {
            if (book.getIsbn().equals(isbn)) {
                bookCollection.remove(book);
                System.out.println("Book removed successfully: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Method to display all books
    public void displayBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : bookCollection) {
                System.out.println(book);
            }
        }
    }
}
import java.util.ArrayList;

// Class representing a Book
class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to display book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

// Class to manage a collection of books
public class BookManager {
    private ArrayList<Book> bookCollection;

    // Constructor
    public BookManager() {
        bookCollection = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added successfully: " + book);
    }

    // Method to remove a book by ISBN
    public void removeBook(String isbn) {
        boolean found = false;
        for (Book book : bookCollection) {
            if (book.getIsbn().equals(isbn)) {
                bookCollection.remove(book);
                System.out.println("Book removed successfully: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Method to display all books
    public void displayBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : bookCollection) {
                System.out.println(book);
            }
        }
    }
}
