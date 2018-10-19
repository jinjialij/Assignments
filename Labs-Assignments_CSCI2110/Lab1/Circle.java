import java.lang.Math;
public class Circle {
    //instance variable
    private double xpos,ypos,radius;
    //getter methods
    public double getX(){return xpos;}

    public double getY(){return ypos;}

    public double getRadius(){return radius;}

    //setter methods
    public void setCenter(double xpos,double ypos)
    {
        this.xpos=xpos;
        this.ypos=ypos;
    }

    public void setRadius(double radius){this.radius=radius;}

    //constructor
    public Circle()
    {
        xpos=10.0;
        ypos=5.0;
        radius=6.0;
    }
    public Circle(double xpos,double ypos, double radius)
    {
        this.xpos=xpos;
        this.ypos=ypos;
        this.radius=radius;
    }

    //getArea method
    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    //getCircumference method
    public double getCircumference()
    {
        return 2*Math.PI*radius;
    }

    //contains method to check if a specified point is in this circle
    public boolean contains(double x,double y)
    {
        return radius>Math.sqrt(Math.pow(xpos-x,2)+Math.pow(ypos-y,2));
        //if the distance between the circle's center and the point is smaller than radius, then the circle contains the point
    }

    //touches method to check if the point touches the circle
    public boolean touches(double x, double y)
    {
        return radius==Math.sqrt(Math.pow(xpos-x,2)+Math.pow(ypos-y,2));
        //if the distance between the circle's center and the point is equal to the radius, then the point touches the circle
    }

    //contains method to check if the inputted circle is contained in this circle
    public boolean contains(Circle c1)
    {
        if(contains(c1.getX(),c1.getY()) && radius>c1.getRadius())
        {
            if(radius>Math.sqrt(Math.pow(xpos-c1.getX(),2)+Math.pow(ypos-c1.getY(),2))+c1.getRadius())
            {
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    //touches method to check if the inputted circle touches this circle
    public boolean touches(Circle c1)
    {
        if(contains(c1.getX(),c1.getY()))//if c1 is inside this circle, it touches when their distance equals to radius minus c1's raduis
        {
            return Math.abs(radius-c1.getRadius())==Math.sqrt(Math.pow(xpos-c1.getX(),2)+Math.pow(ypos-c1.getY(),2));
        }
        else//if c1 is outside this circle, it touches this circle when thier distance equals to their radius' addition
        {
            return (radius+c1.getRadius())==Math.sqrt(Math.pow(xpos-c1.getX(),2)+Math.pow(ypos-c1.getY(),2));
        }
    }

    //toString method
    public String toString()
    {
        return "Center: ("+xpos+","+ypos+"), Radius: "+radius;
    }

    //display method for information include getArea and getCircumference
    public String display()
    {
        return "Center: ("+xpos+","+ypos+"),\tRadius: "+radius+"\tArea: "+getArea()+"\tCircumference: "+getCircumference();
    }

    //test program
    public static void main(String[]args)
    {
     Circle c =new Circle();
     System.out.println("Circle c: "+c.display()+"\n");
     double x=11.5,y=6.5;//a point in the circle c but does not touch c
     System.out.println("Is point(11.5,6.5) contained in the circle: "+c+" ?\t"+c.contains(x,y));
     System.out.println("Does point(11.5,6.5) touches the circle: "+c+" ?\t"+c.touches(x,y)+"\n");
     double x1=16,y1=5; //a point touches c but not inside c
     System.out.println("Is point(16,5) contained in the circle: "+c+" ?\t"+c.contains(x1,y1));
     System.out.println("Does point(16,5) touches the circle: "+c+" ?\t"+c.touches(x1,y1)+"\n");
     //test for circles
     Circle c2 =new Circle(10,5,3);//c2 is inside c
     System.out.println("Is Circle c2("+c2+") contained in circle c("+c+") ?\t"+c.contains(c2));
     System.out.println("Does Circle c2("+c2+") touches circle c("+c+") ?\t"+c.touches(c2)+"\n");
     Circle c3 =new Circle(14.5,5,1.5);//c3 is inside c and touches c
     System.out.println("Is Circle c3("+c3+") contained in circle c("+c+") ?\t"+c.contains(c3));
     System.out.println("Does Circle c3("+c3+") touches circle c("+c+") ?\t"+c.touches(c3)+"\n");
     Circle c4 =new Circle(20,5,4);//c4 is outside c and touches c
     System.out.println("Is Circle c4("+c4+") contained in circle c("+c+") ?\t"+c.contains(c4));
     System.out.println("Does Circle c4("+c4+") touches circle c("+c+") ?\t"+c.touches(c4)+"\n");
     Circle c5 =new Circle(25,5,4);//c5 is outside c and does not touch c
     System.out.println("Is Circle c5("+c5+") contained in circle c("+c+") ?\t"+c.contains(c5));
     System.out.println("Does Circle c5("+c5+") touches circle c("+c+") ?\t"+c.touches(c5)+"\n");

    }

}
