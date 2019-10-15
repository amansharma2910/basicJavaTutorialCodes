package setsInJava;

import java.util.ArrayList;

/*
* In hash set, elements are not added in a systematic order. Rather, they are added and arranged randomly.
* Since the elements are arranged randomly, in order to add or remove elements, or to retrieve a particular elements, we can't use its index number.
* Basic methods: add[to add elements], remove[to remove elements], clear[to clear entire set], contains[to check whether a particular elements is present in the list], size[to find out the total number of elements in the list].
* Just like in mathematics, set doesn't allow duplicate elements. even if you try to add a same element multiple times, the elements will only be displayed once in the list.
* SPECIAL METHODS: .addAll[to add all the elements of a different set. Basically it is union of two elements.], .retainAll[basically it is the intersection of two sets, i.e., prints the common elements between them.]
* In order to convert a set into a list, first make a list, then add all the elements of the set to the list using the .addAll method.
*/
public class HashSet {
    public static void main(String[] args) {
        var set1= new java.util.HashSet<Integer>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        var set2= new java.util.HashSet<Integer>();
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);
        set2.add(70);

        System.out.println(set1);
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);

        var myList= new ArrayList<Integer>();
        myList.addAll(set1);
        System.out.println(myList);
    }
}
