import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
 public static void main(String [] args){
ArrayList<Integer> list= new ArrayList<>();
// adding the elemnts 
list.add(11);
list.add(21);
list.add(31);
list.add(41);
list.add(51);
list.add(61);
list.add(71);
list.add(81);
list.add(91);
list.add(1);
System.out.println(list);

// removing the element
list.remove(1);
System.out.println(list);

// get the size 
System.out.println(list.size());

//get the element
System.out.println(list.get(4));

//update the element
list.set(1,27 );
System.out.println(list);

// contain method
System.out.println(list.contains(27));
}    
}
