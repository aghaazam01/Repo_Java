package DataType;

public class Class1_Data {
    public static void main(String[] args) {

        //DataTypes

            /**
             * Numbers (whole/decimal)
             * whole
             *      byte, short, int, long
             *    decimal
             *      flot, double
             *
             *  alphabets/characters/letters/words/sentence
             *      single letter - char
             *      multi-letters - String
             *
             *      yes/no (true/fales)
             *      boolean
             *
             *  How many datatypes we have in Java?  - Two types of datatypes in java
             *     1. primitive
             *          byte,short,int,long,float,double,char,boolean
             *     2.Non primitive
             *          String,Array,Class,Interface.
             */

            /**
             * Good practice to provide names:
             *
             * 1. Package:
             *          -> starts with Uppercase.                           MyHouseNewYork
             *          -> never start with digit or special character.
             *          -> It should always follow CamelCase.
             *
             * 2. Class:
             *         -> starts with uppercase.                            MyHouseNewYork
             *         -> never start with digit or special character.
             *         -> It should always follow CamelCase.
             *
             * 3.   Variable:
             *             -> starts with lowercase.                        myHouseNewYork
             *             -> never start with digit or special character.
             *             -> It should always follow camelCase.
             *
             *      Note: you must NEVER use Jave language Keywords
             */

            /**
             *  To store any data,we need a variable
             *
             *  Syntax to create a variable-
             *  Datatypes variableName = value;
             *
             *  eg-
             *  write code to create a byte variable of any name.
             *
             *  byte testVariable =10;
             *  int age = 5;
             */

            //primitive- byte,short,int,long,float,double,char,boolean

            /**
             * byte is a primitive datatypes
             * can store only whole numbers ranging from -128 to 127
             */

            byte age = 20;
            // create a variable 'age' of byte datatype,and stored value 20 in it.
            // what is the datatype of age? -> byte.

            /**
             * short: is a primitive datatype
             * can store only whole number, ranging from -32,768 to 32,767
             */

            short noOfDayInYear = 365;
            /**
             * Int: is a primitive datatype
             * can store only whole number, ranging from -2,147,000,000 to 2,147,000,000
             * In daily routine: we use 'int' to store values.
             */

            int usaCovidCases = 9999999;


            /**
             * Long: is a primitive datatype
             * can store only whole number, ranging from-
             * -9,000,000,000,000,000,000. to 9,000,000,000,000,000,000
             */

            long worldPopulation = 99999999999L; // L is indicator for Java to treat value as Long
            // created a variable 'worldPopulation' to long datatype, and stored 99999999999 value.


        }
}
