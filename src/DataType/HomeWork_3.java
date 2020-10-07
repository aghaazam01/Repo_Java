package DataType;

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
        String [] names = fullName.split(" " );
        String firstname = names[0];
        String lastname = names[1];
        System.out.println("length of " + firstname + " is : " + firstname.length());

        boolean isStartWithk =  lastname.toLowerCase().startsWith("k");
        System.out.println("Last name '"  + lastname + "'starts with 'k': " + isStartWithk);

        int fNameLastIndex = firstname.length()-1;
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

        String stateReplace_r_f = myStatment.replace('r','f');
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
         * // code
         * sout(threeWordsSentence);  // Happy New Year
         */

        String threewordsSentence = "HApPY nEW yeAr";
        String[] wordsArray = threewordsSentence.toLowerCase().split(""); //HApPY nEW yeAr"

        String f1 = wordsArray[0].substring(0,1).toUpperCase(); //"H"
        String l1 = words[0].substring(1);  //"appy"
        wordsArray[0] = f1 + l1; //"HAPPY"

        String f2 = wordsArray[1].substring(0,1).toUpperCase(); //"N"
        String l2 = words[1].substring(1);  //"ew"
        wordsArray[0] = f2 + l2;  //"NEW"


        String f3 = wordsArray[2].substring(0,1).toUpperCase(); //"Y"
        String l3 = words[2].substring(1);  //"ear"
        wordsArray[2] = f3 + l3;  //"YEAR"

        threewordsSentence = words[0] + " " + words[1] + " " + words[2];
        System.out.println(threewordsSentence);


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

        String lab = " Lab sessIONS cLAsses";
        String[] afterSplitBy = lab.split(" ");
        System.out.println(" Array direct variable: " + afterSplitBy);





    }
}
