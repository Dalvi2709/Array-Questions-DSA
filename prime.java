public class prime {
    public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
                for (int i = 0; i < arr.length; i++) {
                    int num = arr[i];
                    int count = 0;
        
                    if (num > 1) {
                        for (int j = 2; j <= num / 2; j++) {
                            if (num % j == 0) {
                                count = 1;
                                break;
                            }
                        }
                        if (count == 0)
                            System.out.print(num + " ");
                    }
                }
    }
}
