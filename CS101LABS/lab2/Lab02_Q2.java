import java.util.Scanner;


public class Lab02_Q2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        //Read the odometer
        System.out.print("Enter the odometer reading of the car in kilometers: ");
        double odometer = in.nextDouble();

        //constants
        final double OIL_CHANGE,BATTERY,BRAKES,TIRE,OTHER;
        OIL_CHANGE = 30.0;
        BATTERY = 15.0;
        BRAKES = 25.0;
        TIRE = 13.0;
        OTHER = 17.0;

        double oil_change,battery,brakes,tire,other;
        oil_change = odometer * OIL_CHANGE/100.0;
        battery = odometer * BATTERY / 100.0;
        brakes = odometer *BRAKES / 100.0;
        tire = odometer *TIRE /100.0;
        other = odometer * OTHER / 100.0;

        //print the outputs
        
        String str = "*".repeat(49);
        System.out.println(str);
        System.out.println("*****  Maintenance Cost Distribution Table  *****");
        System.out.println(str);
        System.out.printf("*%-18s   %%%.0f  %21.2f*\n", "Oil Charge" ,OIL_CHANGE,oil_change/10);
        System.out.printf("*%-18s   %%%.0f  %21.2f*\n","Battery",BATTERY,battery/10);
        System.out.printf("*%-18s   %%%.0f  %21.2f*\n","Brakes",BRAKES,brakes/10);
        System.out.printf("*%-18s   %%%.0f  %21.2f*\n","Tire",TIRE,tire/10);
        System.out.printf("*%-18s   %%%.0f  %21.2f*\n","Other",OTHER,other/10);
        System.out.printf("*%-18s   %s  %19.2f*\n","","TOTAL",odometer/10);
        System.out.println(str);
        in.close();

        





    }

    


    
    
}
