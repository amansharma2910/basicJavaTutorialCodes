package arraysInJava;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {

// Now, we will declare a 2D array of size 3x3.
        int [][] myArray= new int[3][3];
        Scanner s1= new Scanner(System.in);
// Here, note that modified for cannot be used to take the input inside the array.
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                myArray[i][j]= s1.nextInt();
            }
        }
        for (int [] a : myArray){
            for (int b : a){
                System.out.print(b + " ");
            }
            System.out.println("");
        }
    }
}
