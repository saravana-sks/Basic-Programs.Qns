import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println((Arrays.toString(arr)));
    }
    public static void reverse(int[] arr){
        int mid=arr.length/2;
        int length=arr.length-1;
        for(int i=0;i<mid;i++){
            int temp=arr[i];
            arr[i]=arr[length];
            arr[length]=temp;
            length--;

        }
    }
}
