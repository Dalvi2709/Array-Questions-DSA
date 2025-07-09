import java.util.HashMap;
import java.util.Map;
public class occurance {
    public static void main(String[] args) {
        int arr [] = {1,4,6,4,2,68,75,3,2,4};
        // int target = 4;
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //      if (arr[i]==target) {
        //         count++;
        //      }   
        // }
        // System.out.println("number "+ target +" occurance is : "+ count);


        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.print(map);
    }
}
