public class copy_array_in_second_array {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5,6};
        int arr2 [] = arr1.clone();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] +" ");
        }
    }
}
  