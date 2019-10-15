package randomNumberAndIDGenerator;
/*
* Random class can be used to generate random numbers. But in order to print the numbers using this class, we need to use the for loop along with nextInt argument and a bounding integer.
*/
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random r1= new Random();
        for(int i=1; i<=100; i++){
            System.out.println(r1.nextInt(1000));
        }
    }

}
