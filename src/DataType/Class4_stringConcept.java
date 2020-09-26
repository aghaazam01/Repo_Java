package DataType;

import java.util.Arrays;

public class Class4_stringConcept {
    public static void main(String[] args) {


    //  String Methods-length and index:

        String cityName = "New york City";

        /** Length = 13
        Last Index = 12
        last index = length -1

         Strings methods or Methods available in String class
         Method is set of code to perform a specific task.

         Different methods of String Class-
         */

        System.out.println("cityName = "  + cityName);

        // Methods:-
        /**
         How to find/calculate the length of String
         Method:- Length()
         */

       int cityNameLength = cityName.length();
        System.out.println("Length of " + cityName + " is " + cityNameLength);

        /**
         To convert entire sting value in lower case
         Method: tolowercase()
         The value in original will not change
         */

        String cityNameInLowercase = cityName.toLowerCase();
        System.out.println("cityName in lowercase: " + cityNameInLowercase); //new york city
        System.out.println("cityName : " + cityName);  // new york city

        // convert cityName into lowercase and store new value in cityName
        cityName = cityName.toLowerCase();
        System.out.println("cityName: " + cityName); // new york city

        /**
         To convert entire string value to uppercase
         method: toUppercase()
         The value in original will not change
         */

         String cityNameInUpperCase = cityName.toUpperCase();
        System.out.println("city name in Upper case: " + cityNameInUpperCase); //NEW YORK CITY
        System.out.println("cityName: " + cityName);  //new york city

        /**
         For comparison, when we need to verify if two strings are identical
         Method: equals();
         */

        boolean isEqual = cityName.equals(cityNameInUpperCase);
        System.out.println(" is " + cityName + " equal to " + cityNameInUpperCase + ":" + isEqual);  //false


        /**
         For comparison, when we need to verify if two strings have same value
         Method: equals();
         */

        boolean isEqualIsIgnoreCase = cityName.equalsIgnoreCase(cityNameInUpperCase);
        System.out.println(" is " + cityName + " equal (Ignore case)to " + cityNameInUpperCase + ":" + isEqualIsIgnoreCase);  //true

        /**
         To find if a particular sequence is present in the string
         Method: contains()
         contains does not ignore casees
         */

        boolean isContains_new = cityName.contains("new"); // city name = New York City
        System.out.println("Does " + cityName + " Contains 'new' " + isContains_new);
        // here contains does ignore cases


        /**
         verify if cityName contains "nEw"     // cityName is New York City
         Note: please ignore cases
         Expected answer is true.
         */

        cityName = cityName.toLowerCase();  // cityName = new york city
        String newStr = "nEw".toLowerCase(); // newStr = new
        cityName.contains(newStr);  // true
        System.out.println(" Does cityName contains " + newStr +  " : " + newStr);

        /**
         to replace in string
         Method: replace
         The value in original will not change
         it will replace all instances
         */
         //cityName ="New York City"
        //String cityNameReplace_Y_z = cityName.replace(oldChar:'Y', newchar: 'z');  // New York Cit
        System.out.println("cityName : " + cityName);
        //System.out.println("cityName after replace Y with z: " + cityNameReplace_Y_z);


        //String cityNameReplacehMultiple = cityName.replace( target:"w y", replacment:"Hello world");
        System.out.println("cityName : " + cityName);
        //System.out.println("cityName after replace multiples: " + cityNameReplaceMultiple); //


        /**
         To find thd char present at which index
         Method: charAt()

         if given index within the index-range, it will return the char at the index
         else,it will throw Exception (StrinIndexOutOfBoundsException)
         */

        char charAtIndex7 = cityName.charAt(7);
        System.out.println("In '" + cityName + "' char at index 7 is: " + charAtIndex7);


        /**
         write a code to print the char present at last index of the string

         String hello = "Hello Worldwide";
         char lastIndexChar;
         //code
         1. find the length of String
         2. using length value, calculate the value of last Index (lastIndex = length - 1)
         3. using the charAt method, we can find the char present at lastIndex.
            sout("char at last index is : " + lastIndexChar)
         */

        String hello = "Hello Worldwide";
        char lastIndexChar;
        int len = hello.length();
        int lastIndex = len-1;
        lastIndexChar = hello.charAt(lastIndex);
        System.out.println("char at last index is : " + lastIndexChar);

        /**
         Method: indexof()

         if the given value found,
            will return the index of FIRST occurrence of the given value
         else
            return-1
         */

        cityName = "New york City IN the Town";
        int indexOfN = cityName.indexOf("N");   // city name = New York City
        System.out.println("index of 'N' in " + cityName + " is: " + indexOfN); //0

        cityName = "New york City IN the TowN";
        int indexOfn = cityName.indexOf("n");   // city name = New York City
        System.out.println("index of 'n' in " + cityName + " is: " + indexOfn); // -1

        cityName = "New york city IN the Town";
        int indexOfMultiple = cityName.indexOf("york ci");   // city name = New York City
        System.out.println("index of 'york ci' in " + cityName + " is: " + indexOfMultiple); //4

        /**
         To find the Index of given value (Last occurrence)
         Method: LastIndexOf()

         If the given value found,
            will return the index of Last occurrence of the given value.
         else
            return-1
         */
            cityName = "New york City IN the TowN of USA";
            int lastIndexOfN = cityName.lastIndexOf("N");
        System.out.println("Last index of N in '" + cityName + "' is : " + lastIndexOfN);

        /**
         To find if the String starts with the given value
         Method: startsWith
         */
        cityName = "New york city IN the Town";

        boolean cityNameStartsWith_ne = cityName.startsWith("ne"); //New york City IN the ToWN)
        System.out.println("does " + cityName + " start with 'ne'?: " + cityNameStartsWith_ne);  //true

        boolean cityNameStartsWith_New_y = cityName.startsWith("New y"); //New york City IN the ToWN)
        System.out.println("does " + cityName + " start with 'New y'?: " + cityNameStartsWith_New_y);  //true

        /**
         To find if the string ends with the given value
         Methods endsWith
         */

        boolean cityNameEndsWith_e_ToWN = cityName.endsWith("e ToWN");
        System.out.println("does " + cityName + " ends with 'e ToWN'? : " + cityNameEndsWith_e_ToWN);  //true


        /**
         To remove spaces from beginning (before the first character)
            and end (after the last character) of this string value

         Method: trim()
         */
       String cityName1= "   New york   City  IN the  ToWN   of USA   .   ";
        System.out.println(" # " + cityName1 + " # ");
        String cityNameTrim = cityName1.trim();
        System.out.println(" # " + cityName1 + " # ");
        System.out.println(" # " + cityNameTrim + " # ");


        /**
         To petch a portion from a string ussing index values
            method: subString()

            New york City IN the ToWN of USA

         Input only begin index:
            if beginIndex and endIndex are valid
            return string from beginIndex to end of the string.
         else
            StringIndexOutOfBoundsException


         Input beginIndex and endIndex
         if beginIndex and endIndex are valid
            returns string from beginIndex up to endIndex - 1
         else
            StringIndexOutOfBoundsException

         3,7 : 3,4,5,6  -> "yor"
        ps- it will not change the original string value
         */

       cityName = "New york City IN the ToWN of USA";

       String subFrom10 = cityName.substring(10);
        System.out.println("substring from index-10 to end: " + subFrom10);

        String subFrom10To15 = cityName.substring(10,15); // 10,11,12,13,14
        System.out.println("Substring from index-10 to index-15: " + subFrom10To15);


        /**
         To cut the string value from a speific point into multiple strings
         Method: Split()

         */
        // cityName = "New york City IN the ToWN of USA";
        String[] afterSplitBy_o = cityName.split("o"); //"New y" , " rk City IN the T" "WN ", "f USA"
        System.out.println("Array direct variable: " + afterSplitBy_o);
        // shortcut to print array
        System.out.println("Array after split from 'o' " + Arrays.toString(afterSplitBy_o));

        String[] afterSplit = cityName.split(""); // Array with every character at each index
        // cityName = "New york City IN the ToWN of USA";
        // afterSplit = ["N","e","w",.....................]

        String[] afterSplit2 = cityName.split("");
        // cityName = "New york City IN the ToWN of USA";
        // afterSplit2 = ["New","york"."City","IN","the", "ToWN","of","USA"]
    }
}
