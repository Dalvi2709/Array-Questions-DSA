public class test {
 public static void main(String[] args) {
    int arr [] = {1,2,3,5,6}; 
    int n = arr.length;
    int t = n * (n-1) / 2;
    int m = 0;
    for (int i = 0; i < arr.length; i++) {
         m = m+arr[i];
         m = t - n;
    }
      System.out.println(m);
 }
}
