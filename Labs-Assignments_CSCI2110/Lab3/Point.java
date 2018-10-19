public class Point<T> {
    private T xPos;//x coordinator
    private T yPos;//y coordinator
    //constructor
    public Point (T x, T y){
        xPos=x;
        yPos=y;
    }

    //getter methods
    public T getX(){return xPos;}
    public T getY(){return yPos;}

    //setter methods
    public void setX(T x1){xPos=x1;}
    public void setY(T y1){yPos=y1;}

    //toString method
    public String toString(){
        return "XPOS: "+xPos+"\tYPOS: "+yPos;
    }
}
