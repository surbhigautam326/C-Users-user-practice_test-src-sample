//add two matrices of same size

package sample;

public class ques4{
   public static void main(String args[]){
      int x[][]={{7,9,3},{3,8,6},{1,6,9}};
      int y[][]={{2,2,4},{2,1,0},{0,4,0}};
      int z[][]=new int[3][3];

      for(int i = 0;i<3;i++){
         for(int j = 0;j<3;j++){
            z[i][j] = x[i][j]+y[i][j];
            System.out.print(z[i][j]+" ");
         }
         System.out.println();
      }
   }
}