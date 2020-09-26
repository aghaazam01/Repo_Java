package DataType;

public class HomeWork_2 {
    public static void main(String[] args) {

        /** CONVERT: source-https://www.rapidtables.com
         * F -> C
         * F -> K
         * K -> C
         * K -> F
         * C -> F
         * C -> K
         */
        //.........................................................................
        // F -> C.( 32 degrees Fahrenheit = 0 degrees of celsius)
        // The temperature T in degrees Celsius (°C) is equal to the temperature T in degrees Fahrenheit (°F) minus 32, times 5/9:
        //  Convert 68 degrees Fahrenheit to degrees Celsius:

        double fTemp =68;
        // cT = (fT-32) * 5/9
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + " F is equal to " + cTemp + " deg celsius");
        // 68 degrees Fahrenheit is equal to 20 degrees of celsius.

        //.......................................................................
        // F -> K. (- 459.67 deg Fahrenheit = 0 degrees of Kelvin)
        // The temperature T in Kelvin (K) is equal to the temperature T in degrees Fahrenheit (°F) plus 459.67, times 5/9:
        // Convert 60 degrees Fahrenheit to degrees Kelvin:

        double fTem = 60;
        // kT = (TF) + 459.67) × 5/9
        double kTem  = (fTem + 459.67) * 5/9;
        System.out.println(fTem + " F is equal to " + kTem + " degrees of Kelvin" );
        // 288.71 K


        //.....................................................................
        // K -> C. (0 Kelvin = -273.15 degrees of Celsius)
        //Convert 300 Kelvin to degrees Celsius
        // The temperature T in degrees Celsius (°C) is equal to the temperature T in Kelvin (K) minus 273.15:

        double kTem1 = 300;
        // TC = TK - 273.15
        double cTem = (kTem1 - 273.15);
        System.out.println(kTem1 + "  K is equal to " + cTem + " degrees of celsius");
        //  300 degrees k is equal to 26.85 degrees of celsius.


        //.....................................................................
        // K -> F  (0 Kelvin = -459.67 degrees of Fahrenheit).
        // The temperature T in degrees Fahrenheit (°F) is equal to the temperature T in Kelvin (K) times 9/5, minus 459.67:
        // Convert 300 Kelvin to degrees Fahrenheit:

        double kTem3 = 300;
        // T(°F) = T(K) × 9/5 - 459.67
        double FTem = (kTem3 * 9/5 - 459.67);
        System.out.println(kTem3 + " k is equal to " + FTem + " degrees of Fahrenheit");
        // 300 degrees of kelvin is equal to 80.33 degrees of Fahrenheit.


        //.........................................................................
        // C -> F.(0 Celsius = -459.67 degrees of Fahrenheit).
        //The temperature T in degrees Fahrenheit (°F) is equal to the temperature T in degrees Celsius (°C) times 9/5 plus 32:
        //Convert 20 degrees Celsius to degrees Fahrenheit:

        double cTem1 = 20;
        //TF = TC × 9/5 + 32
        double fTem4 = (cTem1 * 9/5 + 32);
        System.out.println(cTem1 + " C is equal to " + fTem4 + " degrees of Fahrenheit");
        //20.0 C is equal to 68.0 degrees of Fahrenheit



        //.......................................................................
        //C -> K.(0 Celsius = 273.15 degrees of Kelvin).
        //The temperature T in Kelvin (K) is equal to the temperature T in degrees Celsius (°C) plus 273.15:
        //Convert 20 degrees Celsius to Kelvin:

        double cTem0 = 20;
        //TK = TC + 273.15
        double kTem0 = cTem0 + 273.15;
        System.out.println(cTem0 + " C is equal to " + kTem0 + " degrees of Kelvin");
        //20.0 C is equal to 293.15 degrees of Kelvin
        //.......................................................................


                            // prepared by : Agha Azam
    }
}
