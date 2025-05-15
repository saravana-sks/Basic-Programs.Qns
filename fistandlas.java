
import java.util.Arrays;

class firt_and_last {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 7, 4, 5, 5, 0};
        int target = 4;
        int[] arrs = new int[2];

        arrs[0] = search(arr, target, true);  
        arrs[1] = search(arr, target, false); 

        System.out.println(Arrays.toString(arrs));  
    }

    public static int search(int[] arr, int target, boolean con) {
        int res = -1; 
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;  

            if (target < arr[mid]) {
                end = mid - 1;  
            } else if (target > arr[mid]) {
                start = mid + 1; 
            } else {
                res = mid;  
                if (con) {
                } else {
                   
                    if (mid + 1 < arr.length && arr[mid + 1] == target) {
                        start=mid+1;
                    } else {
                        break;  
                    }
                }
            }
        }
        return res;  
    }                      

}
