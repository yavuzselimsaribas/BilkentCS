// @yavuz selim sarıbaş 22003920
// Earth has 148941024 km2 dry land and 361130976 km2 water. done
// Turkey has 773284 km2 dry land and 10185 km2 water. done
// Turkey has 0.519188051238321 percent of the Earth's dry land.  done
// Turkey has 0.0028203063921052288 percent of the Earth's water. has problems
// - The total area of the world is 510072000 km2. done
// - 70.8% of this area is covered by water and the rest is dry land.
// - The total area of Turkey is 0.1536% of the world.
// - 1.3% percent of Turkey is water.


public class Lab01_Q3 {
    public static void main(String args[])
    {
        //variables
        final long TotalAreaE =   510072000 ;
        final double EarthWaterPer = 0.708 ;
        final double TurkeyAreaPer = 0.001536 ;
        final long TotalAreaTurkey = (long) (TurkeyAreaPer *TotalAreaE)  ;    
        final double TurkeyWaterPer = 0.013 ;
        // results by using that infos
        double drylandE = TotalAreaE *(1- EarthWaterPer) ;
        int drylandE2 = (int) drylandE;
        double waterE = TotalAreaE*EarthWaterPer ;
        int waterE2 = (int) waterE;
        
        System.out.println("Earth has "+ (long) drylandE + " km2 dry land and " + (long) waterE +  " km2 water." );
        

        double drylandTR = TotalAreaTurkey * ( 1 - TurkeyWaterPer );
        int drylandTR2 = (int) drylandTR ;
        double waterTR =  TotalAreaTurkey * TurkeyWaterPer;
        int WaterTR2 = (int) waterTR;
        System.out.println("Turkey has " + (long) drylandTR + " km2 dry land and " + (long) waterTR + " km2 water.");
       
       
        double TurkeyEdryland = 100 * ((double)drylandTR2)/drylandE2 ;
        double TurkeyEarthW =  100* ((double)WaterTR2)/ waterE2 ;
        System.out.println("Turkey has "+ TurkeyEdryland +" percent of the Earth's dry land.");
        System.out.println("Turkey has " + TurkeyEarthW + " percent of the Earth's water.");

        // System.out.println("Total area of the world is "+ TotalAreaE+ " km2.");
        // System.out.println(EarthWaterPer*100+"% of this area is covered by water and the rest is dry land." );
        // System.out.printf("The total area of Turkey is %.4f%% of the world." , (100*TurkeyAreaPer)) ; // --solved-- problematic couldn't write '%'
        // System.out.println("");
        // System.out.println(TurkeyWaterPer*100+"% percent of Turkey is water.");
        
        // How much of the area of the world is dry land and how much is water?
        // How much of the area in Turkey is dry land and how much is water?
        // What percent of the whole dry land of earth is in Turkey?
        // What percent of all water is in Turkey?




         
    }
    
}
