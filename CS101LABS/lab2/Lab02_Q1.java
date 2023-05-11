import java.util.Scanner;


public class Lab02_Q1 {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        
        //Read width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = in.nextDouble();


        //Read height of the rectangle
        System.out.print("Enter the height of the rectangle: ");
        double height = in.nextDouble();

        //Compute the area, circumference and diagonal of the rectangle

        double area,circumference,diagonal;

        area = width*height;
        circumference = 2 * (width+height);
        diagonal = (Math.pow((Math.pow(width,2)+Math.pow(height,2)),0.5));

        //print out the results

        System.out.printf("The area of the rectangle is          :     %5.3f " , area);//if you want to add a space just put a value before '.'
        System.out.println("");
        System.out.printf("The circumference of the rectangle is :      %5.3f", circumference);
        System.out.println("");
        System.out.printf("The diagonal of the rectangle is      :      %5.3f" ,diagonal );

        in.close();


    }

}

    
    
    

    

