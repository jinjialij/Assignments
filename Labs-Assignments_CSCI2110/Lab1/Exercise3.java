import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args)
    {
        //let user input 5 points' values
        double[][] points=new double[5][2];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter "+points.length+" points: ");
        for(int i=0;i<points.length;i++)
        {
            points[i][0] =input.nextDouble();
            points[i][1] =input.nextDouble();
        }

        Rectangle boundingRectangle = getRectangle(points);//create a bounding rectangle by calling getRectangle method
        double xCenter,yCenter;
        xCenter=(boundingRectangle.getX()*2+boundingRectangle.getWidth())/2;//calculate postion of center points
        yCenter=(boundingRectangle.getY()*2+boundingRectangle.getHeight())/2;
        System.out.println("The bounding rectangle's center: ("+xCenter+","+yCenter+"), width: "+boundingRectangle.getWidth()+", height: "+boundingRectangle.getHeight());
    }

    //getRectangle method which create a minimum rectangle that contains all five points
    public static Rectangle getRectangle(double[][] points)
    {
        double xMax,yMax,xMin,yMin;
        xMin=points[0][0];
        yMin=points[0][1];
        xMax=points[0][0];
        yMax=points[0][1];
        for(int i=1;i<points.length;i++)//search the array to find xMin,yMin,xMax,yMax
        {
            if(xMin>points[i][0])
            {
                xMin=points[i][0];
            }
            if(yMin>points[i][1])
            {
                yMin=points[i][1];
            }
            if(xMax<points[i][0])
            {
                xMax=points[i][0];
            }
            if(yMax<points[i][1])
            {
                yMax=points[i][1];
            }
        }
        double width=xMax-xMin;
        double height=yMax-yMin;
        //create a new rectangle
        Rectangle rectB = new Rectangle(xMin,yMin,width,height);//xMin is the xpos and yMin is the ypos
        return rectB;
    }

}
