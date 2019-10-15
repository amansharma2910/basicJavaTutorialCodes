package stringBuilderClass;

public class StringBuilderOperations {
    public static void main(String[] args) {
/*
* Here is a normal example of string and basic string operations using comcat.
*/
        String str1 = "I ";
        str1 = str1 + "love ";
        str1 = str1 + "coding ";
        str1 = str1 + "in Java.";
        System.out.println(str1);

/*
* Now, we are going to see an example of how to make/build a string using StringBuilder method. The StringBuilder method is predefined in Java and we need not specify it in the masterclass to use it.
*/
        StringBuilder str2 = new StringBuilder("I ");
        str2.append("love ");
        str2.append("myself and my career more than anything or anyone else.");
        System.out.println(str2);
/*
* Other string methods are insert, replace, delete, and reverse.
* for insert- .insert(index of starting point where you want to insert anything, data-type you want to insert);
* for replace- .replace(index of starting point, end point, data-type);
* for delete- .delete(start point, end point);
* for reverse- .reverse();
*/
        StringBuilder str3= new StringBuilder("Learning is fun.");
        str3.insert(8, " Java");
        str3.replace(17,20, "awesome!");
        System.out.println(str3);

    }

}
