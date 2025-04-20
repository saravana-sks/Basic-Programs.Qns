import java.util.Scanner;
public class paliodrone {
   public static void main(String[] args){
    Scanner in = new Scanner (System.in);
   int num=in.nextInt();
   palidrone(num);
}
static void palidrone(int num){
   int reverse=0;
while (num>0) {
 int digit=num%10;
 reverse=reverse*10+digit;
 num/=10;



}

    System.out.println("the reverse is " + reverse);

}

}
  

