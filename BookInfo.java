import java.util.Scanner;
class Publisher 
{
    String name;
    Publisher(String name) 
    {
        this.name = name;
    }
}
class Book extends Publisher 
{
    String title;
    String author;
    Book(String name, String title, String author) 
    {
        super(name);
        this.title = title;
        this.author = author;
    }
}
class Literature extends Book
{
    String genre;
    Literature(String name, String title, String author, String genre) 
    {
        super(name, title, author);
        this.genre = genre;
    }
    void display() 
    {
        System.out.println("Literature Book Details:");
        System.out.println("Publisher: " + name);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("---------------------------");
    }
}
class Fiction extends Book 
{
    String theme;
    Fiction(String name, String title, String author, String theme)
    {
        super(name, title, author);
        this.theme = theme;
    }
    void display() 
    {
        System.out.println("Fiction Book Details:");
        System.out.println("Publisher: " + name);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Theme: " + theme);
        System.out.println("---------------------------");
    }
}
public class BookInfo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nEnter details for Book " + (i + 1));
            System.out.print("Enter category (literature/fiction): ");
            String category = sc.nextLine().toLowerCase();
            System.out.print("Enter publisher name: ");
            String publisher = sc.nextLine();
            System.out.print("Enter book title: ");
            String title = sc.nextLine();
            System.out.print("Enter author name: ");
            String author = sc.nextLine();
            if (category.equals("literature")) 
            {
                System.out.print("Enter genre: ");
                String genre = sc.nextLine();
                books[i] = new Literature(publisher, title, author, genre);
            } 
            else if (category.equals("fiction")) 
            {
                System.out.print("Enter theme: ");
                String theme = sc.nextLine();
                books[i] = new Fiction(publisher, title, author, theme);
            } 
            else 
            {
                System.out.println("Invalid category. Skipping this entry.");
                i--; // decrement to retry
            }
        }
	System.out.println("\n--- Book Details ---");
        for (Book b : books) 
        {
            if (b instanceof Literature) 
            {
                ((Literature) b).display();
            } else if (b instanceof Fiction)
            {
                ((Fiction) b).display();
            }
        }
        sc.close();
    }
}
        

