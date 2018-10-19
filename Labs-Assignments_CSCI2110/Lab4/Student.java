public class Student {
    //attributes
    private int studentID;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String faculty;


    //constructor
    public Student(int sID,String fn, String ln,String em,String m, String f)
    {
        studentID=sID;
        firstName=fn;
        lastName=ln;
        email=em;
        major=m;
        faculty=f;
    }

    public String toString()
    {
        return studentID + " " + firstName + " " + lastName + " " + email +" " + major + " " + faculty + " ";
    }


    public boolean equals(Student other)
    {
        return (studentID == studentID && firstName.equals(other.firstName) && lastName.equalsIgnoreCase(other.lastName));

    }

    //get methods
    public int getStudentID(){return studentID;}
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName() {return lastName;}
    public String getEmail()
    {
        return email;
    }
    public String getMajor()
    {
        return major;
    }
    public String getFaculty()
    {
        return faculty;
    }

}
