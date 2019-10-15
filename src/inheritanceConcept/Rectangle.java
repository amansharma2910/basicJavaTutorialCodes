package inheritanceConcept;

public class Rectangle extends Polygon {
    public void calcArea(){
        System.out.println("Area of rectangle= " + ((double)breadth*length) );
    }
}
