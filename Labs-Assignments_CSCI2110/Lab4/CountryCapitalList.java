public class CountryCapitalList {
    private List<CountryCapital> countrycapitals;

    public CountryCapitalList()
    {
        countrycapitals=new List<CountryCapital>();
    }

    //add countries
    public void add(CountryCapital c1)
    {
        countrycapitals.add(c1);
    }

    public CountryCapital first()
    {
        return countrycapitals.first();
    }
    public CountryCapital next()
    {
        return countrycapitals.next();
    }


    public int getSize(){return countrycapitals.size();}

    //get certain element in list according to a given index
    public CountryCapital getAt(int index)
    {
        if(index<countrycapitals.size())
        {
            int count=0;
            CountryCapital c=countrycapitals.first();
            while(count<index)
            {
                count++;
                c=countrycapitals.next();
            }
            return c;
        }
        else return null;
    }
    //display all elements in list
    public void display(){countrycapitals.enumerate();}
}
