import java.util.Arrays;

public class twodarray {
    public static void main(String[] args){
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,14}};
        System.out.println(Arrays.toString(matrixsearch(matrix,8)));
    }
    public static int[] matrixsearch(int[][] matrix,int target){
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
if(target==matrix[r][c]){
return new int[] {r,c};
    }
    if(target<matrix[r][c]){
        c--;
    }
    if(target>matrix[r][c]){
        r++;
    }
        }
        return new int[] {-1,-1};
    }
}
