package DataType;

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




    }

}
