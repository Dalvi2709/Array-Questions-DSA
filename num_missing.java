public class num_missing {
    public static void main(String[] args) {
        int arr [] = {1,2,3,5,4,6,8,9};
        int sum = 0;
        int n = arr.length+1;
        int total = n * (n+1)/2;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("missing number is : " + (total - sum));
    }
}
