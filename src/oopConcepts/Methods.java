package oopConcepts;

public class Methods {
    public static void main(String[] args) {
        Methods m1= new Methods();
        m1.gitGud();
        m1.addition(45,65);
        int x= m1.multiply(23,5);
        System.out.println(x);

    }

    public void gitGud(){
        System.out.println("Man! just stop complaining and just git gud at programming!");
    }

    public void addition(int num1, int num2){
        System.out.println( num1+ num2);
    }

    public int multiply(int num1, int num2){
        int num3= num1 * num2;
        return num3;
    }
}
