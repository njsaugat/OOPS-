package week3;

public class Triangle {
    public double firstSide;
    public double secondSide;
    public double thirdSide;

    public double perimeter(){
        return this.firstSide+this.secondSide+this.thirdSide;
    }
    public double findArea(){
        // double perimeter=perimeter();
        double s=perimeter()/2;
        double interMediate=s*(s-this.firstSide)*(s-this.secondSide)*(s-this.thirdSide);
        return Math.sqrt(interMediate);
    }


    public static void main(String[] args){
        Triangle t1=new Triangle();
        t1.firstSide=3;
        t1.secondSide=4;
        t1.thirdSide=5;
        System.out.println(t1.findArea());

    }

}
