public class Rectangle {
    private double xpos,ypos,width,height;//instance variables
    public Rectangle(double xpos,double ypos,double width,double height)
    {
        this.xpos=xpos;
        this.ypos=ypos;
        this.width=width;
        this.height=height;
    }
    public Rectangle()//constructor creates a specified rectangle
    {
        xpos=10.0;
        ypos=5.0;
        width=3.0;
        height=2.0;
    }
    //setter and getter
    public void setX(double xpos){this.xpos=xpos;}
    public void setY(double ypos){this.ypos=ypos;}
    public void setWidth(double width){this.width=width;}
    public void setHeight(double height){this.height=height;}
    public double getX(){return xpos;}
    public double getY(){return ypos;}
    public double getWidth(){return width;}
    public double getHeight(){return height;}

    //contains method to check if a point is in the rectangle
    public boolean contains(double px,double py)
    {
        return (px>xpos && px<(xpos+width) && py>ypos && py<(ypos+height));
    }
    //touches method to check if a point touches the rectangle
    public boolean touches(double px,double py)
    {
        if(px==xpos||px==xpos+width)
        {
           return (py>=ypos &&py<=ypos+height);
        }
        else if (py==ypos||py==ypos+height)
        {
            return (px>=xpos && px<=xpos+width);
        }
        else return false;
    }

    //contains method to check if the inputted rectangle is inside this rectangle
    public boolean contains(Rectangle r1)
    {
        if(contains(r1.getX(),r1.getY()))
        {//check if the bottomright point is contained in ths rectangle
            double x=r1.getX()+r1.getWidth(),y=r1.getY()+r1.getHeight();
            if (contains(x,y))
                return true;
            else
                return false;
        }
        else return false;
    }

    //touches method to check if the inputted rectangle touches this rectagle
    public boolean touches(Rectangle r1)
    {
        return (touches(r1.getX(),r1.getY()) || touches(r1.getX(),r1.getY()+r1.getHeight()) || touches(r1.getX()+r1.getWidth(),r1.getY())|| touches(r1.getX()+r1.getWidth(),r1.getY()+r1.getHeight()));
        //check if any of the four angle's point touches this rectangle
    }

    //toString method to print rectangle
    public String toString()
    {
        return "Rectangle: [xpos= " +xpos+","+"ypos= "+ypos+"], width: "+width+",height: "+height;
    }

    //test program
    public static void main (String[]args)
    {
        Rectangle rect=new Rectangle();
        Rectangle rect1 = new Rectangle(11.0,6.0,0.5,0.5);
        Rectangle rect2 = new Rectangle(11.0,6.0,1.0,1.0);
        Rectangle rect3 = new Rectangle(13.0,7.0,3.0,6.0);
        Rectangle rect4 = new Rectangle(13,5.5,5,1.5);
        Rectangle rect5 = new Rectangle(12.5,6.5,5,6);

        //check points to see if it is contained or it touches rectangle rect
        System.out.println("IS point(11,6) contained in " +rect+" ?\t" + rect.contains(11,6));
        System.out.println("Does point(11,6) touch " +rect+" ?\t" + rect.touches(11,6)+"\n");

        System.out.println("IS point(13,6) contained in " +rect+" ?\t" + rect.contains(13,6));
        System.out.println("Does point(13,6) touch "+rect+" ?\t"+rect.touches(13,6)+"\n");

        //check rectangles to see if they are contained or they touch rectangle rect
        System.out.println("Is Rectangle "+rect1+" contained in "+ rect+ " ?\t"+ rect.contains(rect1));
        System.out.println("Does Rectangle "+rect1+" touches "+ rect+ " ?\t"+ rect.touches(rect1)+"\n");

        System.out.println("Is Rectangle "+rect2+" contained in "+ rect+ " ?\t"+ rect.contains(rect2));
        System.out.println("Does Rectangle "+rect2+" touches "+ rect+ " ?\t"+ rect.touches(rect2)+"\n");

        System.out.println("Is Rectangle "+rect3+" contained in "+ rect+ " ?\t"+ rect.contains(rect3));
        System.out.println("Does Rectangle "+rect3+" touches "+ rect+ " ?\t"+ rect.touches(rect3)+"\n");

        System.out.println("Is Rectangle "+rect4+" contained in "+ rect+ " ?\t"+ rect.contains(rect4));
        System.out.println("Does Rectangle "+rect4+" touches "+ rect+ " ?\t"+ rect.touches(rect4)+"\n");

        System.out.println("Is Rectangle "+rect5+" contained in "+ rect+ " ?\t"+ rect.contains(rect5));
        System.out.println("Does Rectangle "+rect5+" touches "+ rect+ " ?\t"+ rect.touches(rect5)+"\n");
    }

}
