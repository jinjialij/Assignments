/*A class PlayerStats holds an unordered list of PlayerRecord objects
* */
public class PlayerStats {
    //attribute
    private List <PlayerRecord> playerStats;
    //constructor
    public PlayerStats(){playerStats = new List<PlayerRecord>();}

    //methods
    //get list
    public List<PlayerRecord> getPlayerStats()
    {
        return playerStats;
    }

    //add new record
    public void add(PlayerRecord pr)
    {
        playerStats.add(pr);
    }

    //check if the playerstats is empty
    public boolean isEmpty()
    {
        return playerStats.isEmpty();
    }

    //contains method
    public boolean contains(PlayerRecord pr)
    {
        return playerStats.contains(pr);
    }

    //get first item in the list
    public PlayerRecord first()
    {
        return playerStats.first();
    }

    //get next item in the list
    public PlayerRecord next()
    {
        return playerStats.next();
    }

    //enumerate
    public void enumerate()
    {
        playerStats.enumerate();
    }

    //get the largest GWG.
    public int mostGWG()
    {
        PlayerRecord max=playerStats.first();
        PlayerRecord curr =playerStats.first();
        if(playerStats.isEmpty())
        {
            return -1;
        }
        else
        {
            while(curr!=null)
            {
                if (curr.getGWG()>max.getGWG())
                {
                    max= curr;
                }
                curr=playerStats.next();
            }
            return max.getGWG();
        }
    }

    /*This method displays the player’s name and his team’s name who scored the most GWG.
    If more than one player has the largest GWG, display all the players and their teams.*/
    public void displayMostGWGPlayers()
    {
        int max = mostGWG();
        if(max==-1){System.out.print("Empty list. No result");}
        else
        {
            PlayerRecord curr =playerStats.first();
            while(curr!=null)
            {
                if (curr.getGWG()==max)
                {
                    System.out.println("Player name: "+curr.getName()+"\tTeam: "+curr.getTeam());
                }
                curr=playerStats.next();
            }
        }
    }

    //find the longest time on ice
    public int maxTimeOnIcs()
    {
        int max=playerStats.first().getATOI();
        PlayerRecord curr =playerStats.first();
        if(playerStats.isEmpty())
        {
            return -1;
        }
        else
        {
            while(curr!=null)
            {
                if (curr.getATOI()>max)
                {
                    max=curr.getATOI();
                }
                curr=playerStats.next();
            }
            return max;
        }
    }

    /*This method displays the player’s name and his team’s name.
    Note: If more than one player has the largest ATOI, display all the players and their teams.
    * */
    public void displayMostATOIPlayers()
    {
        int max=maxTimeOnIcs();

        if(max==-1)
        {
            System.out.print("Empty list. No result.");
        }
        else
        {
            PlayerRecord curr =playerStats.first();
            while(curr!=null)
            {
                if (curr.getATOI()==max)
                {
                    System.out.println("Player name: "+curr.getName()+"\tTeam: "+curr.getTeam());
                }
                curr = playerStats.next();
            }
        }
    }

    //find most maximum number of penalty minutes
    public int maxPIM()
    {
        int maxPIM=-1;
        if (playerStats.isEmpty())
        {
            return maxPIM;
        }
        else
        {
            maxPIM=playerStats.first().getPIM();
            PlayerRecord curr =playerStats.first();
            while(curr!=null)
            {
                if (curr.getPIM()>maxPIM)
                {
                    maxPIM=curr.getPIM();
                }
                curr=playerStats.next();
            }
            return maxPIM;
        }
    }

    //display display all the players and their teams who is the most aggressive player(who had the maximum number of penalty minutes)
    public void displayMostAgressivePlayer()
    {
        int maxPIM=maxPIM();
        if (maxPIM==-1)
        {
            System.out.print("Empty list. No result");
        }
        else
        {
            PlayerRecord curr =playerStats.first();
            while(curr!=null)
            {
                if (curr.getPIM()==maxPIM)
                    System.out.println("Player name: "+curr.getName()+"\tTeam: "+curr.getTeam());
                curr=playerStats.next();
            }
        }
    }

    //find the most number of shots on goals(SOG)
    public int mostSOG()
    {
        int max=-1;
        if (playerStats.isEmpty())
        {
            return max;
        }
        else
        {
            max=playerStats.first().getSOG();
            PlayerRecord curr =playerStats.first();
            while(curr!=null)
            {
                if (curr.getSOG()>max)
                {
                    max=curr.getSOG();
                }
                curr=playerStats.next();
            }
            return max;
        }
    }

    //display most promising players who took the most number of shots on goal (SOG)
    public void displayMostPromisingPlayers()
    {
        int maxSOG=mostSOG();
        if (maxSOG==-1)
        {
            System.out.print("Empty list. No result");
        }
        else
        {
            PlayerRecord curr =playerStats.first();
            while(curr!=null)
            {
                if (curr.getPIM()==maxSOG)
                    System.out.println("Player name: "+curr.getName()+"\tTeam: "+curr.getTeam());
                curr=playerStats.next();
            }

        }
    }

    //find most assists
    public int mostAssists()
    {
        int max=-1;
        if (playerStats.isEmpty())
        {
            return max;
        }
        else
        {
            max=playerStats.first().getA();
            PlayerRecord curr =playerStats.first();
            while(curr!=null)
            {
                if (curr.getA()>max)
                {
                    max=curr.getA();
                }
                curr=playerStats.next();
            }
            return max;
        }
    }

    /*display players who provided the most assists*/
    public void displayMostAssistPlayers()
    {
        int maxA=mostAssists();
        if (maxA==-1)
        {
            System.out.print("Empty list. No result");
        }
        else
        {
            PlayerRecord curr =playerStats.first();
            while(curr!=null)
            {
                if (curr.getA()==maxA)
                    System.out.println("Player name: "+curr.getName()+"\tTeam: "+curr.getTeam());
                curr=playerStats.next();
            }
        }
    }
}
