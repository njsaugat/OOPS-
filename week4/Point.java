package week4;

public class Point {
    int x,y;
    Point(){
        this.x=0;
        this.y=0;
    }
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args){
        Point p1=new Point();
        Point p2=new Point(1,2);
        p2.setX(5);
        p2.setY(6);
        p2.setXY(7,8);
    }
}
