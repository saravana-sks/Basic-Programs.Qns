import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        int num=scan.nextInt();
        int original_num=num;
        int digits=String.valueOf(original_num).length();
        int sum =0;
        while(num>0){
            int digit = num%10;
            sum+=Math.pow(digit,digits);
            num/=10;
        }
        if(sum==original_num){
            System.out.println("The number is armstronng Number");
        }
        else{
            System.out.println("Not an armstrong");
        }
    }
}
