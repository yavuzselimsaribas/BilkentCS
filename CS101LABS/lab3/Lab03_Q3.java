//this program is a one-time banking app . we have various options and with the user's decision it gives us different outputs
// @author Yavuz Selim Sarıbaş 22003920

import java.util.Scanner;

public class Lab03_Q3 
{
    public static void main(String[] args)
    {


        Scanner in = new Scanner(System.in);
        
        //read the pin as string , decide the correct pin as a string value
        System.out.print("Enter your PIN: ");
        String pin = in.nextLine();
        String correctpin = "1234";
        

        final float money = 1000f ;  // the money that always same everytime the program starts




        //  decide what user do if pin is correct or if it is not , what will be printed

        if (pin.equals(correctpin)){
            System.out.println("1- Withdraw money");
            System.out.println("2- Open a new account");
            System.out.println("3- Change PIN");
            System.out.print("Select an operation: ");
            

        }else if (pin != correctpin){

            System.out.println("Invalid PIN! Bye!");
        }



        
        // value for operation decision
        int operation = in.nextInt();


        // for each different decision for operation call different functions and get input and print what is suppoused to be written
        if (operation == 1){

            System.out.print("Enter the amount to withdraw: ");
            double withdraw = in.nextDouble();
            double newbalance = money - withdraw;

            System.out.printf("Your new balance is %.2f TRY. Bye!", newbalance);
            

        }

        if (operation == 2){


            System.out.print("1-TRY \n2-USD \nSelect currency type:");
            int selection = in.nextInt();

            if (selection == 1){
                System.out.println("Your new TRY account is now opened! Bye!");

            }else if(selection == 2){
                System.out.println("Your new USD account is now opened! Bye!");
            }
        }

        if (operation == 3){

            System.out.print("Enter your new PIN: ");
            Scanner input = new Scanner(System.in);
            String newpin = input.nextLine();

            if(newpin.length() == 4){
                String secretpin = (newpin.charAt(0)+"**"+newpin.charAt(3));                
                System.out.printf("Your PIN is changed to %s.Bye!",secretpin);
            input.close();


            }/* else if(newpin.length() != 4){
                System.out.println("You have to decide your pin with 4 character!!");
                System.out.print("Enter your new PIN: ");
                Scanner input2 = new Scanner(System.in); // initialize new scanner because it doesn't use the first one
                String newpin2 = input2.nextLine();

                String secretpin2 = (newpin2.charAt(0)+"**"+newpin2.charAt(3));
                System.out.printf("Your PIN is changed to %s.Bye!",secretpin2);
                
                input2.close();
                 */


        }
                    
         
    in.close(); 
    
  ;

    }
        
    

}    



    

    
    

    
        

    


