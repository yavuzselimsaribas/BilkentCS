import java.util.Scanner;


public class Lab04_Q4_R2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the line number:");
        int line = in.nextInt();

        int i = 1;
        String space = " ";
        int updatedLine = line;

        while (i-1 < line){

            

            if (true){

                
                
                System.out.print(space.repeat(2*updatedLine-2));
                
            }
            if(true){

                System.out.print("*".repeat(2*i-1));
                System.out.println();
            }

            i++;
            updatedLine--;


        }

        in.close();




    }


    
}
