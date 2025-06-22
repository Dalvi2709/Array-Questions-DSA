import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
      int arr [] = {2,15,34,5,2,1};
      Arrays.sort(arr);
      
      int count = 1;
      for (int i=1; i<=arr.length; i++){
        if (i < arr.length && arr[i]==arr[i-1]){
          count++;
        } else{
          System.out.println(arr[i-1] + " : " + count);
          count = 1;
        }
      }       
  }
}