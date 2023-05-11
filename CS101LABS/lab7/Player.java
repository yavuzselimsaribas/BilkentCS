
public class Player {

    static int count = 0;
    static int idNum = 1;
    static int countAll = 0;
    String name;
    String team;
    boolean isActive;
    private int id;
    int rosternumber;
    String position;
    int gameNumber;
    int points,rebounds,assist,turnovers;
    double pointsAvg;
    double assistsAvg;
    double reboundsAvg;
    double turnoversAvg;
    double efficiency;
    
    public Player(String initName,String initPosition, String initTeam, int initRosternumber){
        name = initName;
        countAll++;
        count++;
        id = idNum;
        idNum++;
        isActive =true;
        gameNumber = 0;
        position = initPosition;
        team = initTeam;
        rosternumber = initRosternumber;
        pointsAvg = 0;
        assistsAvg = 0;
        reboundsAvg = 0;
        turnoversAvg = 0; 
        points=0;
        rebounds=0;
        assist=0;
        turnovers=0;
        efficiency=0;         
    }
        
          
    public void setName(String initName){this.name= initName; }
    public void setPosition(String initPosition){
         if(positioncheck2(initPosition)){
            this.position = initPosition;
         }else{
            System.out.println("this position name is not available.");          
        }      
        
    }
    public void setRosterNumber(int initRosternumber){rosternumber = initRosternumber;}
    public void register(){ count++;
        countAll++;}
    public void remove(){
    countAll--;}
    public void transfer(String shiftTeam){
        if(shiftTeam.equals(team)){
            System.out.println(this.name + " is already in that team.");
        }else{
            team = shiftTeam;
        }
   }
   public boolean isBeforeThan(Player player){
       if(this.name.compareTo(player.name) < 0){
           return true;
       }else{
           return false;
       }
   }
   //with arrays
//    public boolean positioncheck(String position){
//        String[] positions = {"SF","PF","SG","PG","C"};
//        int i = 0;
//        boolean done = false;
//        while(i<5){
//            if(position == positions[i]){
//                done = true;
//                i = 5;
//            }else{
//                i++;
//                done = false;               
//            }     
//        }
//        return done;
//    }
   public boolean positioncheck2(String position){
       String position1 = "SF",position2="PF",position3="SG",position4="PG",position5="C";
       if(position.equals(position1)||position.equals(position2)||position.equals(position3)||position.equals(position4)
       ||position.equals(position5)){
           return true;
       }else{
           return false;}
   }
   public void retire(){
       this.isActive = false;
       count--;
   }

   
   
   public void pointsPerGame(int aPoints){
       gameNumber++;
       points += aPoints;

       pointsAvg = (double)points/gameNumber; 
   }
   public void assistsPerGame(int anAssists){
       assist += anAssists;
       assistsAvg = (double)assist/gameNumber;
   }
   public void reboundsPerGame(int aRebounds){
       rebounds += aRebounds;
       reboundsAvg = (double)rebounds/gameNumber;
   }
   public void turnoversPerGame(int aTurnovers){
       turnovers += aTurnovers;
       turnoversAvg = (double)turnovers/gameNumber;
   }
   public void recordGame(int aPoints,int anAssists, int aRebounds,int aTurnovers){
       
       this.pointsPerGame(aPoints);
       this.assistsPerGame(anAssists);
       this.reboundsPerGame(aRebounds);
       this.turnoversPerGame(aTurnovers);
       this.playerEfficiency();
   }
   public void playerEfficiency()
   {
    this.efficiency = 1.0*pointsAvg+(0.7)*assistsAvg+(0.7)*reboundsAvg-(0.9)*turnoversAvg;
   }
   public boolean isMoreEfficient(Player player){
       if(this.efficiency > player.efficiency){
           return true;
       }else{return false;}

    
   }
   public String toString(){
       return String.format("*".repeat(50)+"%n"+
       "Player ID: "+id+"%n"+
       "Player Name: "+this.name+"%n"+
       "Player Position:"+this.position+"%n"+
       "Current Team: "+this.team+"%n"+
       "Jersey Number: "+this.rosternumber+"%n"+
       "-".repeat(50)+"%n"+ "Stats:"+"%n"+
       "PPG: "+String.format("%.2f" ,this.pointsAvg) +"%n"+
       "APG: "+String.format("%.2f",this.assistsAvg)+"%n"+
       "RPG: "+String.format("%.2f" ,this.reboundsAvg)+"%n"+
       "TPG: "+String.format("%.2f" ,this.turnoversAvg)+"%n"+
       "Efficiency: "+String.format("%.2f" ,this.efficiency)+"%n"+
       "-".repeat(50)+"%n"+
       "Retirement Status: Active among "+count+" active player(s)"+"%n"+"*".repeat(50));

   }


public String getName() {
    return this.name;
}


public Object getEfficiency() {
    return this.efficiency;
}

static Player player1,player2,player3; // To use the player instance in all parts

    public static void part1Test() {
        // Player 1 details
        String name = "LeBron James";
        String position = "PF";
        String team = "CLE";
        int rosterNumber = 23;
        player1 = new Player(name, position, team, rosterNumber); // Used in other tests also
        player1.setRosterNumber(6);
        player1.transfer("LAL");
        player1.setPosition("guard"); // Expecting an error message
        player1.setPosition("SF");
        // Reusing generated Player class input holders
        name = "Ron Artest";
        position = "SF";
        team = "LAL";
        rosterNumber = 37;
        player2 = new Player(name, position, team, rosterNumber);
        player2.setName("Metta World Peace");
        player2.retire();
        name = "Stephen Curry";
        position = "SG";
        team = "GSW";
        rosterNumber = 30;
        player3 = new Player(name, position, team, rosterNumber);
        player3.transfer("GSW"); // An error message is expected
        // Comparing names of player1 and player3
        if (player1.isBeforeThan(player3)) {
            System.out.println("PASSED: Your result is correct");
        } else {
            System.out.println("FAILED: isBeforeThan implementation is incorrect");
        }

        // Printing player information
        // System.out.println(player1);
        // System.out.println(player2);
        // System.out.println(player3);

    }

    public static void part2Test() {
        player1.recordGame(30, 10, 4, 4);
        player1.recordGame(15, 8, 7, 2);
        player1.recordGame(26, 8, 3, 7);
        player1.recordGame(19, 6, 6, 3);
        player1.recordGame(25, 5, 2, 5);
        player1.recordGame(34, 5, 11, 4);

        System.out.println(player1);
    }

    public static void part3Test() {
        String name = "Kevin Durant";
        String position = "PF";
        String team = "BKN";
        int rosterNumber = 7;
        Player comparedPlayer = new Player(name, position, team, rosterNumber);
        comparedPlayer.recordGame(32, 4, 11, 1);
        comparedPlayer.recordGame(29, 12, 15, 2);
        comparedPlayer.recordGame(38, 3, 5, 2);
        comparedPlayer.recordGame(25, 4, 8, 1);
        comparedPlayer.recordGame(25, 2, 11, 5);

        System.out.println(player1);
        System.out.println(comparedPlayer);
    

    System.out.println("Efficiency of " + player1.getName() + ": " + String.format("%.2f", player1.getEfficiency()));
    System.out.println("Efficiency of " + comparedPlayer.getName() + ": " + String.format("%.2f", comparedPlayer.getEfficiency()));

        if (player1.isMoreEfficient(comparedPlayer)) {
              System.out.println(player1.getName() + " wins MEP award!");
         }else{
          System.out.println(comparedPlayer.getName() + " wins MEP award!");
          }
    }


    public static void main(String[] args) {
        System.out.println("TESTING PART 1");
        part1Test();
        System.out.println("TESTING PART 2");
        part2Test();
        System.out.println("TESTING PART 3");
        part3Test();

    }


   


 
}

    

    




    

