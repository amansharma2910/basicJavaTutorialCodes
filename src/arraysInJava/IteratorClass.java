package arraysInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList myArray= new ArrayList<String>();

        ListIterator itr= new ListIterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Object previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Object o) {

            }

            @Override
            public void add(Object o) {

            }
        };

        myArray.add("Violet");
        myArray.add("Indigo");
        myArray.add("Blue");
        myArray.add(null);
        myArray.add("Green");
        myArray.add("Yellow");
        myArray.add(null);
        myArray.add(null);
        myArray.add("Orange");
        myArray.add("Red");

        while (itr.hasNext()){
            if(itr.next() == null){
                itr.remove();
            }
        }
        System.out.println(myArray);

    }
}
