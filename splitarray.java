public class splitarray {

     public static void main(String[] args) {
        int[] arr={7, 2, 5, 10, 8};
        int k=2;
        int result=splitarray(arr,k);
        System.out.println("the minimized largest value is " + result);
        
     }
     static int splitarray(int[] arr,int split){
        int max=0;
        int sum=0;
        int k=split;
        for(int num:arr){
            max=Math.max(max, num);
            sum+=num;
        }
            int left =max;
            int right=sum;
            while(left<right){
                int mid=left+(right-left)/2;
                if(cansplit(arr,k,mid)){
            right=mid;
                }
                else{
                    left=mid+1;
                }
            } 
            return right;
        }
            public static boolean cansplit(int[] arr,int k,int se){
                int count=1;
                int countnums=0;
                for(int num:arr){
if(countnums+num>se){
    count++;
    countnums=num;
}
else{
    countnums+=num;
}
                }
                return count<=k;
            }
        
     }
    

