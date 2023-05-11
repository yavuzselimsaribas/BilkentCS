import java.lang.String;
import java.util.Scanner;

public final class Lab02_Q3 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //read the title
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_RESET = "\u001B[0m";
        System.out.printf("Enter the title:"+ ANSI_YELLOW);
        String title = in.nextLine();
        System.out.print("" + ANSI_RESET); 
    

        //print repeated character "-"
        String str = "-".repeat(38);
        System.out.println(str);



        // calculate the lenght and print it
        int len = title.length();
        System.out.printf("Number of characters:%d%n",len);

        //All uppercase
        String uppertitle = title.toUpperCase();
        System.out.printf("All uppercase:%s%n",uppertitle);

        //Remove leading and trailing blank characters
        String removedtitle = title.trim();
        System.out.printf("Remove leading and trailing blank characters:%s%n",removedtitle);

        //Character at index position 5
        System.out.printf("Character at index position 5:%s%n",title.charAt(5));

        //Title from 3rd character to 8th character (not included)
        String interval = title.substring(2,7);
        System.out.printf("Title from 3rd character to 8th character (not included):%s%n",interval);

        //First occurence of character 'a'
        System.out.printf("First occurence of character 'a':%d%n",title.indexOf("a"));

        //Last occurence of character 'a'
        System.out.printf("Last occurence of character 'a':%d%n",title.lastIndexOf("a"));
    
        in.close();

    }
        
        
}
    

    

    

   


        
    

    
