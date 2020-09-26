package DataType;

public class Class2_Data {
    public static void main(String[] args) {

        /**
         * Numbers (whole/decimal)
         * whole
         *      byte,short,long,int
         * Decimal
         *      float,double
         *
         *  alphabets/characters/Letters/words/sentences
         *          single letter
         *          char
         *          multi-letters
         *          string
         *
         *  yes/no(true/false)
         *          boolean
         *
         *
         * float
         * is a primitive datatype which can store decimal point values.
         */
        float mortgageRate = 1.1f; // f is just an indicator for java to store/treat giben value as float instead
        // Mortgage rate is 1.1
        System.out.println("Mortgage rate is " + mortgageRate);

        /**
         * double
         * is a primitive datatype which can store value with decimal point
         */
            double accBalance = 100.10;
        System.out.println("Account Balance: " + accBalance);

        accBalance = 99.99;
        System.out.println("Account Balance: " + accBalance);
        /**
         * float vs double
         * 1. double is more precise than float
         *      float can store value with 7-8 digits
         *      where double can store value up 15-16 digits
         * 2. in terms of money
         *      float uses4-bytes of ma,ory, whereas double used 8-byts of ma,ory
         * 3  double is convenient to use.
         *      while defining float variable, user/programmer has to add 'f' to explicitly inform java
         *      to stored/treat value as float.
         *      in double, user can simple store the value in variable.
         */
        /**
         * char
         * is a primitive datqtype which can hold a single character,
         * while storing the value, the value should be in between single-quotes.
         *
         */
            char singletter = 'a';
        System.out.println("First letter in alphabets -> " + singletter);


        /**
        * boolean
         * is a primitive which can hold either true or false as value
        */
        boolean isRaining = true;
        System.out.println("is raining currently? : " + isRaining);

        isRaining = false;
        System.out.println("is raining currently? : " + isRaining);


        //non-primitive(class and interface - String,Array, User defined Class,Interface
    /**
    *  string
     * is a non-primitive datatype which can store multiple characters.
     * while storing the value in variable, the value should be enclosed in DOUBLE-QUOTES
    */
    String fullName = "Hello World";
    // full name is a variable of the string datatype, storing Hello Would as a value.
        System.out.println("Full name is " + fullName);

        String single = "a b c d e";
        String info = "value in single variable ->";
        System.out.println(info + single);  // value in single variable -> a




    }
}
