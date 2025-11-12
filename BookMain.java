import java.util.Scanner;
class Book {
    String name, author;
    int price, num_pages;
    public Book(String name, String author, int price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNum(int num_pages) {
        this.num_pages = num_pages;
    }

    @Override
    public String toString() {
        return "Name=" + name + 
               "\nAuthor=" + author + 
               "\nPrice=" + price + 
               "\nNum_pages=" + num_pages;
    }
}
public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of books:");
        int n = sc.nextInt();
        sc.nextLine(); 
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Enter book name: ");
            String name = sc.nextLine();

            System.out.print("Enter author name: ");
            String author = sc.nextLine();

            System.out.print("Enter book price: ");
            int price = sc.nextInt();

            System.out.print("Enter number of pages: ");
            int num_pages = sc.nextInt();
            sc.nextLine();
            books[i] = new Book(name, author, price, num_pages);
        }
        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + ":\n" + books[i]);
        }
    }
}
