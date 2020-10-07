package DataType;

import java.sql.SQLOutput;

public class Classwork {
    public static void main(String[] args) {

        String statement = "There could be any value, task is to find the length of the last word in the STATEMENT";

        // code
        // Last word in the statement is STATEMENT, length = 9
        //


        String name = "Happy";
        boolean result = true;
        int number = 22;

        /**
         * if name is greater than 10 and number is greater than 5
         * print the below
         *      name in all uppercase
         *      and replace p with b in name
         * else
         *      make result as false
         *
         *
         *   sout(result) // outside the if-else block
         */
        //  syntex:
        /*
         * if (condition(s)) {
         *      // 1st if block
         * } else if (condition(s)) {
         *      // 2nd if block
         * } else {
         *      // else block
         * }
         */
        if (name.length() > 10 && number > 5) {
            System.out.println(name.toUpperCase());
            System.out.println(name.replace('p', 'b'));
        } else {
            result = false;
        }
        System.out.println(result);


        /**
         * based on month name, print season
         * dec, jab, feb -> winter
         * mar, apr, may -> summer
         * jun, jul, aug -> fall
         * sep, oct, nov -> spring
         * if invalid monthName, print invalid month entered
         */
        //String monthName = "feb";
        //switch (monthName){
        //case"feb";
        //  System.out.println


        //for (int i=0 ; i<=names.length-1 ; i++) {   // i<4 0,1,2,3
        // System.out.println(names[i]);           // i    0,1,2,3

/*
            print the values present in even index      (0,2,4,6,8,...)
         */

        //String[] numbers = {"0","2","4","6","8"};
        //for (int i=0 ; i<=5 ; i++) {
            //System.out.println(numbers[i]);


        String fanName = "Darya";
        switch (fanName){
            case "Sikdar":
                System.out.println("football fan");
            case "Darya":
                System.out.println("football fan");

            case "Agha":
                System.out.println("football fan");
            case "Ahsan":
                System.out.println("Cricket  fan");
            case "Maryna":
                System.out.println("basketball fan");
            case "Ash":
                System.out.println("basketball fan");
            case "Rashel":
                System.out.println("football fan");
            default:
                System.out.println(" no fan");









        }





        }

    }
















