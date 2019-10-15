package arraysInJava;

//In this section, we will discuss the various methods of declaration of a 1d array in Java, as well as the various operations tha can be performed on a 1D array.

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//Now, we will declare a 1d array by the most basic method. Here, we declare the array as well its elements simultaneously. Remember that once an array is declared, we cannot increase or decrease its size.

        String [] myArray1= {"Mon" , "Tues" , "Wed", "Thur" , "Fri" , "Sat" , "Sun"};

// Now, we will see the second method where we first declare the array and its size, then we will declare the various elements in the array separately.
        int [] myArray2= new int[10];
//Once declared, we will now scan the elements using a for loop and the scanner class object.
        Scanner s1= new Scanner(System.in);
        for(int i=0; i<10; i++){
            myArray2[i]= s1.nextInt();
        }
        System.out.print("myArray2= { ");
        for(int i=0; i<10; i++) {
            System.out.print(myArray2[i] + " ");
        }
        System.out.print("}");
        System.out.println();
//Using advanced for loop to print the elements of myArray1.
        System.out.print("myArray1= { ");
        for(String n: myArray1){
            System.out.print(n + " ");
        }
        System.out.print("}");
    }
}
