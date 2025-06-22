public class union_of_two_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,4,5};
        int[] arr2 = {6,7,8,4};
        System.out.print("Union: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            int j;
            for (j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) 
                break; 
            }
            if (j == arr1.length) System.out.print(arr2[i] + " ");
        }
    }
}
