import java.util.Arrays;

public class Bubble {

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
   
        Integer[] intArray = {5, 2, 9, 1, 3};
        bubbleSort(intArray);
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));
        String[] strArray = {"banana", "apple", "cherry", "date"};
        bubbleSort(strArray);
        System.out.println("Sorted String array: " + Arrays.toString(strArray));
    }
}

