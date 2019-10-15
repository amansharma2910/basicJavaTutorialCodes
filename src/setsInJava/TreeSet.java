package setsInJava;
//Tree set is also like other set in terms of the operations, however, it is different on the basis of the fact that the elements are arranged in ascending order.
// Integers, Doubles, Floats: smaller to bigger
// Characters, Strings: alphabetic order
public class TreeSet {
    public static void main(String[] args) {
        var treeSet= new java.util.TreeSet<String>();
        treeSet.add("Inky");
        treeSet.add("Pinky");
        treeSet.add("Ponky");
        treeSet.add("Snoop");
        treeSet.add("Dog");
        System.out.println(treeSet);
    }
}
