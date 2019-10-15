package practicePackage;

public class BarChart {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=50; i++){
            for (j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
