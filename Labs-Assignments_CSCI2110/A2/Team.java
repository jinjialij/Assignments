/*A class holds the team name, total number of game winning goals and
the total number of penalty minutes of players belonging to this team*/
public class Team {
    //attributes
    private String name;
    private int totalGWG=0;
    private int totalPIM=0;
    //constructor
    public Team(){}

    public Team(String tn,int gwg,int pim)
    {
        name=tn;
        totalPIM+=pim;
        totalGWG+=gwg;
    }

    //get methods
    //get name
    public String getName(){return name;}

    //get total number of game winning goal
    public int getTotalGWG(){return totalGWG;}

    //get the total number of penalty minutes
    public int getTotalPIM(){return totalPIM;}

    //set methods
    public void setTotalGWG(int tGwg) {totalGWG=tGwg;}
    public void setTotalPIM(int tPim) {totalPIM=tPim;}

    //add to total methods
    public void addToTotalGWG(int gwg){totalGWG+=gwg;}
    public void addToTotalPIM(int pim){totalPIM+=pim;}

}
