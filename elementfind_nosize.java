public class elementfind_nosize {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,56,88,899,999};
        int target=899;
int res=rest(arr,target);
System.out.println(res);
    }
    public static int rest(int[] arr,int target){
    int start=0;
    int end=1;
    while(target>arr[end]){
    int temp=end+1;
         int laast=end+(end-start+1)*2;
         if(laast<arr.length){
            end=laast;
         }
         else{
            end=arr.length-1;
         }
    start=temp;

    }
    return(binarysearch(arr,target,start,end));


}
static int binarysearch(int[] arr,int target,int start,int end){


while(start<=end){
    int  mid=start+(end-start)/2;
    if(arr[mid]==target){
        return mid;
    }
if(target<arr[mid]){
    end=mid-1;
}
 if(target>arr[mid]){
    start=mid+1;
}

}
return -1;
        }
}

