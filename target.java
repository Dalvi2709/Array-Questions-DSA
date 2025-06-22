public class target {
    public static void main(String[] args) {
         int arr [] = {1,4,5,7,87,6,9};
         int target = 4;

         for ( int i = 0; i < arr.length; i++) {
             if (arr[i]==target) {
                 System.out.println(i);
             }
         }

    }
}
