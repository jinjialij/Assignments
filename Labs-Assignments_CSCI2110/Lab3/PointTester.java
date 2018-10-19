import java.util.Scanner;
public class PointTester {
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.print("Please choose which type of Point you want to create: 1 for Integer type point; 2 for Double type Point,; 3 for String type point:");
        int input=kb.nextInt();
        if(input==1){//tyoe int
            int x,y;
            System.out.print("Please input value for Point xPos and Y pos:");
            x=kb.nextInt();
            y=kb.nextInt();
            Point <Integer> p1=new Point<Integer>(x,y);
            System.out.println("The output is:"+p1);
        }
        else if(input==2){//type double
            double x,y;
            System.out.print("Please input value for Point xPos and Y pos:");
            x=kb.nextDouble();
            y=kb.nextDouble();
            Point <Double> p2=new Point<Double>(x,y);
            System.out.println("The output is:"+p2);
        }
        else if(input==3){//tyoe String
            String x,y;
            System.out.print("Please input value for Point xPos and Y pos:");
            x=kb.next();
            y=kb.next();
            Point <String> p3=new Point <String>(x,y);
            System.out.println("The output is:"+p3);
        }
        else
            System.out.println("Invaild input!");
    }
}
