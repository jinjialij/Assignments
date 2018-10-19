import java.util.Scanner;
import java.io.*;
public class StudentListDemo {
    public static void main(String[]args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = keyboard.next();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        StudentList octstudents = new StudentList();
        int id;
        String fN,lN,email,major,f;
        Student stu=null;

        while (inputFile.hasNext())
        {
            id = inputFile.nextInt();
            fN = inputFile.next();
            lN = inputFile.next();
            email = inputFile.next();
            major = inputFile.next();
            f = inputFile.next();
            stu = new Student(id, fN,lN,email,major,f);
            System.out.println(stu);
            octstudents.addRecord(stu);
        }
        System.out.println();
        inputFile.close();

        String input;
        System.out.println("What would you like to do? (add, delete, display, search, quit): ");
        input=keyboard.next();
        while(!input.equalsIgnoreCase("quit"))//if not input quit, the loop cotinues
        {
            if (input.equalsIgnoreCase("add"))//add a student record in the list
            {
                System.out.println("Enter the record: ");
                id=keyboard.nextInt();
                fN=keyboard.next();
                lN=keyboard.next();
                email=keyboard.next();
                major=keyboard.next();
                f=keyboard.next();
                stu=new Student(id,fN,lN,email,major,f);
                octstudents.addRecord(stu);
                System.out.println("Record added.");
            }
            else if (input.equalsIgnoreCase("delete"))//delete a student record from the list
            {
                System.out.println("Enter the ID number to be delete");
                id=keyboard.nextInt();
                octstudents.deleteRecord(id);
            }
            else if (input.equalsIgnoreCase("display"))//display a record
            {
                System.out.println("Display what (major, faculty, student(last name) ): ");
                String input2=keyboard.next();
                if (input2.equalsIgnoreCase("major"))//display by major
                {
                    System.out.println("Enter the major: ");
                    input2=keyboard.next();
                    octstudents.displayRecordsByMajor(input2);
                }
                else if( input2.equalsIgnoreCase("faculty"))//display by faculty
                {
                    System.out.println("Enter the faculty: ");
                    input2=keyboard.next();
                    octstudents.displayRecordsByFaculty(input2);
                }
                else if( input2.equalsIgnoreCase("student"))//display by last name
                {
                    System.out.println("Enter the last name: ");
                    input2=keyboard.next();
                    octstudents.displayRecordsByLastName(input2);
                }
                else
                    System.out.println("Error!");
            }
            else if (input.equalsIgnoreCase("search"))//search by ID
            {
                int input3=0;
                System.out.println("Enter the student ID number: ");
                input3=keyboard.nextInt();
                if (octstudents.searchID(input3)!=null)
                    System.out.println(octstudents.searchID(input3));
                else
                    System.out.println(input3 + " not found");
            }
            System.out.println("What would you like to do? (add, delete, display, search, quit): ");
            input=keyboard.next();
        }
        System.out.println("Program ended.");
    }
}
