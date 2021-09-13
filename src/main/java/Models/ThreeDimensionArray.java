package Models;

public class ThreeDimensionArray {
    public static void main(String[] args){
        int [][][] threeDArray = {{{8,7},{6,5}}, {{4,3},{2,1}}};
     /*for ( int i=0; i<2 ; i++)
         for ( int j=0; j<2 ; j++)
             for ( int k=0; k<2 ; k++)
                 System.out.println(threeDArray[i][j][k]);*/

        // Enhanced for loop method
             for (int[][] w : threeDArray)
                 for (int [][]x : threeDArray)
                     for (int[][] y : threeDArray)
        System.out.println(threeDArray[0][0][0]);
        System.out.println(threeDArray[0][0][1]);
        System.out.println(threeDArray[0][1][0]);
        System.out.println(threeDArray[0][1][1]);
        System.out.println(threeDArray[1][0][0]);
        System.out.println(threeDArray[1][0][1]);
        System.out.println(threeDArray[1][1][0]);
        System.out.println(threeDArray[1][1][1]);

}
}