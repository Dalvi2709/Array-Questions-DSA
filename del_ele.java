public class del_ele {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50,60};
        int target = 60;
        int count = 0;
        for(int i = 0; i< arr.length; i++) {
            if (target == arr[i]) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                count = count + 1;
                break;
            } 
        }
        if (count == 0) {
            System.out.println("target not found");
        }else{
            System.out.println("target deleted succusesfully");
            for (int i = 0; i < arr.length-1; i++) 
            {
            System.out.print(arr[i]+ " ");
            }
       }
        
    }
}
