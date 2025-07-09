public class cheack_target {
    public static void main(String[] args) {
        int arr [] = {1,4,6,3,7,5,4};
        int target = 4;

        for ( int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                System.out.println(i);
            }
        }
    }
}











