package superClass;

public class SubClass extends SuperClass{
    public void A(){
        System.out.println("This is B");
    }
    public void xyz(){
        super.A();
        System.out.println("XYZ executed.");
    }
}
