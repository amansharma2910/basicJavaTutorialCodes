package randomNumberAndIDGenerator;
/*
* Math.random method generates a random double between 0 and 1. in order to print an integer number between 0 and 1000, multiply Math.random by 1000 and set the output to be an integer as shown in the example below. The given example prints 10 integers between 1-1000.
*/
public class MathRandom {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println((int)(Math.random()*1000));
        }
    }
}
