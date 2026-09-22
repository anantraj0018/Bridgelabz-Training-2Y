import java.util.*;

class Book {
    int bookId;
    String title;
    String author;
    double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class LibraryManagementSystem {

    
    public static int removeDuplicates(Book[] books, int n) {
        if (n == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (books[i].bookId != books[j].bookId) {
                j++;
                books[j] = books[i];
            }
        }

        return j + 1;
    }

    
    public static void searchByTitle(Book[] books, int count, String query) {
        System.out.println("\nSearch Results for '" + query + "':");

        boolean found = false;
        query = query.toLowerCase();

        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(query)) {
                System.out.println("- Found: [" + books[i].bookId + "] "
                        + books[i].title + " (Rs. " + books[i].price + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found.");
        }
    }

    
    public static void sortByPrice(Book[] books, int count) {
        int swaps = 0;

        for (int i = 0; i < count - 1; i++) {
            int min = i;

            for (int j = i + 1; j < count; j++) {
                if (books[j].price < books[min].price) {
                    min = j;
                }
            }

            if (min != i) {
                Book temp = books[i];
                books[i] = books[min];
                books[min] = temp;

                swaps++;
            }
        }

        System.out.println("\nBooks Sorted by Price:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". [" + books[i].bookId + "] "
                    + books[i].title + " - Rs. " + books[i].price);
        }

        System.out.println("Total Swaps: " + swaps);
    }

    
    public static int searchByPrice(Book[] books, int count, double targetPrice) {
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (books[mid].price == targetPrice) {
                return mid;
            }

            if (books[mid].price < targetPrice) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    
    public static int minBooksForTargetCost(Book[] books, int count, double targetCost) {
        int left = 0;
        double sum = 0;
        int minLength = count + 1;

        for (int right = 0; right < count; right++) {
            sum = sum + books[right].price;

            while (sum >= targetCost) {
                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                }

                sum = sum - books[left].price;
                left++;
            }
        }

        if (minLength == count + 1) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            books[i] = new Book(id, title, author, price);
        }

        
        int count = removeDuplicates(books, n);

        System.out.println("\nUnique Books Count: " + count);

        System.out.println("Books after removing duplicates:");

        for (int i = 0; i < count; i++) {
            System.out.println("[" + books[i].bookId + "] "
                    + books[i].title + " - Rs. " + books[i].price);
        }

        
        System.out.print("\nEnter title to search: ");
        String query = sc.nextLine();

        searchByTitle(books, count, query);

        
        sortByPrice(books, count);

        
        System.out.print("\nEnter price to search: ");
        double targetPrice = sc.nextDouble();

        int index = searchByPrice(books, count, targetPrice);

        if (index != -1) {
            System.out.println("Book found at index " + index + ": ["
                    + books[index].bookId + "] "
                    + books[index].title + " (Rs. "
                    + books[index].price + ")");
        } else {
            System.out.println("Book not found.");
        }

       
        System.out.print("\nEnter target cost: ");
        double targetCost = sc.nextDouble();

        int result = minBooksForTargetCost(books, count, targetCost);

        if (result == 0) {
            System.out.println("No consecutive books found.");
        } else {
            System.out.println("Minimum Consecutive Books Needed: " + result);
        }

        sc.close();
    }
}