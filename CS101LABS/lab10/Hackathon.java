public class Hackathon {
    private final static int MAX_NO_OF_PROJECTS = 6;
    private final static int INDICATOR_COUNT = 4;
    private final static double[] INDICATOR_WEIGHTS = null;
    private int projectCount;
    private Project[] projects;

    public Hackathon()
    {
        this.projectCount = 0;
        this.projects = new Project[6];
    }
    
    //getter
    public int getMaxgetMaxNoOfProjects(){return MAX_NO_OF_PROJECTS;}
    public int getIndicatorCount(){return INDICATOR_COUNT;}
    public double[] getIndicatorWeights(){return INDICATOR_WEIGHTS;}
    public int getProjectCount(){return this.projectCount;}
    //other methods
    public void addProject(Project aProject)
    {
        this.projects[projectCount] = aProject;
        this.projectCount++;
        aProject.setHackathon(this);
    }
    public String scoreOutputs()
    {
        String scoreOutputs = "";
        for(int i=0; i<this.projectCount;i++)
               {
                   scoreOutputs = scoreOutputs+ this.projects[i].toString() +"\n";
               }
        return scoreOutputs;
    }

    public String toString(){
        
        if(this.projects[0].getTableType() == 0)
        {return "Initial Table\n"+
               "***********************************************************************"+"\n"+
               "Project ID    Indicator 1    Indicator 2    Indicator 3     Indicator 4"+"\n"+
               scoreOutputs()+"\n"+               
               "***********************************************************************"+"\n";
            
        }
        else if(this.projects[0].getTableType() == 1)
        {
            return  "Modified Table\n"+
            "***********************************************************************"+"\n"+
            "Project ID    Indicator 1    Indicator 2    Indicator 3     Indicator 4"+"\n"+
            scoreOutputs()+"\n"+               
            "***********************************************************************"+"\n";
        }
        else if(this.projects[0].getTableType() == 2)
        {
            return "Final Table\n"+
            "************************************************************************************************************************"+"\n"+
            "Project ID     Indicator 1     Indicator 2     Indicator 3     Indicator 4     Weighted Mean     Segment     Credibility"+"\n"+
            scoreOutputs()+"\n"+               
            "************************************************************************************************************************"+"\n";

        }
        else{
            return "do not belive me just go!!";
        }
    
    }

    public static void main(String[] args){

        //set up for projects and hackathon
        double[] newScores = {100,240,15,26};
        double[] newScores2 = {20,407,13,11};
        double[] newScores3 = {100,281,13,39};
        double[] newScores4 = {80,1264,4,38};
        double[] newScores5 = {20,1020,12,11};
        double[] newScores6 = {100,1162,17,34};
        Project project1 = new Project("A1",newScores);
        Project project2 = new Project("A2",newScores2);
        Project project3 = new Project("A3",newScores3);
        Project project4 = new Project("A4",newScores4);
        Project project5 = new Project("A5",newScores5);
        Project project6 = new Project("A6",newScores6);
        
        Hackathon hackathon = new Hackathon();
        hackathon.addProject(project1);
        hackathon.addProject(project2);
        hackathon.addProject(project3);
        hackathon.addProject(project4);
        hackathon.addProject(project5);
        hackathon.addProject(project6);    
        System.out.println(hackathon.toString());

        //calculate modified scores and print
        project1.calcModifiedScores();
        project2.calcModifiedScores();
        project3.calcModifiedScores();
        project4.calcModifiedScores();
        project5.calcModifiedScores();
        project6.calcModifiedScores();
        System.out.println(hackathon.toString());

        //calculate other things and print final table
        project1.calcModifiedScores();
        project1.calcWeightAvg();
        project1.calcSegment();
        project1.calcCredibility();
        project2.calcModifiedScores();
        project2.calcWeightAvg();
        project2.calcSegment();
        project2.calcCredibility();
        project3.calcModifiedScores();
        project3.calcWeightAvg();
        project3.calcSegment();
        project3.calcCredibility();
        project4.calcModifiedScores();
        project4.calcWeightAvg();
        project4.calcSegment();
        project4.calcCredibility();
        project5.calcModifiedScores();
        project5.calcWeightAvg();
        project5.calcSegment();
        project5.calcCredibility();
        project6.calcModifiedScores();
        project6.calcWeightAvg();
        project6.calcSegment();
        project6.calcCredibility();
        System.out.println(hackathon.toString());

    }





}
