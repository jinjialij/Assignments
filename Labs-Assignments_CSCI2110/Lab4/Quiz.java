import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class Quiz {
    public static void main(String [] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        CountryCapitalList countryCapitals=new CountryCapitalList();
        String cou,cap,ask,answer;
        CountryCapital cc=null;

        while (inputFile.hasNext())
        {
            cou = inputFile.nextLine();
            cap = inputFile.nextLine();
            cc=new CountryCapital(cou,cap);
            countryCapitals.add(cc);
        }

        inputFile.close();

        countryCapitals.display();//show all countries with their capitals

        Random rand = new Random();
        int n1,n2;
        double score,count=0,correctTimes=0;
        String input2,input3;
        System.out.println("\n");
        System.out.print("Welcome to the Country-Capital Quiz\nPlay?");
        input2=keyboard.nextLine();

        while(input2.equalsIgnoreCase("Yes"))//if yes, quiz game continues
        {
            count++;//count played times
            n1 = rand.nextInt(countryCapitals.getSize());//a random number to pick from the countrycapital list
            n2 = rand.nextInt(2);//a random to choose to ask country or capital
            if (n2%2==0)
            {
                ask=countryCapitals.getAt(n1).getCountry();//even number will take a country's name and store it in ask variable
                System.out.println("What is the capital of "+ask+" ?");//ask country's capital
                answer=countryCapitals.getAt(n1).getCapital();
            }
            else
            {
                ask=countryCapitals.getAt(n1).getCapital();//odd number will take a capital's name and store it in ask variable
                System.out.println("What country has "+ask+" as its capital ?");//ask what does the capital belong to
                answer=countryCapitals.getAt(n1).getCountry();
            }

            input3=keyboard.nextLine();
            System.out.println();
            if (input3.equalsIgnoreCase(answer))
            {
                System.out.println("Correct! Play?");
                correctTimes++;
                input2=keyboard.nextLine();
            }
            else
            {
                System.out.println("Incorrect.\nThe correct answer is "+answer+"\n Play?");
                input2=keyboard.nextLine();
            }
        }

        if(count!=0)
        {
            score=(correctTimes/count)*100;
        }
        else
            score=0;//if play 0 times
        System.out.print("\nGame over.\nGame Stats:\nQuestions played: "+count+";  Correct answers: "+correctTimes+";  Score: ");
        System.out.printf("%.2f",score);
        System.out.print(" %");
    }
}
