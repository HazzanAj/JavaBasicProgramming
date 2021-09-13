/**********************************************************************************************
 * Goals: Array simplification
 * Topic : How to perform array declaration initialization and accessing elements of the array
 * by following clean code principles
 *****/
package Models;
public class OneDimensionalArray {
    public static void main(String[] args){

        int [] sixElementArray ={ 0,1,2,3,4,5}; // Declaration and Initialization
        /*sixElementArray.length will be used to check the array size,
        *I know it is 6 can confirm later
        * **********************************/
        sixElementArray [0]= 0; // How to access individual elements of the array
        sixElementArray [1]= 1;
        sixElementArray [2]= 2;
        sixElementArray [3]= 3;
        sixElementArray [4]= 4;
        sixElementArray[5] = sixElementArray[1] + sixElementArray[4] ;
         System.out.println(sixElementArray.length);
         System.out.println(sixElementArray[5]);
        for ( int i= 0 ; i<= sixElementArray.length; i++ )
            System.out.println(sixElementArray[i]);
        }


}
