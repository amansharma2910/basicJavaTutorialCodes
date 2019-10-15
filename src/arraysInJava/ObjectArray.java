package arraysInJava;

public class ObjectArray {
    public static void main(String[] args) {

// In java, we can use an object array to create arrays that can hold multiple data types. In the given example, the 2d array created using object array contains string, integer, double and character data types.
        Object[][] myArray={{"Aman", 18, 5.8, 'M'},
                          {"Neel", 18, 5.8, 'M'},
                          {"Smit", 18, 5.9, 'M'}};
        for (Object [] x: myArray){
            for ( Object y: x){
                System.out.print(y + " | ");
            }
            System.out.println("");
            System.out.println("---------------------");
        }
    }
}
