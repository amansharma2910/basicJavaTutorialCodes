package inheritanceConcept;

public class Triangle extends Polygon {
    public void calcArea(){
        System.out.println("Area of triangle= " + ((double)0.5*breadth*length) );
    }


}
