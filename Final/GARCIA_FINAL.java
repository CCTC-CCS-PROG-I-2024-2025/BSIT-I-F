import java.util.Scanner;

public class LibraryManagementSystem {

    // Array to store book titles
    private static String[] bookTitles = new String[10];
    private static boolean[] isAvailable = new boolean[10];
    private static int bookCount = 0;

    // Method to display the menu
    public static void displayMenu() {
        System.out.println("Library Management System");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Exit");
        System.out.print("Choose an option (1-5): ");
    }

    // Method to add a book
    public static void addBook(String title) {
        if (bookCount < bookTitles.length) {
            bookTitles[bookCount] = title;
            isAvailable[bookCount] = true; // Mark the book as available
            bookCount++;
            System.out.println("Book added: " + title);
        } else {
            System.out.println("Cannot add more books. Maximum limit reached.");
        }
    }

    // Method to view all books
    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("No books available.");
        } else {
            System.out.println("List of Books:");
            for (int i = 0; i < bookCount; i++) {
                String availability = isAvailable[i] ? "Available" : "Borrowed";
                System.out.println((i + 1) + ". " + bookTitles[i] + " - " + availability);
            }
        }
    }

    // Method to borrow a book
    public static void borrowBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (bookTitles[i].equalsIgnoreCase(title)) {
                if (isAvailable[i]) {
                    isAvailable[i] = false; // Mark the book as borrowed
                    System.out.println("You have borrowed: " + title);
                    return;
                } else {
                    System.out.println("Sorry, the book is currently borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found: " + title);
    }

    // Method to return a book
    public static void returnBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (bookTitles[i].equalsIgnoreCase(title)) {
                if (!isAvailable[i]) {
                    isAvailable[i] = true; // Mark the book as available
                    System.out.println("You have returned: " + title);
                    return;
                } else {
                    System.out.println("This book was not borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found: " + title);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    addBook(title);
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    borrowBook(borrowTitle);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    returnBook(returnTitle);
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

            System.out.println(); // Print a new line for better readability

        } while (choice != 5); // Loop until the user chooses to exit

        scanner.close(); // Close the scanner
    }
}