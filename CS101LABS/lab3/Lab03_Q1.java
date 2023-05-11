//this program is used for calculating BMI by getting the weight and height values from the user and show the result.
// @author : Yavuz Selim Sarıbaş 22003920

import java.util.Scanner;


public class Lab03_Q1 
{

    public static void main(String[] args)
    {
         // call scanner and get weight and height input from user

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = in.nextDouble();
        
        System.out.print("Enter your height in meters: ");
        double height = in.nextDouble();

    

        //calculate bmi and store as a value

        double bmi = weight/(height*height);

        //print the value  of bmi using if else statements to show various conditions


        if(bmi< 18.5){
            System.out.printf("Your BMI is %.2f and you are in the category of %s",bmi,"underweight.");


        }else if(bmi < 25){
            System.out.printf("Your BMI is %.2f and you are in the category of %s",bmi,"healthy.");

        }else if(bmi <30){
            System.out.printf("Your BMI is %.2f and you are in the category of %s" ,bmi,"overweight.");

        }else {
            System.out.printf("Your BMI is %.2f and you are in the category of %s",bmi,"obese.");
        }
        

        in.close();
    }
    
}
