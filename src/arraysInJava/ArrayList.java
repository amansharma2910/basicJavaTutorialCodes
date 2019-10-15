package arraysInJava;
//In java, we can create dynamic arrays (i.e., arrays whose length is not fixed.) using the ArrayList class.
public class ArrayList {
    public static void main(String[] args) {

/*
* Use .add() to add elements.
* Use .get() to retrieve elements at a particular index.
* Use .ser() to replace an existing element with a new one.
* Use .clear() to completely cleat the entire array list at once.
* Use .remove() to remove just a single element using either its index value or its value.
* Use .indexOf() to get the index of a particular object from the list.
* Use .contains() to check if a object is present in an array list or not.
* Use .sublist() to print just a part of the list.
* Other than these, there's a plethora of other operations that you can perform on an array list.
*/

/*
-------------------------------------------------------------------
//NOTE- You cannot create object array list. You need to specifically mention the data type in the array list.
-------------------------------------------------------------------
*/

        java.util.ArrayList<String> myArray= new java.util.ArrayList<String>();
        myArray.add("X-Rays");
        myArray.add("UV");
        myArray.add("Violet");
        myArray.add("Indigo");
        myArray.add("Pink");
        myArray.add("Fuchsia");
        myArray.set(2, "Blue");
        myArray.remove("Fuchsia");
        myArray.add(5,"Green");
        myArray.add("Yellow");
        myArray.add("Orange");
        myArray.add("Red");
        myArray.add("Infrared");
        myArray.add("Radio Waves");
        myArray.subList(2,9);
        System.out.println(myArray);
        System.out.println(myArray.subList(2,9));

    }
}
