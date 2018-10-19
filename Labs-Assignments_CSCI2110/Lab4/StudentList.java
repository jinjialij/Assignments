public class StudentList {
    private List <Student> students;
    //constructor
    public StudentList()
    {
        students = new List<Student>();
    }

    //Add a student record to the list
    public void addRecord(Student s)
    {
        students.add(s);
    }

    //Delete a student record with the specified ID number:
    public void deleteRecord(int ID)
    {
        int s=0;
        Student stu=students.first();
        while(stu!=null)
        {
            if(stu.getStudentID() == ID)
            {
                students.remove(stu);
                System.out.println(ID + " deleted.");
            }
            stu=students.next();
        }
        if (students.size()==s)
        {
            System.out.println(ID + " not found.");
        }
    }

    //Display records of all the students taking a specifiied major
    public void displayRecordsByMajor(String m)
    {
        Student stu=students.first();
        while(stu!=null)
        {
            if (stu.getMajor().equalsIgnoreCase(m))
            {
                System.out.println(stu);
            }
            stu=students.next();
        }
    }

    //Display records of all students belonging to a particular faculty
    public void displayRecordsByFaculty(String f)
    {
        Student stu=students.first();
        while(stu!=null)
        {
            if (stu.getFaculty().equalsIgnoreCase(f))
            {
                System.out.println(stu);
            }
            stu=students.next();
        }
    }

    //Display records of all students with the specified last name:
    public void displayRecordsByLastName(String ln) {
        Student stu = students.first();
        while (stu != null)
        {
            if(stu.getLastName().equalsIgnoreCase(ln))
            {
                System.out.println(stu);
            }
            stu=students.next();
        }
    }

    //Search for a student’s record given an ID number:
    public Student searchID(int ID)
    {
        Student stu=students.first();
        while(stu!=null)
        {
            if(stu.getStudentID() == ID)
            {
                return stu;
            }
            stu=students.next();
        }
        return null;
    }

    //get size of the student list
    public int size(){return students.size();}


}
