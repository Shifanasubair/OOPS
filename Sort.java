import java.util.Scanner;
class LinearSearch
{
    public boolean search(int[] arr, int element) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == element)
            {
                return true; 
            }
        }
        return false;
    }
}
public class Sort
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size]; 
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();
        LinearSearch ls = new LinearSearch();  
        boolean found = ls.search(arr, element);  
        if (found)
        {
            System.out.println("Element " + element + " found in the array.");
        } else 
        {
            System.out.println("Element " + element + " not found in the array.");
        }
        scanner.close();
    }
}

