public class Project {

    private static int INITIAL = 0;
    private static int MODIFIED = 1;
    private static int FINAL = 2;
    private String ID;
    private double finalScore;
    private String segments = "?";
    private String credibility = "?";
    private double[] rawScores = new double[4];
    private double[] modifiedScores = new double[4];
    private Hackathon hackathon;
    private int tableType;

    public Project(String anID,double[] newRawScores)
    {
        this.ID = anID;
        this.rawScores = newRawScores;
        this.segments = "?";
        this.credibility = "?";
        this.hackathon = null;
        this.tableType = INITIAL;
    }
    //getter
    public Hackathon getHackathon(){return this.hackathon;}
    public int getTableType(){return this.tableType;}
    //setter
    public void setHackathon(Hackathon aHackathon){this.hackathon = aHackathon;}

    public void calcModifiedScores()
    {
        this.modifiedScores[0] = this.rawScores[0] ;
        if(0<this.rawScores[1]&this.rawScores[1]<=500)
        {
            this.modifiedScores[1] = 20;
        }else if(500<this.rawScores[1]&&this.rawScores[1]<=1000)
        {
            this.modifiedScores[1] = 80;
        }else{this.modifiedScores[1] = 100;}

        if(0<this.rawScores[2]&&this.rawScores[2]<=6){this.modifiedScores[2]=100;}
        else if(6<this.rawScores[2]&&this.rawScores[2]<=12){this.modifiedScores[2]= 80;}
        else{this.modifiedScores[2]=20;}

        if(0<=this.rawScores[3]&&this.rawScores[3]<10){this.modifiedScores[3]=20;}
        else if(10<=this.rawScores[3]&&this.rawScores[3]<15){this.modifiedScores[3] = 80;}
        else if(15<=this.rawScores[3]){this.modifiedScores[3] = 100;}   
        this.tableType = MODIFIED;    
    }
    
    public void calcWeightAvg()
    {
        double nominator = 0;
        double denominator = 0;
        nominator=(0.1)*this.modifiedScores[0] + (0.25)*modifiedScores[1]+(0.3)*modifiedScores[2]+(0.35)*modifiedScores[3];
        denominator = 1.0;
        this.finalScore= nominator/denominator;
        this.tableType = FINAL;     
    }
   
    public void calcSegment()
    {
        if(this.finalScore == 100){this.segments = "A+";}
        else if(this.finalScore >= 90){this.segments = "A";}
        else if(this.finalScore >=75){this.segments = "B";}
        else if(this.finalScore >= 60){this.segments = "C";}
        else if(this.finalScore >=40){this.segments = "D";}
        this.tableType = FINAL;
    }
   
    public void calcCredibility()
    {
        if(this.segments.equals("A+")){this.credibility="Perfect";}
        else if(this.segments.equals("A")){this.credibility = "Very Good";}
        else if(this.segments.equals("B")){this.credibility = "Good";}
        else if(this.segments.equals("C")){this.credibility = "Considerable";}
        else if(this.segments.equals("D")){this.credibility = "Not appropriate";}
        this.tableType = FINAL;
    }
   
    public String toString()
    {
        if(this.tableType==INITIAL){
            return this.ID+String.format("%16d",(int)this.rawScores[0])+
                        String.format("%16d",(int)this.rawScores[1])+
                        String.format("%16d",(int)this.rawScores[2])+
                        String.format("%16d",(int)this.rawScores[3]);
            

        }
        else if(this.tableType==MODIFIED)
        {
            return this.ID+String.format("%16d",(int)this.modifiedScores[0])+
                        String.format("%16d",(int)this.modifiedScores[1])+
                        String.format("%16d",(int)this.modifiedScores[2])+
                        String.format("%16d",(int)this.modifiedScores[3]);
        }
        else if(this.tableType == FINAL)
        {
            return this.ID+String.format("%16d",(int)this.modifiedScores[0])+
                           String.format("%16d",(int)this.modifiedScores[1])+
                           String.format("%16d",(int)this.modifiedScores[2])+
                           String.format("%16d",(int)this.modifiedScores[3])+
                           String.format("%17.1f",this.finalScore)+
                           String.format("%16s",this.segments)+
                           String.format("%21s",this.credibility); 
        }
        else{
            return null;
        }

        

    }


    
}
