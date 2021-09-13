package Models;
/*
*Array knowledge is very essential in memory allocation and data storage
* access a particular element of the array is very important .
* How can we dynamically access element in the array in row1 colon4 and how can
* we view the element allocated in this two dimension array even though it was
* initialized but just for verification we would like to see if the code can print the elements out
* *****************************************************************************************************/
public class TwoDimenArray {
    public static void main ( String[] args){
        int [][] arrayNumbers = { { 1, 2, 3, 4, 5,}, {6, 7, 8, 9, 10}};
        int row1Colon4 = arrayNumbers[1][4]; // 10
        System.out.println(row1Colon4);// accessing element of the array
        System.out.println("===============");
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = 0; j < arrayNumbers[i].length; j++) {
                System.out.print(arrayNumbers[i][j]);
            }
            System.out.println();
        }
    }
}
