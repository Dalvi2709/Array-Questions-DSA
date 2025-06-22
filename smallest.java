public class smallest {
    public static void main(String[] args) {
        int arr [] = {122,23,44,32,-14,34,88,64};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("smallest element in array is : " + min);
    }
}
