public class find_pairs_add_target {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int sum = 6;
        System.out.print("pairs : ");
        for (int i = 0; i < arr.length-1; i++) {
             for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==sum) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                }
             }
        }
    }
}
