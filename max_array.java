import java.util.Arrays;
import java.util.Scanner;
public class max_array {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int [] arr=new int[5];
      for(int i=0;i<= arr.length-1;i++){
        arr[i]=in.nextInt();
      }
      System.out.println(Arrays.toString(arr));
      System.out.println(max(arr));

        
      
    }
    
    static int max(int[] arr){
        int max=arr[0];
        for (int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max= arr[i];
            }
           
        }
        return max;
    }
} 
    
   