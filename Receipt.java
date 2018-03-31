public class Receipt
{  //attributes
    private int date;
    private int month;
    private int year;
    private double price;
    private double amount;
    private double distance;
    private String rNum;
    //constructor
    public Receipt( int y,int m,int day,double p, double a, double dist)
    {
        date=day;
        month=m;
        year=y;
        price=p;
        amount=a;
        distance=dist;
        rNum=""+year+""+month+""+date;//covert int datatype (date,month,year) into string
    }
    //get methods
    public int getDate()
    {
        return date;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public double getPrice()
    {
        return price;
    }

    public double getAmount()
    {
        return amount;
    }

    public double getDistance()
    {
        return distance;
    }

    public String getRNum()
    {
        return rNum;
    }

    //set methods
    public void setDate(int d)
    {
        date=d;
    }

    public void setMonth(int m)
    {
        month=m;
    }

    public void setYear(int y)
    {
        year=y;
    }

    public void setPrice(double p)
    {
        price=p;
    }

    public void setAmount(double a)
    {
        amount=a;
    }

    public void setDistance(double dist)
    {
        distance=dist;
    }

    public void setRNum(String r1)
    {
        rNum=r1;
    }

    //toString method
    public String toString()
    {
        return "Date of fueling(YY/MM/DD): "+year+"/"+month+"/"+date+"\nThe receipt number: "+rNum+"\nThe cost: "+price+"\nAmount of gas purchased: "+amount+"\nDistance travelled: "+distance+"\n\n";
    }

    public static void main(String[] args)
    {
        Receipt r=new Receipt(2010,01,02,1.2,20,200);
        System.out.println(r);
        /*r.setDate(10);
        r.setMonth(12);
        r.setYear(2015);
        r.setPrice(2.7);
        r.setAmount(50);
        r.setDistance(500);
        System.out.print("\n"+r.getYear()+"\t"+r.getMonth()+"\t"+r.getDate()+"\n"+r.getPrice()+"\t"+r.getDistance()+"\t"+r.getAmount()+"\t");
        */
    }

}

