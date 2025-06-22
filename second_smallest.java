public class second_smallest {
    public static void main(String[] args) {
        int arr [] = { 4,3,2,56,32,65,7};
        int min = arr[0];
        int smin = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                smin = min;
                min = arr[i];
            }else if (arr[i]<smin && arr[i]!=min) {
                smin = arr[i];
            }
        }
        System.err.println("second smallest element in array is : " + smin);
    }
}
