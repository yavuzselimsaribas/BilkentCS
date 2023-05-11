
import java.util.Scanner;


public class Lab04_Q1 {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = in.nextInt();

        int num1,num2,digit;
        num1 = 0;
        num2 = 1;
        digit = 0 ;
                  
        
        while(digit < n)
        {
            int sumOfBackTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfBackTwo;
            digit ++;
            
            
        }
        System.out.printf("Fib(%d) is  %d",(digit),num1);

        in.close();




    }
    
}
