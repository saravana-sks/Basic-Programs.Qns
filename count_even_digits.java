public class count_even_digits{
    public static void main (String[] args ){
        int[] num={1,3,54,7889,68,98787,988};
      int  count =0;
      for(int numb: num){
            if(evens(numb)){
               count++; 
            }
        }
        System.out.println("the count is " + count);
    }
        static boolean evens(int numb){
int digits=String.valueOf(numb).length();
return digits%2==0;
        }

    }

