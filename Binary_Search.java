import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args){
        int[]  arr={1,2,3,4,5,6,7,8,9};
        Scanner scan=new Scanner(System.in);
        int target=scan.nextInt();
        int result=binarysearch(arr,target);
        System.out.println(result);
        }

        static int binarysearch(int[] arr,int target){
int start=0;
int end=arr.length-1;

while(start<end){
    int  mid=start+(end-start)/2;
    if(arr[mid]==target){
        return mid;
    }
if(target<arr[mid]){
    end=mid-1;
}
else if(target>arr[mid]){
    start=mid+1;
}

}
return -1;
        }
}
