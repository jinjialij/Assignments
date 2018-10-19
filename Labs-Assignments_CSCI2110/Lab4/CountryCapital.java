public class CountryCapital {
    private String country;
    private String capital;

    public CountryCapital(String cou,String cap)
    {
        country=cou;
        capital=cap;
    }

    public String getCountry(){return country;}
    public String getCapital(){return capital;}

    public String toString(){return "Country: "+country+" \t"+"Capital: "+capital;}
}
