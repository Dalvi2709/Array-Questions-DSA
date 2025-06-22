public class second_largest_element {
    public static void main(String[] args) {
        int arr [] = {6,2,24,5,12};
        int max = arr[0];
        int smax = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                smax = max;
                max = arr[i];
            }
             if (arr[i]>smax && arr[i]!=max) {
                smax = arr[i];
            } 

        }
        System.err.println("largesst element is :" + max);
        System.err.println(" Second largesst element is :" + smax);
    }
}
