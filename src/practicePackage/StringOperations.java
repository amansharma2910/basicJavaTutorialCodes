package practicePackage;

public class StringOperations {
    public static void main(String[] args) {
/*
*  comcat() or simply '+' adds two strings.
* .length() tells you the length of the string.
* .trim() removes the empty spaces before and after the actual context inside the string.
* .contain() checks if the string or value inside the brackets is present inside the string we are checking it in for.
* .toUpperCase() or .toLowerCase converts the string inside the brackets to upper or lowercase respectively
* .startsWith() checks whether a string starts with a particular letter or substring.
* .endsWith() checks whether a string ends with a particular letter or substring.
* .indexOf() checks the position of a substring from the beginning and .lastIndexOf() checks the position of the substring from the end of the string.
* .charAt() gives us the character at a given index specified inside the brackets.
* .substring() gives us the remaining substring from the index specified inside the brackets.
*
* */
        String str1= "Aman ";
        String str2= "Sharma";
        String str3= "    adasd    sdsd   asdd    ";
        int i=100;
        String str4= "I love coding and learning various programming languages." , str5= "coding", str6= "CODING";

        System.out.println( str1 + str2 + i);
        System.out.println(str3.length());
        System.out.println(str3.toUpperCase().trim());
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str4.contains(str5));
        System.out.println(str4.contains(str6));
        System.out.println(str4.startsWith("I"));
        System.out.println(str4.indexOf("learning"));
        System.out.println(str4.lastIndexOf("learning"));
        System.out.println(str4.charAt(18));

/* Code to reverse a string. Here we will be reversing string 2 as an example.*/
        String temp="";
        for(i=0; i<str2.length(); i++){
            temp= str2.charAt(i) + temp;
        }
        System.out.println(temp);
/*
* String operations for replacing substrings:
* .replace(the substring to be replaced, the substring replacing the substring to be replaced) replaces a part of a substring.
* .replaceAll(regEx, expression) is also used to replace a regular expression with a expression of your choice.
*/
        String str7= "Thi1234 i1234 1234ome gourmet 1234hit right there!";
        String str8= "1234";
        String str9= "s";
        System.out.println(str7.replace(str8, str9));

        String str10= "Thi1234%^&s i1@#$23$556s 123#$%43$s%o$%$%me gourme#$%t 1234$%s#h#$%it rig#$ht th#$%er3$%e!";

        String strPatt= "[^A-Za-z\\s]";

/*Here, this regEx means anything except A-Z, a-z, and space between words.*/
        String rep= "";
        System.out.println(str10.replaceAll(strPatt, rep) + "!");

/*Now, we will see some operations to convert integers or other data types into string of various types.
* Integer.toString(integer name here) will simply convert a given integer to string data type.
* Integer.toBinaryString(integer name here) will simply convert the given integer to its binary form.
* integer.toOctalString(integer name here) will convert the given integer to octal form.
* Integer.toHexString(integer name here) will convert the given integer to its hex value.
*/

        int j=9;
        System.out.println(Integer.toBinaryString(j));
        System.out.println(Integer.toHexString(j));
        System.out.println(Integer.toOctalString(j));
        System.out.println(Integer.toString(j));
    }
}
