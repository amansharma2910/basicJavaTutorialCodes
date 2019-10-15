package superClass;
/*
* In Java, during inheriting a sub/child class from the parent/super class, when we override a method in a sub class, the method in sub class is given priority over the same method in the parent class. But still, in order to call the method from the parent class, we can use the .super keyword.
*/
public class SuperClass {
    public void A(){
        System.out.println("This is A");
    }
}
