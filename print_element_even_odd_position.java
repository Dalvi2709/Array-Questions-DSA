public class print_element_even_odd_position {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 40, 50};
        System.out.print("even indexes ");
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();
        System.out.print("odd indexes ");
        for (int i = 0; i < arr.length; i++) {
            if (i%2!=0) {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
