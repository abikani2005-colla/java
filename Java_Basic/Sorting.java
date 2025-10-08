
public class Sorting {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 7};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        //System.out.print("Sorted array: " +Arrays.toString(arr));
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
