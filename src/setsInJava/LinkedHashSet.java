package setsInJava;

//The only difference between linked hash set and simple hash se is that in the linked hash set, elements are arranged in a ordered manner.
// Other than that, all the other properties are same. This means no indexing, no addition of duplicates. basically, it is the closest a set can get to the format of a list while still being a set.

public class LinkedHashSet {
    public static void main(String[] args) {
        var linkedSet= new java.util.LinkedHashSet<Character>();
        linkedSet.add('a');
        linkedSet.add('b');
        linkedSet.add('c');
        linkedSet.add('d');
        linkedSet.add('e');
        linkedSet.add('f');
        linkedSet.add('g');
        linkedSet.add('h');

        System.out.println(linkedSet);
    }
}
