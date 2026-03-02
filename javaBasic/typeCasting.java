
public class typeCast {
    public static void main(String[] args) {
        
      /*Java Type Casting

        
            Type casting means converting one data type into another. For example, turning an int into a double.

            In Java, there are two main types of casting:

            Widening Casting (automatic) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double

            Narrowing Casting (manual) - converting a larger type to a smaller type size
            double -> float -> long -> int -> char -> short -> byte */


        //Narrowing Casting
        //Narrowing casting must be done manually by placing the type in parentheses () in front of the value.
        double age = 10.50d;
        int smallAge  = (int) age;

        System.out.println(smallAge);

        //Widening Casting
        //Widening casting is done automatically when passing a smaller size type into a larger size type.

        int myage = 40;
        double bigAge = myage;

        System.out.println(bigAge);
    
    }
    
}
