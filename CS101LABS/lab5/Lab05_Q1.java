//@author Yavuz Selim Sarıbaş
import java.util.Scanner;

public class Lab05_Q1 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter city plan string: ");
        String plan = in.nextLine();
        System.out.println("City blueprint:");
        
        int max = 0;

        

        
        

        for(int i = 0; i < plan.length(); i++){

            int x = Character.getNumericValue(plan.charAt(i));
            if (x> max ){
                max = x;
                
                }
             
            }
            

          // find the max value among the digits.

        for(int temp3=0; temp3 < max ; max--){ // atıyorum 4341 ve bizde max 4 tamam mı max 4 e eşitken if değer ona eşit ya da büyükse
            // * bas değilse boşluk bas, sonra alt satıra geç. maxı bir rakam küçült ve aynı şeyi devam ettir- max 0 olana kadar.

            for ( int temp2 = 0; temp2 < plan.length(); temp2++){
                if(Character.getNumericValue(plan.charAt(temp2)) >= max){

                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();


            
        }

        System.out.printf("\n **\n**"); 

       



        
        



        in.close();
    }
     
    
}
