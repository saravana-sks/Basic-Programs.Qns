import java.util.Scanner;
public class Half_triangle {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+ " ");
                 c=a+b;
                 a=b;
                 b=c;

            }
            System.out.println();
        }
    }
}