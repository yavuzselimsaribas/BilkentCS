import java.util.Scanner;


public class Lab04_Q3 {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n :");
        int n = in.nextInt();
        System.out.printf("Now input %d positive integers:\n",n);
        int i,max,min,sum ;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        sum = 0;
        i =1;
        while (i <= n )
        {
            int otherNums = in.nextInt();
            if(otherNums > max)
            {
                max = otherNums;
            }
            sum = (otherNums + sum);
            if(otherNums < min)
            {
            min = otherNums;
            }
            i++;


        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Average: "+ (double)sum/(i-1));
        

        in.close();

    }
}
