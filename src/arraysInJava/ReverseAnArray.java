package arraysInJava;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);

        System.out.println("PLease enter the size of the array you want to be reversed.");
        int a= s1.nextInt();
        int [] myArray= new int[a];

        System.out.println("PLease enter the elements in the array you want to be reversed.");
        for(int i=0; i<a; i++){
            myArray[i]= s1.nextInt();
        }

        System.out.print("myArray= { ");
        for(int i=0; i<a; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.print("}");
        System.out.println("");
        System.out.println("-------------------------");

        int n= myArray.length;
        int [] temp= new int[myArray.length];
        for (int j=0; j< myArray.length; j++){
            n-=1;
            temp[j]= myArray[n];
        }

        System.out.print("Reversed array= { ");
        for(int j=0; j<myArray.length; j++) {
            System.out.print(temp[j] + " ");
        }
        System.out.print("}");
    }
}
