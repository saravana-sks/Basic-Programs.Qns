import java.util.Scanner;

public class Linear_search{
    public static void main (String [] args ){
        int[] arr={12,3,4,56,7,8,90,87,45,77,89,43,55,66};
        System.out.println("Enter the first target");
        Scanner scan=new Scanner(System.in);
        int target_1=scan.nextInt();
        int result_1=linear_search(arr,target_1);
        System.out.println("element is present at the index "+ result_1);
        System.out.println("Finding the index of the second target between the raange ");
        System.out.println("enter the starting index");
        int start=scan.nextInt();
        System.out.println("enter the end index");
        int end= scan.nextInt();
        System.out.println("enter the second target");
        int target_2=scan.nextInt();
        int result_2=linear_search(arr, target_2,start,end);
        System.out.println("Second Target is present at index "+ result_2);
    
    }
    static int linear_search(int[]  arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

            // target the elemment within the range and retturn it index

    static int linear_search(int[] arr,int target_2,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==arr[target_2]){
                return i;
            }
        }
        return -1;
    }        

    
}

