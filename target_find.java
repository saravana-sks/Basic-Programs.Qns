import java.util.Scanner;

public class target_find {
    public static void main (String [] args ){
        int[] arr={12,3,4,56,7,8,90,87,45,77,89,43,55,66};
        System.out.println("Enter the target");
        Scanner scan=new Scanner(System.in);
        int target=scan.nextInt();
        int result=linear_search(arr,target);
        System.out.println("element is present at the index "+ result);
    }
    static int linear_search(int[]  arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    
}

