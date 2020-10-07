package DataType;

import java.util.Arrays;

public class Class5_ArrayConcept {
    public static void main(String[] args) {

    /**
    Its a Non-Primitive.
        datatype,which can store multiple values of SAME datatype.

     Thing to know before creating an Array-
      1. What datatype of values you are going to store.
      2. Total number of values I would like to store
        or
          All the values that need to be stored in array.

     Syntax to create Array:
     datatype[] arrName = new datatype[totalValueCount];
     OR
     datatype[] arrName = {value1, value2, value3, value4,value5};

    */

    double[] myBills = new double[5];

         // Array -> { , , , , ,}
        // index -> 0,1,2,3,4.

        myBills[0] = 100.9;    // storing value in myBills- index0


        // Array -> {100.9 , , , , ,}
        // index ->   0,    1,2,3,4.

        myBills[4] = 4.4;

        // Array -> {100.9 , , , ,4.4 ,}
        // index ->   0,    1,2,3, 4.


        myBills[3] = 4.7;

        // Array -> {100.9 , , ,4.7,4.4 ,}
        // index ->   0,    1,2, 3, 4.

        myBills[2] = 9.4;

        // Array -> {100.9 , ,9.4 ,4.7 ,4.4 ,}
        // index ->   0,    1,  2,   3,    4.

        myBills[1] = 24.4;

        // Array -> {100.9 ,24.4 ,9.4 ,4.7 ,4.4 ,}
        // index ->   0,    1,     2,   3,    4.

        // using shortcut to print the array.
        System.out.println(Arrays.toString(myBills));

        // store the value at index-2 in new variable(foodBill)
        double foodBill = myBills[2];  // to retrieve the value at index-2 from myBills Array
        // foodBills = 4.2

        // change the value at index-4;
        // New value should be the total of index -0,1,2,3

        myBills[4] = myBills[0] + myBills[1]  + myBills[2] + myBills[3];
        System.out.println(Arrays.toString(myBills));


        /**
         To find the length of Array
         length  <- In Array, length is not a method, its a variable
         */

        System.out.println("Length of myBills Array: " + myBills.length);  //5










    }

}
