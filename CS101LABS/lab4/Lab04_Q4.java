import java.util.Scanner;

public class Lab04_Q4 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = in.nextInt();
        int i = 1;
        String asterisks = "*";
        while (i<=lines)
        {

            System.out.println(asterisks);
            asterisks = asterisks + "*";
            i++;


        }

        in.close();


    }

    
}
