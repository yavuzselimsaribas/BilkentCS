import java.util.Scanner;

public class Lab04_Q2 {
    
    public static void main(String[] args)
    {

        System.out.print("Please input the string: ");
        Scanner in = new Scanner(System.in);
        String palCheck = in.nextLine();
        String palNotReversed = palCheck ;
        
        palCheck = palCheck.toLowerCase();
        palCheck = palCheck.replaceAll(" ","");

        int a,b;
        a = 0;
        b = palCheck.length()-1;
        boolean res = true ; 

        while (a < b)
        {
            if(palCheck.charAt(a) != palCheck.charAt(b))
            {
                res = false;
            }
            
            a++;
            b--;

        }

        
        if (res)
        {
            System.out.print(palNotReversed+" is palindrome");

        }else 
        {
            System.out.print(palNotReversed + " is not Palindrome");
        }


        in.close();
        
    }
}
