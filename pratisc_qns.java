public class pratisc_qns {
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,7,9};
        System.out.print(high(arr));

        

    }
    public static int high(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
return min;
    }
}
