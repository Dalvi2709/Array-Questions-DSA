public class find_duplicate {
    public static void main(String[] args) {
       int[] arr = {1,4, 1,1, 2, 2, 4};
       for(int i = 0; i < arr.length; i++) {
          for(int j = i + 1; j < arr.length; j++) {
             if (arr[i] == arr[j]) {
                System.out.print(arr[i] + " ");
                break;
             }
          }
       }
    }
 }