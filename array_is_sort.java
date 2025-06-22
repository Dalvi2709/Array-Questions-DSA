public class array_is_sort {
    public static void main(String[] args) {
        int arr[] = {4, 3};

        boolean asc = true, desc = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) asc = false;
            if (arr[i] < arr[i + 1]) desc = false;
        }

        if (asc) {
            System.out.println("ascending");
        } else if (desc) {
            System.out.println("descending");
        } else {
            System.out.println("not sorted");
        }
    }
}
