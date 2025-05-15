import java.util.Scanner;;
class product_and_sum{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int digits=String.valueOf(n).length();
        int res=subtractProductAndSum(n, digits); 
        System.out.println(res);
    }
    static  int subtractProductAndSum(int n,int digits) {
    int product=1;
    int sum=0;
        for(int i=1;i<=digits;i++){
            int digit=n%10;
            product*=digit;
            sum+=digit;
            n/=10;
        }
               
                
              return (product-sum);
    }
}
