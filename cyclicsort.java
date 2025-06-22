import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
           int[] arr={5,4,1,3,2};
           cyclic(arr);
           System.out.print(Arrays.toString(arr));
    }
    public static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }

            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
