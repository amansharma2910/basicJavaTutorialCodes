package practicePackage;

public class FibonacciSeries {
    public static void main(String[] args) {
        /*Program to print first 50 elements in a fibonacci series.*/

        int i, i1= 0, i2= 1, j;
        System.out.println(i1);
        System.out.println(i2);
        for(i=3; i<=20; i++){
            j= i1+i2;
            System.out.println(j);
            i1=i2;
            i2=j;
        }
    }
}