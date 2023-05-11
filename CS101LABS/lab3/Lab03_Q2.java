// this program is used for getting a year input and deciding whether this year is a leap year or not.
// @author Yavuz Selim Sarıbaş 22003920

import java.util.Scanner;


public class Lab03_Q2 {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        // read the year
        System.out.print("Enter the year to be evaluated: ");
        int year = in.nextInt();

        //calculate  the century
        int century = year/100 + 1 ;

        //calculate the value for deciding which ordinal number we should get after the century
        int centuryordinal = century % 10;
        
        
       /*  switch(centuryordinal){
  
            case 1 : if(century != 11) ordinalnumber = "st"; break;
            case 2 : if(century != 12) ordinalnumber = "nd"; break;
            case 3 : if(century != 13) ordinalnumber = "rd"; break;        
                            
        } */

        // default value for ordinal number

        String ordinalnumber = "th";

        // print the first condisition as if the year is a leap year 

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            if(centuryordinal == 1 && century != 11){      // decide which ordinal number we should add by using if else statement
                ordinalnumber = "st";
            }else if(centuryordinal == 2 && century != 12){
                ordinalnumber = "nd";
            }else if(centuryordinal == 3 && century != 13){
                ordinalnumber = "th";
            }

            //print the function

            System.out.printf("The year %d is in the %d%s century and is a leap year thanks!",year,century,ordinalnumber);
            
        }
        
        // print the first condition as if year is not a leap 

        if (year % 4 != 0){
            if(centuryordinal == 1 && century != 11){
                ordinalnumber = "st";
            }else if(centuryordinal == 2 && century != 12){
                ordinalnumber = "nd";
            }else if(centuryordinal == 3 && century != 13){
                ordinalnumber = "th";
            }

            System.out.printf("The year %d is in the %d%s century and is not a leap year",year,century,ordinalnumber);
            
        }

        // print the second condisition as if the year is a leap year        

        if (year % 4 == 0 && year % 100 != 0){
            if(centuryordinal == 1 && century != 11){
                ordinalnumber = "st";
            }else if(centuryordinal == 2 && century != 12){
                ordinalnumber = "nd";
            }else if(centuryordinal == 3 && century != 13){
                ordinalnumber = "th";
            }

            System.out.printf("The year %d is in the %d%s century and is a leap year thanks!",year,century,ordinalnumber);
            
        }

        // print the second condition as if year is not a leap 

        if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
            if(centuryordinal == 1 && century != 11){
                ordinalnumber = "st";
            }else if(centuryordinal == 2 && century != 12){
                ordinalnumber = "nd";
            }else if(centuryordinal == 3 && century != 13){
                ordinalnumber = "th";
            }

            System.out.printf("The year %d is in the %d%s century and is not a leap year",year,century,ordinalnumber); 
            
        }
            
        in.close();

    }

    
    
}
