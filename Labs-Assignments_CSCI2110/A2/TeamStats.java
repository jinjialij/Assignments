/*A class holds an unordered list of Team objects*/
public class TeamStats {
    //attribute
    private List<Team> teamList;

    //constructor
    public TeamStats()
    {
        teamList=new List<Team>();
    }

    //add team
    public void add(Team t)
    {
        teamList.add(t);
    }

    //contains method
    public boolean contains(Team t)
    {
        return teamList.contains(t);
    }

    //add to team totalGWG and totalPIM is the team name is contained in the list
    public void addToTeamTotal(int gwg, int pim, Team t)
    {
        if(!teamList.isEmpty() && teamList.contains(t))
        {
            Team curr=teamList.first();
            while(curr!=null)
            {
                if (curr.getName().equals(t.getName()))
                {
                    curr.addToTotalGWG(gwg);
                    curr.addToTotalPIM(pim);
                }
                curr=teamList.next();
            }

        }
    }

    //get the max total penalty minutes form the teamlist
    public int maxTotalPIM()
    {
        int maxTPiM=-1;
        if (teamList.isEmpty())
            return maxTPiM;
        else
        {
            Team curr=teamList.first();
            while(curr!=null)
            {
                if (curr.getTotalPIM()>maxTPiM)
                {
                    maxTPiM=curr.getTotalPIM();
                }
                curr=teamList.next();
            }
            return maxTPiM;
        }
    }

    /*Method that displays the name of the team that had the most penalty minutes
    (sum of all penalty minutes of all players in that team).
    If more than one team has the same total penalty minutes, display the names of all such teams.
    * */
    public void displayMostTPIMTeam()
    {
        int maxTPIM=maxTotalPIM();
        if (maxTPIM==-1)
            System.out.print("Empty list, No result");
        else
        {
            Team curr=teamList.first();
            while(curr!=null)
            {
                if (curr.getTotalPIM()==maxTPIM)
                {
                    System.out.println("Team name: "+curr.getName());
                }
                curr=teamList.next();
            }
        }
    }

    //get the max total game winning goals form the teamlist
    public int maxTotalGWG()
    {
        int maxTGWG=-1;
        if (teamList.isEmpty())
            return maxTGWG;
        else
        {
            Team curr=teamList.first();
            maxTGWG=teamList.first().getTotalGWG();
            while(curr!=null)
            {
                if (curr.getTotalGWG()>maxTGWG)
                    maxTGWG=curr.getTotalGWG();
                curr=teamList.next();
            }
            return maxTGWG;
        }
    }

    /*Method that displays the name of the team that had the most number of game winning goals
    (sum of all GWGs for that team).Display all.*/
    public void displayMostTGWGTeam()
    {
        int maxTGWG=maxTotalGWG();
        if (maxTGWG==-1)
        {
            System.out.print("Empty list. No result");
        }
        else
        {
            Team curr=teamList.first();
            while(curr!=null)
            {
                if (curr.getTotalGWG()==maxTGWG)
                    System.out.println("Team Name: "+curr.getName());
                curr=teamList.next();
            }
        }
    }
}
