package oopConcepts;
/*The concept of method overriding in java says that we can create and use methods with the same name as long as their arguments differ with each other. The following is an example of method overriding.*/

public class MethodOverriding {
    public static void main(String[] args) {

     MethodOverriding m1= new MethodOverriding();

     m1.addition(12,23);
     m1.addition(12.2f, 23);
     m1.addition(12, 23.2f);
     m1.addition(12.2f, 23.2f);


    }

    public void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public void addition(float num1, float num2) {
        System.out.println(num1 + num2);
    }
    public void addition(int num1, float num2) {
        System.out.println(num1 + num2);
    }
    public void addition(float num1, int num2){
        System.out.println(num1 + num2);
    }
}
