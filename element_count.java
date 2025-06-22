public class element_count {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 2, 4, 2, 5};
        int targrt = 2;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targrt) {
                c++;
            }
        }
        System.out.println("element count = " + c);
    }
}
