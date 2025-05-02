public class example_qns {
    public static void main (String [] args){
int[] [] arr={{1,2,3},{4,5,6},{7,8,9}};
int max=Integer.MIN_VALUE;

for(int i=0;i<3;i++){
    int sum=0;
    for(int j=0;j<3;j++){
sum+=arr[i][j];
    }
    if(sum>max){
    max=sum;
    }
}
System.out.println("the largest value of row is " +  max);
    }
}
