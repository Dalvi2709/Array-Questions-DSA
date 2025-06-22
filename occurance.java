public class occurance {
    public static void main(String[] args) {
        int arr [] = {1,4,6,4,2,68,75,3,2,4};
        int target = 4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i]==target) {
                count++;
             }   
        }
        System.out.println("number "+ target +" occurance is : "+ count);
    }
    
}
