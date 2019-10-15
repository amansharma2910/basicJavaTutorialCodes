package scannerClass;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("PLease enter a string you want to get reversed.");
        String str1 = s1.nextLine();
        String temp="";
        for(int i = str1.length()-1; i>=0; i--){
            temp = temp+ str1.charAt(i);
        }
        System.out.println("The reversed string is: " + temp);
    }
}
