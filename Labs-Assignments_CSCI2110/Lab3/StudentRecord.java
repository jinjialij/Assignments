public class StudentRecord {
    //attributes
    private String firstName;
    private String lastName;
    private int bannerID;

    //constructor
    public StudentRecord(){};

    public StudentRecord(String fn,String ln,int b){
        firstName=fn;
        lastName=ln;
        bannerID=b;
    }

    //get methods
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getBannerID(){return bannerID;}

    //set methods
    public void setFirstName(String fn){firstName=fn;}
    public void setLastName(String ln){lastName=ln;}
    public void setBannerID(int id){bannerID=id;}

    //toString method
    public String toString(){
        return firstName+" "+lastName+" "+bannerID;
    }
}
