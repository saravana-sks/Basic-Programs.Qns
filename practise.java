
// User function Template for Java

class Solution {
    
    public static void main(String[] str){
        String s="abba";
        if(isPalindrone(s)){
            System.out.println("true");
        }
        else 
        {
            System.out.println("falsed");
        }
        
    }
       static  boolean isPalindrone(String s) {
        String result="";
        for(int i=3;i>=0;i--){
             result+=(s.charAt(i));
        }
    if(result.equals(s)){
        return true ;
    }
      return false;      
        }
    }
