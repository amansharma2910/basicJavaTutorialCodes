package tollTaxConstructors;

public class RoadTollMain {
    public static void main(String[] args) {
        Road_Toll rt1 = new Road_Toll();
        rt1.type = "SUV";
        rt1.noOfTyres = 4;
        rt1.tollAmount();

        Road_Toll rt2= new Road_Toll("Sedan", 50);
        rt2.tollAmount();

    }

}
