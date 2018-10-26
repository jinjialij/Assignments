import java.io.*;
import java.util.Scanner;
public class NHLStatsDemo
{
    public static void main(String[] args) throws IOException
    {
        //read from file
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = kb.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        PlayerStats pS = new PlayerStats();
        Team t =null;
        TeamStats tS = new TeamStats();
        String n,team,gp,g,a,p,rating,ppg,ppp,ptsg,shg,shp,gwg,pim,sog,shootG,atoi;
        PlayerRecord pR=null;

        while (inputFile.hasNext())//read file
        {
            n=inputFile.nextLine();
            team=inputFile.nextLine();
            gp=inputFile.nextLine();
            g=inputFile.nextLine();
            a=inputFile.nextLine();
            p=inputFile.nextLine();
            rating=inputFile.nextLine();
            ppg=inputFile.nextLine();
            ppp=inputFile.nextLine();
            ptsg=inputFile.nextLine();
            shg=inputFile.nextLine();
            shp=inputFile.nextLine();
            gwg=inputFile.nextLine();
            pim=inputFile.nextLine();
            sog=inputFile.nextLine();
            shootG=inputFile.nextLine();
            atoi=inputFile.nextLine();
            //use variables to create playerRecord object
            pR=new PlayerRecord(n,team,Integer.parseInt(gp),Integer.parseInt(g),Integer.parseInt(a),Integer.parseInt(p),Integer.parseInt(rating),Integer.parseInt(ppg),Integer.parseInt(ppp),Double.parseDouble(ptsg),Integer.parseInt(shg),Integer.parseInt(shp),Integer.parseInt(gwg),Integer.parseInt(pim),Integer.parseInt(sog),Double.parseDouble(shootG),atoi);
            t=new Team(team,Integer.parseInt(gwg),Integer.parseInt(pim));//create a team object
            if(!tS.contains(t))//add team in teamstats if it doesn't exist in the teamstats list
            {
                tS.add(t);//add to teamstats list
            }
            else//update team total gmg and pmi if it is already in the teamlist
            {
                tS.addToTeamTotal(Integer.parseInt(gwg),Integer.parseInt(pim),t);
            }
            pS.add(pR);//add playerrecord in playerstats
        }

        inputFile.close();
        System.out.println("NHL Results Summary: ");
        System.out.println("Players with the highest game winning goals and their teams: ");
        pS.displayMostGWGPlayers();//call method to print players with max gmg
        System.out.println("");
        System.out.println("Players with the highest average time on ice and their teams: ");
        pS.displayMostATOIPlayers();//call method to print players with max atoi
        System.out.println("");
        System.out.println("Teams that had the most number of penalty minutes: ");
        tS.displayMostTPIMTeam();//call method to print teams with max pim
        System.out.println("");
        System.out.println("Teams that had the most number of game winning goals: ");
        tS.displayMostTGWGTeam();//call method to print teams with max gwg

    }
}
