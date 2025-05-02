import java.util.Scanner;

public class Find_element2D{
    public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=scan.nextInt();
            }
            System.out.println();
        }
System.out.println("you entered");
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        System.out.print(arr[i][j] + " ");
    }
    System.out.println(" ");
    }
    System.out.println("Enter the Target ");
    int target=scan.nextInt();
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           
if(arr[i][j]==target){
    System.out.println("Element is present at index "+ i + j);
}
           }
        }
    }
}
    


