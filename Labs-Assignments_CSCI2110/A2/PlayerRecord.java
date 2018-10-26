/* a class has all the 17 instance variables for one
player (Name, Team, GP, G, A, …, ATOI).
* */
public class PlayerRecord {
    //attributes
    private String name;
    private String team;//team name
    private int GP;//games played
    private int G;//goals scored
    private int A;//Assists
    private int P;//points
    private int rating;//could be +/-
    private int PPG;//power play goals
    private int PPP;//power play points
    private double PTSG;//points per game
    private int SHG;//short handed goals
    private int SHP;//short handed points
    private int GWG;//game winning goals
    private int PIM;////penalty minutes
    private int SOG;//shots on goal;
    private double ShootingP;//shooting percentage
    private int ATOI;//Average Time on ice

    //constructors
    public PlayerRecord(){};

    public PlayerRecord(String n,String t,int gp,int g,int a,int p,int r,int ppg,int ppp,double ptsg,int shg,int shp,int gwg,int pim, int sog, double shootP, String atoi)
    {
        name = n;
        team =t;
        GP = gp;
        G = g;
        A = a;
        P = p;
        rating = r;
        PPG = ppg;
        PPP = ppp;
        PTSG = ptsg;
        SHG = shg;
        SHP = shp;
        GWG = gwg;
        PIM = pim;
        SOG = sog;
        ShootingP =shootP;
        ATOI = Integer.parseInt(atoi.substring(0,2))*60+Integer.parseInt(atoi.substring(3,5));//convert the string MM:SS to seconds
    }

    //getter methods
    public String getName(){return name;}
    public String getTeam(){return team;}
    public int getGP(){return GP;}//get games played
    public int getG(){return G;}//get goals scored
    public int getA(){return A;}//get Assists
    public int getP(){return P;}//get points
    public int getRating(){return rating;}//get +/- rating
    public int getPPG(){return PPG;}//get power play goals
    public int getPPP(){return PPP;}//get power play points
    public double getPTSG(){return PTSG;}//get points per game
    public int getSHG(){return SHG;}//get short hannded goals
    public int getSHP(){return SHP;}//get short handed points
    public int getGWG(){return GWG;}//get game winning goals
    public int getPIM(){return PIM;}//get penalty minutes
    public int getSOG(){return SOG;}//get shots on goal{return ;}
    public double getShootingP(){return ShootingP;}//get shooting percentage
    public int getATOI(){return ATOI;}//get Average Time on ice

    //display ATOI with designed format
    public void displayATOI()
    {
        System.out.print(ATOI/60+" : "+ATOI%60);
    }

    //toString method
    public String toString()
    {
        return "Player Name: "+name+"\nTeam Name: "+team+"\nGames played: "+GP+"\nGoals scored: "+G+"\nAssists: "+A+"\nPoints: "+P+"\nRating(+/-): "+rating+"\nPower play goals: "+PPG+"\nPower play points"+PPP+"\nPoints per game: "+PTSG+"\nShort hannded goals: "+SHG+"\nShort hannded points"+SHP+"\nGame winning goals: "+GWG+"\nPenalty minutes: "+PIM+"\nShots on goal: "+SOG+"\nShooting percentage: "+ShootingP+"\nAverage Time on ice: "+ATOI/60+" : "+ATOI%60+"\n";
    }
}
