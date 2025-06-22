

class missingpositive{
    public static void main(String[] args){
        int[] arr={1,2,4,5,6};
        
        System.out.println(result(arr));
    }
    public static int result(int[] arr){
int i=0;
while(i<arr.length){
    int correct=arr[i]-1;
    if( arr[i] > 0 && arr[i]<=arr.length &&arr[i]!=arr[correct] ){
        swap(arr,i,correct);
    }
    else{
        i++;
    }
}
for(int j=0;j<arr.length;j++){
    if(arr[j]!=j+1){
        return j+1;
    }
}
return arr.length+1;
    }
         public static void swap(int[] arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
         }
}