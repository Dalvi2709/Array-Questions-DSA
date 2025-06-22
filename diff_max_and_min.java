import java.util.Arrays;

public class diff_max_and_min {
    public static void main(String[] args) {
        int arr [] = {8, 3, 7, 2, 5};
        int diff = 0;
        Arrays.sort(arr);
        diff = arr[arr.length-1]-arr[0];
        System.out.println(diff);
    }
}


