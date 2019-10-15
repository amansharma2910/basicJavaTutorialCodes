package employeeOOP;

public class Employee {
    String name= "Jose Portilla";
    String id= "01234MVP";
    float salary= 24000.0f;

    public void getBonus(){
        System.out.println("Bonus Recieved= "+ salary*0.2);
    }
}
