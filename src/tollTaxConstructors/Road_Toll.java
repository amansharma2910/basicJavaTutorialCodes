package tollTaxConstructors;
/*A constructor is a block of code that is similar to methods. It gets executed when a new object/instance of class is created.
* Constructors can be used to specify the member variables of the class for an object/instance of the class.
* Since constructors do not return any data, we need not to specify any return data type for a constructor.
* Just like methods, constructors can also be overloaded as long as the arguments differ.
*/

public class Road_Toll{
    String type= "";
    int noOfTyres= 0;

    public void tollAmount(){
        if(noOfTyres==2){
            System.out.println("Toll amount= 0");
        }
        else if(noOfTyres==4){
            System.out.println("Toll amount= 10");
        }
        else if(noOfTyres>2){
            System.out.println("Toll amount= 20");
        }
    }
    public Road_Toll(){
        System.out.println("New object created in the class.");
    }
    public Road_Toll(String vehicleType, int tireCount){
        this.type= vehicleType;
        this.noOfTyres= tireCount;
    }
}
