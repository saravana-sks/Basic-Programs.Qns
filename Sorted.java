import java.util.Arrays;

public class Sorted{
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.toString(search(arr,9)));
    }
    public static int[] search(int[][] matrix ,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int cmid=cols/2;
        if(cols==0){
            return new int[] {-1,-1};
        }
        if(rows==1){
return binarysearch(matrix,0,0,cols-1,target);
        }
    int rstart=0;
    int rend=rows-1;
      while(rstart<(rend-1)){
        int mid=rstart+(rend-rstart)/2;
        if(matrix[mid][cmid]==target){
            return new int[] {mid,cmid};
        }
        if(target<matrix[mid][cmid]){
            rend=mid;
        }
        else{
            rstart=mid;
        }
      }
      if(matrix[rstart][cmid]==target){
        return new int[] {rstart,cmid};
      }
      if(matrix[rstart+1][cmid]==target){
        return new int[] {rstart+1,cmid};
      }
      if(target<=matrix[rstart][cmid-1]){
        return binarysearch(matrix,rstart,0,cmid-1,target); 
      }
      if(target>=matrix[rstart][cmid+1] && target<=matrix[rstart][cols-1]){
        return binarysearch(matrix,rstart,cmid+1,cols-1,target);
      }
      if(target<=matrix[rstart+1][cmid-1]){
        return binarysearch(matrix,rstart+1,0,cmid-1,target);
      }
      if(target>=matrix[rstart+1][cmid+1] && target<=matrix[rstart+1][cols-1]){
        return binarysearch(matrix,rstart+1,cmid+1,cols-1,target);
      }
        return new int[] {-1,-1};
    }
    public static int[] binarysearch(int[][] matrix,int rstart,int cstart,int cend,int target){
       int mid=cstart+(cend+cstart)/2;
       if(matrix[rstart][mid]==target){
        return new int[] {rstart,mid};
       }
       if(target<matrix[rstart][mid]){
        cend=mid;
       }
       else{
        cstart=mid;
       }
        return new int[] {-1,-1};

    }
}
