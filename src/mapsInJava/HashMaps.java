package mapsInJava;
// Hash maps are used to store data in an arranged format in key_value format. In order to store any data, you need to specify a key value associated with it.
// Basic methods: .put(K,V)[used to add elements to the map.], .remove(K)[Used to remove values from the map.], .clear()[to clear the map.]
// We aren't going to discuss tree maps because they are almost similar to tree maps and the basic methods are also same. The only difference is that in case of tree map, the data is arranged on the basis of alphabetic/ascending order of the keys, which is not guaranteed in case of hash map.
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        var myMap= new HashMap<Integer, Character>();
        myMap.put(1,'V');
        myMap.put(2,'I');
        myMap.put(3,'B');
        myMap.put(4,'G');
        myMap.put(5,'Y');
        myMap.put(6,'O');
        myMap.put(7,'R');
        System.out.println(myMap);


    }
}
