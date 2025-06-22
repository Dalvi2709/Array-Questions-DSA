public class first_and_last_occurance {

    public static void main(String[] args) {
        int arr [] = {1,4,5,3,2,4,5,2,2,4,5};
        int target = 4;
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                if (first==-1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("first occurance of target is : " + first);
        System.out.println("last occurance of target is : " + last);
    }
}