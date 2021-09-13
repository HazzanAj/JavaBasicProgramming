package Models;

public class TwoDimensionArray {
    public static void main( String[] args){
    int n = 5;
    int[][] twoDimension = new int[n][n];
        for (int i = 0; i < n; i++) {
        twoDimension[i][i] = i;
    }
        for (int i = 0; i < twoDimension.length; i++) {
        for (int j = 0; j < twoDimension[i].length; j++) {
            System.out.print(twoDimension[i][j]);
        }
            System.out.println();
    }
}
}