package inheritanceConcept;

public class AreaMain {
    public static void main(String[] args) {
        Triangle t1= new Triangle();
        t1.getLengthAndBreadth(23,24);
        t1.calcArea();

        Rectangle r1= new Rectangle();
        r1.getLengthAndBreadth(45,12);
        r1.calcArea();
    }
}
