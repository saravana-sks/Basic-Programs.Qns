import java.util.Scanner;

public class Strong_num {
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        int num=in.nextInt();
        int origianl =num;
        int sum=0;
        while (num>0)
         {
            int digit =num%10;
            int fact  = 1,i;
            for (i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num/=10;
        }
        if(sum==origianl){
            System.out.println("The num is strong number ");
        }
        else{
            System.out.println("Not an strong number");
        }
    }}
