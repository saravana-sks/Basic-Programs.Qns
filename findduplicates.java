import java.util.*;
public class findduplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,4,5,6,6,7,8,8,9};

System.out.println(result(arr));
    }
    public static List<Integer> result(int[] arr){
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
List<Integer> ans=new ArrayList<>();
for(int index=0;index<arr.length;index++){
    if(arr[index]!=index+1){
    ans.add(arr[index]);
    }
}
return ans;
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
