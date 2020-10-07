package DataType;

public class Class7_LoopImp {
    public static void main(String[] args) {

        /**
         * Loops
         * 1. for loop
         * 2. while loop
         * 3. do-while loop
         * 4. Enhanced for loop
          */

        /*
        initialization

            for (initialization; condition; increment) {
                // code
             }



         */
        //print "Hello" 5 times

         for (int i=0;i<5; i++) {
            System.out.println("Hello");
         }

         for (int i=1;i<5;i++){
             System.out.println("Hello- + i");
         }

         for (int i=0; i<=4; i++){
             System.out.println("Hello- "+(i+1));
         }

         /*
            1. java initializes the variable i to given value (i=0)
             2.verify the condition (1<5 -> 0<5 = true)
             3.if result of condition is true,java will enter the for-loop and execute the code; else stop the code
             4.after the last line of code inside-for-loop, perform increment operation(i++)
             5.Go to top and verify the condition (i<5 -> 1<5 = true
             6.if result of condition is true, java will enter the for loop and execute the code; else stop the code
             7.after the last line of code inside-for loop, perform increment operation(i++)

          */

        String [] names = {"Happy","Peace","Joy","Laugh"};
        /*
        Happy
        Peace
        Joy
        Laugh
         */

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        for (int i=0; i<=3; i++){
            System.out.println(names[i]);
        }

        for (int i=0; i<=names.length-1 ; i++){
            System.out.println(names[i]);
        }

        for (int i=1; i<=names.length; i++){
            System.out.println(names[i-1]);
        }

    // print the values present in even index  (0,2,4,6,8....)


        for (int i=0; i<names.length; i++){
            if (i%2 == 0) {
                System.out.println(names[i]);
            }
        }

        for(int i=0;i<names.length;i+=2){
            System.out.println(names[i]);
        }


        /**
        Enhanced for Loop
         ===============
        when you need to traverse an array(or similar datatypes)
        from index-0 to last-index, one by one
         */

        /*
        for (datatype var : arrName){
                var
        }

        for 1st loop -> var = arrName[0]
        for 2nd loop -> var = arrName[1]
        ........
        ........
         */

        /* Ref-
        for (int i=0; i<=names.length-1 ; i++){
            System.out.println(names[i]);
        }   */


        /*Exercise-1
        ============= */


        String [] names0 = {"Bangladesh", "is","my","motherland"};

        // For loop
        for(int i=0; i<=names0.length-1; i++){
            System.out.println(names[i]);
        }
        // Enhanced for loop
        for (String name : names0){
            System.out.println(name);
        }

         /*Exercise-2
        ============= */

        int[] idn = {49584,9855,59000,21500};
        // for loop
        for (int i=0; i<=3; i++){
            System.out.println(idn[i]);
        }
        //Enhanced for loop

        for(int xy : idn){
            System.out.println(xy);
        }


        /**
         * print numbers from 10 to 1
         * hints- use for loop
         */

        //int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        for (int i=10; i>=1; i--){
            System.out.println(i);
        }

        // while loop

        /**
         * while loop
         *
         * syntax:
         *          while (condition){
         *          // code to run
         *          // until condition is true
         *          increment or decrement operation
         *          }
         *
         */


        int p=0;
        // print Dear 5 times
        while (p<5){
            System.out.println("Dear");
            p++;
        }

        char[] alphabets = {'A','B','C','D','E','F','G',};
        // Print all values from array using for-loop,enhanced-for loop and while-loop

        // For loop

        // instead of int I used char

        for (int i=0; i<=alphabets.length-1; i++){
            System.out.println(alphabets[i]);
        }
        // Enhanced for loop

         for (int abid : alphabets){
            System.out.println(abid);
        }

         // while loop

        int k=0;
         while (k<alphabets.length){
             System.out.println(alphabets[k]);
             k++;
         }


        /**
         * write a code to print the reverse a given string
         *
         * "happy"
         * "yppah"
         */

        /*
                find lastIndex (length-1)
                sout(chatAt(lastIndex))
                find secondIndex (length-2)
                sout(harAt(secondLastIndex)
         */

            




    }

}
