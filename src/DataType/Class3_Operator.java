package DataType;

public class Class3_Operator {
    public static void main(String[] args) {

        /**
         * Java Operators:-
         *  1.Assignment (=)
         *  2. Arithmetic (+,-,*,/,%,++,--)
         *  3. comparison (>, <, >=,<=, ==,!=)
         *  4. logical ( && ->and , ||->or , !)
         *  5. Ternary (?:) -> class4/Operators_Continues
         *  6. Advanced Assignment ( +=, -=, *=, /=, %=)
          */


    /**
    * Assignment (=)
    */
    int num = 10;


        /**
         * Arithmetic -  +,-,*,/,% modulus
         * ++ increment (pre-increment/post increment)
         * -- decrement (pre-decrement/post decrement)
         */

        int num1 = 10;
        int num2 =20;
        int num3 = num1 + num2;  //10+20=30
        System.out.println("num3 = " + num3);

        int num4 = num1 + num2 + num3;  //10+20+30=60
        System.out.println("num4 = " + num4);

        num4 = num4 + num1;     // 60+10=70
        System.out.println("num4 = " + num4);

        double dNum = 100;
        double total  = dNum + num2;  //100.00 + 20 = 120
        System.out.println("total = " + total);


        // practice:
        int result = (num1 + num2) - (num1 - num4) * num2 + num3;
                    //(10+20) - (10-70) * 20+30
                    // 30 + 60 * 20 +30
                    // 30 + 1200 + 30
                    // 1260
        System.out.println("result = " + result);

        //Division

        num1=10;
        num2=20;
        int divRes = num2/3; //int/int -> int(20/3 ->6)
                             //double/int -> double
                             //int/double -> double
        System.out.println("division result = " + divRes);


        double divRes1 = num2/3;    //6.666
        System.out.println("Division result =" + divRes1);

        divRes1 = num2/3.0;      //20/3.0 -> 6.66
        System.out.println("divres1 with 3.0 = " + divRes1);

       // int divR = num2/2;
       // System.out.println("Division result =" + divRes1); //6.666

        /**
         * Modulus
         * 20/3 -> 6 (2)
         * 40/5 -> 8 (0)  0 is a reminder
         * 11/4 -> 2 (3)
          */
        System.out.println("40 % 5 -> " + (40%5));  //0
        System.out.println("20 % 3 -> " + (20%3));  //2
        System.out.println("11 % 4 -> " + (11%4));  //3

        // Arithmetic-increment:
        /**
         * increment (++)
         * post increment and pre-increment
         * int b - 10
         * b++  -> post increment
         * ++b  -> pre-increment
         * ++   -> increment the current value of variable by 1 and store
         *          new value in the same value.
         */

        int inc =10;
        inc++;  //inc = 11
        ++inc;  //inc = 12
        System.out.println("inc = " + inc);  //11
        System.out.println(" inc = " + inc); //12

        /**
         * post -> use the current value of variable,then increment
         * pre  -> increment the value of variable, then use the latest value
         *          for whatever the action is .
         */

        System.out.println(inc++);  // print->12 and inc=13
        System.out.println(++inc);  // inc=14 and print ->14


        //practice:

         int i1 = 1;
         int i2 = i1++;  //i2=1 so i1=2
         i2 = ++i1;     // i2=3 , i1=3

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

       //  Increment practice

        int ab =5;
        System.out.println(ab++);   // print -> 5 | ab=6
        System.out.println(++ab);   // print -> 7 | ab=7
        System.out.println(ab);     // print -> 7 |
        System.out.println(ab++);   // print -> 7 | ab=8
        System.out.println(ab);     // print -> 8
        System.out.println(ab++);   // print -> 8 | ab=9
        System.out.println(ab++);   // print -> 9 | ab=10
        System.out.println(ab);     // print -> 10

        // Arithmetic- Decrement:
        /**
         * decrement (--)
         * post decrement and pre decrement
         * int b =10;
         * b--  -> post decrement -> use the current value of variable,then decrement
         * --b  -> pre decrement  ->  decrement the value of variable, then use the latest value
         *                             for whatever the action is
         */

            int dec = 10;
            System.out.println(dec--);  // print -> 10 | dec=9
            System.out.println(--dec);  // dec ->9     | print=9


         // comparison operator (>, <, >=,<=, ==,!=)

        /**
         * Comparison Operators
         * (>, <, >=,<=, ==,!=)
         *
         * result of any comparison operation is always boolean
         */

        int com1 = 5;
        int com2 = 7;

        boolean com1GrCom2 = com1>com2;
        System.out.println(com1 +" > " + com2 + " = " + com1GrCom2);    //false
        boolean com1GrEqCom2 = com1>=com2;
        System.out.println(com1 + " >= " + com2 + " = " + com1GrEqCom2); //false
        boolean com1LeCom2 = com1<com2;
        System.out.println(com1 + " < " + com2 + " = " + com1LeCom2);    //true
        boolean com1LeEqCom2 = com1<=com2;
        System.out.println(com1 + "<= " + com2 + " = " + com1LeEqCom2);  //true
        boolean com1EqCom2 = com1 == com2;
        System.out.println(com1 + " == " + com2 + " = " + com1EqCom2);   //false
        boolean com1NtEqCom2 = com1 != com2;
        System.out.println(com1 + " != " + com2 + " = " + com1NtEqCom2); //true


        //practice:
        int num11 = 11;
        int num12 = 13;

        boolean abc = (++num11 == num12--);
        System.out.println(num11 + " == " + num12 + " = " + abc);   //false

        // logical operator-
        /**
         * logical operator ( && ->and , ||->or , !)
         * && -> and operator. || -> or operator, ! -> not operator
         * we use logical operators to join two or more conditions.
         * Final result will be boolean datatype and if any one false the
         * result will be false.
         */

    //if day==monday and raining = false and time>9am and hangover= false
        //         * then i will go to office


        int lVer1 = 10, lVer2 = 20, lVer3 = 30, lVer4 = 40;
        boolean lRes1 = lVer1 <= lVer3  && (lVer2 == (lVer4-lVer1-lVer1) && lVer4 == lVer2);
                        // 10 <=30 && 20 == (40-10-10) && (40 == 20);
                        // True && 20 == 20 && false
                        // true && True && false      -> false
                         System.out.println("lRes1 -> " + lRes1);

        /**
         *  ||-> or operator
         *  if any condition is true then final result will be true
         */
        //if day monday or raining = false or time>9am or hangover= false
        //         * then i will go to office
        //

        boolean lRes2 = lVer1 <= lVer3  || (lVer2 == (lVer4-lVer1-lVer1) || lVer4 != lVer2);
                        // 10 <=30 || 20 == (40-10-10) || (40 != 20);
                        // True || 20 == 20 || true
                        // true || True || false   -> true
                         System.out.println("lRes2 -> " + lRes2);


/**
 *  ! -> not operator -> true means false and false means true
 */

        boolean lRes3 = !(lVer1 <= lVer3  || (lVer2 == (lVer4-lVer1-lVer1)) || lVer4 != lVer2);
                        // !(10 <=30 || 20 == (40-10-10)) || (40 != 20);
                        // !(True || 20 == 20) || true
                        // !(true || True || false)   -> !true -> false
                         System.out.println("lRes3 -> " + lRes3);


        // Ternary (?:) -> class4/Operators_Continues

        /**
         * Ternary (?:)
         *
         * double ver =
         *          if creditScore>700, then mortgage = 1.1
         *          else mortgage = 2.0
         *
         * syntax:
         *  int  var = condition ? trueValue:falseValue
         */

        int creditScore = 770;
        double mortgageRate = creditScore>700 ? 1.1 : 2.0;
        System.out.println("for credit score -" + creditScore + " -- mortgage Rate - " + mortgageRate);


        int time = 19;
        String greeting = time>12 ? " Good Evening":" Good Day ";
        System.out.println("greeting ->" + greeting);

        int myResult = creditScore>700 ? time:time++;
        System.out.println("Time : " + time);
        System.out.println(" my Result : " + myResult);

        /**
         *  Advanced Assignment (+=, -=, *=, /=, %=)
         *
         *  ++ --   -> increment or dicrement by 1
         *  int num = 15;
         *  num+= 5 // num = num + 5
         *  num = 20
         */

        int ver1 = 10;
        ver1 += 5; // ver1 = ver1 + 5
        System.out.println(" ver1 = " + ver1);   //ver1 = 15

        ver1-=2;   // ver1 = ver1 -2
        System.out.println(" ver1 = " + ver1);   //ver1 = 13

        ver1*=10;  // ver1 = ver1 * 10
        System.out.println(" ver1 = " + ver1);   // ver1 = 130

        ver1/=13;  //ver1 = ver1/13
        System.out.println(" ver1 = " + ver1);   //ver1 = 10

        ver1%=4;  //ver1 = ver1 % 4;
        System.out.println(" ver1 = " + ver1);   // ver1 =2.


















    }

}
