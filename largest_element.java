public class largest_element {
    public static void main(String[] args) {
        int arr [] = {1,2,11,23};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.err.println("maximum number in array is : "+ max);
    }
}
