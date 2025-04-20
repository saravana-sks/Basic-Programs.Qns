import java.util.Scanner;

public class perfect_num {
    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        int num=in.nextInt(),sum =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("This is the perfect number");
        }
        else{
            System.err.println("Not aan perfect number");
        }
    }
}
