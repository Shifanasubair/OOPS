import java.util.Scanner;
public class Binary
{
    public static int binarySearch(int[] arr, int target)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
            {
                return mid; 
            }
           
            else if (arr[mid] > target) 
            {
                high = mid - 1;
            }
       
            else 
            {
                low = mid + 1;
            }
        }

        return -1; 
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the sorted elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        int result = binarySearch(arr, target);
        if (result != -1) 
        {
            System.out.println("Element found at index: " + result);
        } else 
        {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}

