public class swap_max_min {
    public static void main(String[] args) {
        int arr [] = {2,12,52,24,32,66,5};
        int max = arr[0] , min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
