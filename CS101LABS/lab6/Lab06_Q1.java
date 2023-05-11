import java.util.Scanner;

public class Lab06_Q1 {

    public static boolean isPerfectSquare(int a){

        int square = (int)Math.sqrt(a);                   
        return ((square * square) == a);

    }
    public static boolean isFibonacci(int n){
        return isPerfectSquare(5*n*n +4) || isPerfectSquare(5*n*n -4);
    }
    public static int sumOfDigits(int n){
        int sum,digit = 0;
        sum = 0;
        
        while(n> 0){
            digit = n %10;
            sum += digit;
            n = n/10;
        }
        return sum;
    }
    public static boolean isHarshad(int x){
        return (x % sumOfDigits(x) == 0);
    }
    
    public static boolean isPrime(int x){
        if (x <= 1){
            return false;
        }
        for(int i = 2; i <= (x-1); i++){
            if (x% i == 0){
                return false;
            }
        }
        return true;
    }
    public static int power(int x,int y){

        return (int)Math.pow(x,y);
    }
    public static int countDigits(int x){
        int i = 0;
        while(x>0){
           x = x/10;
           i++;

        }
        return i;
        
    }
    public static boolean isNarcissistic(int x){
        int sum = 0;
        int count = countDigits(x);
        int xFirst =x;
        
        while(x > 0){
            int a = x % 10;
            sum = sum + power(a,count); 
            x = x/10; 
        }
        return sum == xFirst;
    }
    
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter number to be examined: ");
       int num = in.nextInt();
       System.out.printf("Number of digits:%d",countDigits(num));
       System.out.printf("\nSum of digits:%d\n",sumOfDigits(num));
       if(isFibonacci(num)){
           System.out.println(num + " is a Fibonacci number.");
           
       }else{
           System.out.println(num+ " is not a Fibonacci number.");
       }
       if(isHarshad(num)){
           System.out.println(num+ " is a Harshad number.");
       }else{
           System.out.println(num+ " is not a Harshad number.");
       }
       if(isNarcissistic(num)){
           System.out.println(num + " is Narcissistic.");
       }else{
           System.out.println(num+" is not Narcissistic.");
       }
       if(isPrime(num)){
           System.out.println(num+" is a Prime number.");
       }else{
           System.out.println(num+" is not a Prime number.");
       }
       in.close();
       

        

    }




}