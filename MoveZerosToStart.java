public class MoveZerosToStart {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = arr.length - 1;  // Start from the end

        // Move non-zero elements to the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }

        // Fill the beginning with zeros
        while (index >= 0) {
            arr[index--] = 0;
        }

        // Print result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
