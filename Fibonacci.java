import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        int a=0,b=1,c;
        for(int i=0;i<=num;i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
