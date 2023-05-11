// @author Yavuz Selim Sarıbaş
// Calculate Simple Expressions
// it should write : Result of expression 1 is bla bla and 2 is bla bla okey that's cool.
// Result of expression 1 is: -0.808730641463529
// Result of expression 2 is: 7.218181818181816
// Result of expression 3 is: 0.7937005259840998

public class Lab01_Q2 {
    public static void main(String args[])
    {
        //variables
        double result1 , result2 ,x,y;
        //expressions
        result1 = (32.2 - 1.7 / (2.2))/((1.5 - 7.3) * (4.3 + 2.4));
        result2 = (73.5 * 16.4 - Math.pow(3,6))/(34 + Math.pow(2,5));
        x = 1.2 + 0.8;
        y = (-1.0/3.0);
    
        System.out.println("Result of expression 1 is: " + result1);
        System.out.println("Result of expression 2 is: " + result2);
        System.out.println("Result of expression 3 is: " + Math.pow(x,y));
    }

    
}
