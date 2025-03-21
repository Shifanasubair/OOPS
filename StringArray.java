import java.util.Scanner;

class StringArray 
{
    void userDefineSort(String str[], int length) 
    {
      int i, j;
      String temp;
      for (i = 0; i < length; i++) 
      {
        for (j = i + 1; j < length; j++) 
        {
            if (str[i].compareTo(str[j]) > 0) 
            {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("\nSorted array using user-defined method:");
        for (String s : str) 
        {
            System.out.println(s);
        }
    }

    void javaUtilSort(String str[], int length)
    {
        java.util.Arrays.sort(str);
        System.out.println("\nSorted array using Java's built-in method:");
        for (String s : str) 
        {
            System.out.println(s);
        }
    }

    void displayMenu()
    {
        System.out.println("\nMenu:");
        System.out.println("1. Sort using user-defined method");
        System.out.println("2. Sort using Java's built-in method");
        System.out.println("3. Exit");
    }

 
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        StringArray stringArray = new StringArray();
        System.out.print("Enter the number of strings you want to sort: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++)
        {
            str[i] = scanner.nextLine();
        }
        int choice;
        do
        {
            stringArray.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) 
            {
                case 1:
                    stringArray.userDefineSort(str, n);
                    break;
                case 2:
                    stringArray.javaUtilSort(str, n);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

