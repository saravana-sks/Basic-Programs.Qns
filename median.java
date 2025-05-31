public class median {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10,11};
        int n1=arr1.length;
        int n2=arr2.length;
        int res[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }
            else{
                res[k++]=arr2[j];
            }
        }
        while(i<n1) {
    res[k++]=arr1[i++];        
        }
        while(j<n2){
            res[k++]=arr2[j++];
        }
        int len=res.length;
        if(len%2==0){
            System.out.println(res[(len/2-1 + len/2)/2]);
        }
        else{
            System.out.println(res[len/2]);
        }
    }
}
