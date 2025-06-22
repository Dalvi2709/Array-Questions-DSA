public class sort_the_array {
    public static void main(String[] args) {
       int arr [] = {2,3,4,5,223,4,6,3};
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
                 int temp;
                 if (arr[j]>arr[i]) {
                    temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                 }               
           }
       }
       for (int i = 0; i < arr.length; i++) {
           System.err.print(arr[i]+" ");
       }
    }
}
