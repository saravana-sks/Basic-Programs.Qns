import java.util.Arrays;
import java.util.Scanner;
public class reverse_array{

    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int [] arr=new int[5];
      for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
      }
      System.out.println(Arrays.toString(arr));
      reverse(arr);
      System.out.println(Arrays.toString(arr));
    }
    static void  reverse(int[] arr){
      int start=0;
      int end=arr.length-1;
      for(int i=start;i<=end;i++){

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end --;

      }
      
    }
  }
