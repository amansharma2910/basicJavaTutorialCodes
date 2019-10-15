package randomNumberAndIDGenerator;

import java.util.UUID;

/*
* The UUID class is used to generate universally unique 128 bit alphanumeric IDs. The following example will print 10 IDs that will be unique.
*/
public class UUIDGenerator {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println(UUID.randomUUID());
        }
    }
}
