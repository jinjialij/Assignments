import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
public class Exercise3{
    public static void main(String[] args)throws IOException{
        //create a stack holds studentsRecord objects
        GenericStack <StudentRecord> stack1 =new GenericStack<StudentRecord>();
        StudentRecord stuR =new StudentRecord();
        //create a stack holds string objects
        GenericStack <String> stack2=new GenericStack<String>();
        //TODO: Create stack1 to hold StudentRecord objects
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        StringTokenizer token;
        while (inputFile.hasNext()){
            String line = inputFile.nextLine();
            token = new StringTokenizer(line, " ");
            String firstName = token.nextToken();
            String lastName = token.nextToken();
            String IDString = token.nextToken();
            Integer IDNum = Integer.valueOf(IDString);

        //the above statement converts the String IDString
        //into the Integer object IDNum
            stack1.push(new StudentRecord(firstName,lastName,IDNum));//put things into stuR fn,ln and ID number, push it into stack1
        }
        inputFile.close();

        while(!stack1.isEmpty()){
            stuR=stack1.pop();//pop stack1 one by one and let stuR hold that value
            stack2.push(stuR.getLastName());//only push lastName to stack2
        }
        //pop stack2 and display all items
        while(!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }
}