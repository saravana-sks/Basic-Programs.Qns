import java.util.Scanner;

public class fact_and_exponent {
    public static void main(String[] args){
        Scanner scan=new Scanner((System.in));
        System.out.println("enter the base");
        int base=scan.nextInt();
        System.out.println("enter the exponent");
        int exponent=scan.nextInt();
        int result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;
        }
        System.out.println("the value is   " + result);
       // factorial  
        int fact=1,sum=0;
for(int i=1;i<=4;i++){
    fact=fact*i;

     sum+=fact;
}
System.out.println(sum );


    }

}
