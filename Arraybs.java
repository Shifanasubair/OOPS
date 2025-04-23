import java.util.Arrays;
import java.util.Scanner;
public class Arraybs 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        int result = Arrays.binarySearch(arr, target);
        if (result >= 0)
        {
            System.out.println("Element " + target + " found at index " + result);
        }
        else 
        {
            System.out.println("Element " + target + " not found");
        }
        scanner.close();
    }                     
}

