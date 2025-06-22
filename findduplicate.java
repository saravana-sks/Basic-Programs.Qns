
public class findduplicate {

    public static void main(String[] args) {
        int[] arr={1,2,4,3,2,5};
        System.out.print(res(arr));
    }
    public static int res(int[] arr){
int i=0;
while(i<arr.length){
    if(arr[i]!=i+1){
        int correct=arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
        }
        else{
            return arr[i];
        }
    }
        else{
            i++;
        }
    }
    return -1;
}
        public static void swap(int[] arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
    }



