import java.util.Scanner;
public class Recursivebs
{
    public static int recursiveSearch(int[] arr, int low, int high, int target)
    {
        if (low > high) 
        {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid; 
        }
        if (arr[mid] > target) 
        {
            return recursiveSearch(arr, low, mid - 1, target);
        }
        return recursiveSearch(arr, mid + 1, high, target);
    }
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
        int result = recursiveSearch(arr, 0, arr.length - 1, target);
        if (result != -1) 
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
                                                                                  
