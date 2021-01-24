package DataType;

import java.util.Arrays;
//  Date: 01/24/2021

public class HomeWork_3 {
    public static void main(String[] args) {

        /**
         *   Question-1
         *  Store your full name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your last name starts with "K" (Ignoring cases)
         *     3. print the last alphabet of your first name
         *     4. Does your last name ends with "M" (Ignoring cases)
         */

        String fullName = "Agha Azam";
        String[] names = fullName.split(" ");
        String firstname = names[0];
        String lastname = names[1];
        System.out.println("length of " + firstname + " is : " + firstname.length());

        boolean isStartWithk = lastname.toLowerCase().startsWith("k");
        System.out.println("Last name '" + lastname + "'starts with 'k': " + isStartWithk);

        int fNameLastIndex = firstname.length() - 1;
        char lastChar = firstname.charAt(fNameLastIndex);
        System.out.println("Last char present in '" + firstname + "' is: " + lastChar);

        boolean isEndsWithM = lastname.toUpperCase().endsWith("M");
        System.out.println("last name '" + lastname + "' ends with 'M'" + isEndsWithM);


        /**
         * Question-2
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Display the total number of words in the myStatement.
         * 	2. replace all the 'r' characters with 'f' characters.
         */

        String myStatment = "I am a good programmer";
        String[] words = myStatment.split(" ");
        int wordCount = words.length;
        System.out.println("words count: " + wordCount);

        String stateReplace_r_f = myStatment.replace('r', 'f');
        System.out.println("state after replacment r with f :" + stateReplace_r_f);


        /**
         * Question-3
         * Store your first name in a string variable.
         * Calculate the length of your first name, without using length() method of String class.
         */
        String[] fNameLetters = firstname.split("");
        int fNameLength = fNameLetters.length;
        System.out.println("The length of first name is :" + fNameLength);


        /**
         * Question-4
         * String strNew = "hello dear, how are you?";
         *
         * Assign result (boolean) as true if length of strNew if greater than 10
         * else assign false.
         * print the result value.
         */

        String strNew = "hello dear, how are you?";
        boolean result = strNew.length()>10;
        System.out.println("Length of strNew is > 10 : " + result);


        /**
         * Question-5
         * String threeWordsSentence =  "hApPY nEW yeAr";
         * sout(threeWordsSentence);  // hApPY nEW yeAr
         *
         * // code
         * split by(" ") to generate String Array
         * use substring method for words[0] and convert it to the upper case and store it to the same variable ->m1
         * use substring again to use rest of the word and convert it to the lower case and store it to the same variable -> n1
         * add m1 and n1
         * same way do other two parts
         *
         * * sout(threeWordsSentence);  // Happy New Year
         *
         */

        String threewordsSentence = "HApPY nEW yeAr";

        String[] wordsArray = threewordsSentence.split(" "); //HApPY nEW yeAr"
        System.out.println(wordsArray);


        String m1 = wordsArray[0].substring(0,1).toUpperCase(); //"H"
        String n1 = wordsArray[0].substring(1).toLowerCase();  //"appy"
        words[0] = m1+n1;

        String m2 = wordsArray[1].substring(0,1).toUpperCase(); //"N"
        String n2 = wordsArray[1].substring(1).toLowerCase();  //"ew"
        words[1] = m2 + n2;  //"New"


        String m3 = wordsArray[2].substring(0,1).toUpperCase(); //"Y"
        String n3 = wordsArray[2].substring(1).toLowerCase();  //"ear"
        words[2] = m3 + n3;  //"Year"


        /* System.out.println( Arrays.toString (wordsArray[0] + " " + wordsArray[1] + " " + wordsArray[2]);     (Please suggest how to write Array print command) */

        /**
         * Question-6
         * Create abbreviation:
         * String threeWordsSentence =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         *
         1. split by "", this generates String[] words  "Lab", "sessIONS","cLAsses"
         2. convert words[0] into uppercase and store in same variable  // LAB
         3. Find first character inn words[0] using charAt(). store in new variable(a)

         use same way other two String
         sout (a+b+c);
         */

        String threeWords =  "Lab sessIONS clAsses";

        String[] word2 =  threeWords.split(" ");
        String a1 = word2[0].toUpperCase();
        char a = a1.charAt(0);


        String a2 = word2[1].toUpperCase();
        char b = a2.charAt(0);


        String a3 = word2[2].toUpperCase();
        char c = a3.charAt(0);

        System.out.println("The abbreviation of Lab sessIONS clAsses is: " + a+b+c );

    }
}
