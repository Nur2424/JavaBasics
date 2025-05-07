/*
Assignment 
• Modeling Book and Libraries
  - class Book 1
  - class Libraryl}
• Books can be
  - Borrowed
  - Returned
• Library
  - Keeps track of books
  - Hint: use Book[]
*/


// Main class: where the program starts
public class Main {
    public static void main(String[] args) {
        // Create an array of Book objects
        Book[] books = {
            new Book("Book A"),
            new Book("Book B"),
            new Book("Book C")
        };

        // Create a Library object and give it the books
        Library library = new Library(books);

        // List all books that are available
        library.listAvailableBooks();

        // Borrow a book by its title
        library.borrowBook("Book B");

        // Return the book
        library.returnBook("Book B");
    }
}

// Book class represents a single book
class Book {
    private String title;       // Title of the book
    private boolean isBorrowed; // Whether the book is borrowed

    // Constructor: called when a new Book is created
    public Book(String title) {
        this.title = title;
        this.isBorrowed = false; // Book is available when created
    }

    // Getter method to get the book's title
    public String getTitle() {
        return title;
    }

    // Check if the book is currently borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Mark the book as borrowed
    public void borrow() {
        isBorrowed = true;
    }

    // Mark the book as returned
    public void returnBook() {
        isBorrowed = false;
    }
}

// Library class represents a collection of books
class Library {
    private Book[] books; // Array to store books

    // Constructor: takes an array of Book objects
    public Library(Book[] books) {
        this.books = books;
    }

    // Method to list all books that are not borrowed
    public void listAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    // Method to borrow a book by title
    public void borrowBook(String title) {
        for (Book book : books) {
            // Find the book with the matching title that is not borrowed
            if (book.getTitle().equals(title) && !book.isBorrowed()) {
                book.borrow(); // Mark as borrowed
                System.out.println("You borrowed: " + title);
                return;
            }
        }
        System.out.println("Sorry, that book is not available.");
    }

    // Method to return a borrowed book
    public void returnBook(String title) {
        for (Book book : books) {
            // Find the book with the matching title that is currently borrowed
            if (book.getTitle().equals(title) && book.isBorrowed()) {
                book.returnBook(); // Mark as returned
                System.out.println("You returned: " + title);
                return;
            }
        }
        System.out.println("Sorry, that book was not borrowed.");
    }
}


/*
===========================================
  🌟 QUICK OOP CONCEPTS IN JAVA (BEGINNER)
===========================================

1. CLASS
- A class is a blueprint for creating objects.
- Класс — это план создания объектов.
Example:
  class Book {
      String title;
      void read() { }
  }

2. OBJECT
- An object is an instance of a class.
- Объект — это экземпляр класса.
Example:
  Book myBook = new Book();

3. ENCAPSULATION
- Hides internal data using private variables and public methods (getters/setters).
Example:
  private String title;
  public String getTitle() {
      return title;
  }

4. METHOD
- A method defines an action or behavior in a class.
Example:
  public void borrow() {
      isBorrowed = true;
  }

5. CONSTRUCTOR
- A special method called when creating a new object.
Example:
  public Book(String title) {
      this.title = title;
  }

6. INHERITANCE
- Allows one class to inherit features (fields and methods) from another.
Example:
  class Ebook extends Book {
      int fileSize;
  }

7. POLYMORPHISM
- The same method behaves differently depending on the object.
Example:
  class Book {
      void read() { System.out.println("Reading a book"); }
  }
  class Comic extends Book {
      void read() { System.out.println("Reading a comic"); }
  }

8. ABSTRACTION
- Hides unnecessary details; shows only essential parts.
Example:
  abstract class Shape {
      abstract void draw();
  }

9. ARRAYS AND COLLECTIONS
- You can store multiple objects in arrays or ArrayLists.
Example:
  Book[] books = new Book[5];

===========================================
You are already using many of these in your
Library & Book program!
===========================================
*/

