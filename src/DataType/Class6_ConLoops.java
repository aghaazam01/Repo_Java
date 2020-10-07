package DataType;

public class Class6_ConLoops {
    public static void main(String[] args) {

        /**
         conditional loops (conditional code)
         1. if-else
         2. switch
         */

        /**
         it you find oat milk at store,
         buy grocery
         call me
            else
         text me
         */


        /**
         if (conditional(s)) {
                // if
                // block
         }

         if (condition(s)) {
                // if
                // block
         }    else {
                // else
                // block


         if (condition (s))  {
                // 1st if block
         }  else if (condition(s))  {
                // 2nd if block
         } else  {
                else block

         */


        String days = "weekend";      // weekend or weekday
        boolean anyMeetings = true;    // true or false
        String clothes = "";

        /**
         * days = weekend ; clothes = casual
         * days = weekdays  and meeting = false ; clothes = formals
         * days = weekdays and meeting = true ; clothes = suit
         *
         */

    if (days.equals("weekdays") && anyMeetings ==false) { // false && false
        clothes = "formals";
    }     else if (days.equals("weekdays") && anyMeetings ==true) {
        clothes = "suit";
    }     else  {
            clothes = "casual";
    }
        System.out.println(clothes);   //suit

        // Execise:

        /**
         print "Even" if value in num variable is even
         */

        int num = 10;

        if (num % 2 == 0) {
            System.out.println("Even");
        }

        String name = ("Happy");
        boolean result = true;
        int number = 22;

        /**
         * if name length is greater than 10 and number is greater than 5
         * print the below:
         *      name in all uppercase
         *      and replace p with b in name
         * else
         * make result as false
         *
         * sout(result) // outsite the if else block
         */


        if (name.length()> 10 && number>5) {
            System.out.println(name.toUpperCase());
            System.out.println(name.replace('p', 'b'));
        }   else {
                result = false;
        }
        System.out.println(result);     // false


        /*

        name
        if name = "Happy"
            do this
        else if name = "peace"
            do this
        else if name = "joy"
            do this
        else if name = "grow"
             do this

             switch (variable){
                 case value1:
                    // do this
                    code if variable is equal to value1
                    break:
                 case value2
                    do this
                    code if variable is equal to value2
                    break;
                 case value3:
                    do this
                    code if variable is equal to value3
                    break;
                 default
                    do this
                    code if variable is not matching any case
             }
             */

        /**
         * dayName = monday; print "day 1"
         * dayName = tuesday; print "day 2"
         *
         */

        String dayName = "Monday";

        switch (dayName){
            case"Monday":
                System.out.println("Day 1");
                break;
            case"Tuesday":
                System.out.println("Day 2");
            case"wednesday":
                System.out.println("Day 3");
                break;
            case"Thursday":
                System.out.println("Day 4");
                case"Friday":
                System.out.println("Day 5");
                break;
            case"Saturday":
                 System.out.println("Day 6");
                 break;
            case"Sunday":
                 System.out.println("Day 7");
                 break;

                default:
                System.out.println(" invalid Day ");
                break;
    }

            /*
            based on month name, print season
            dec,jan,feb -> winter
            mar,apr,may -> spring
            jun,jul,aug -> summer
            sep, oct.nov -> false
            if invalid MonthName, print invalid month entered
             */
            String monthName = "sEp";
            switch (monthName.toLowerCase()) {     // sep
                case "dec":
                case "jan":
                case "feb":
                    System.out.println("winter");
                    break;
                case "march":
                case "april":
                case "may":
                    System.out.println("spring");
                    break;
                case "june":
                case "july":
                case "aug":
                    System.out.println("summer");
                    break;
                case "sep":
                case "oct":
                case "nov":
                    System.out.println("fall");
                    break;
                default:
                    System.out.println("Invalid Month");
                    break;
            }




    }
}










