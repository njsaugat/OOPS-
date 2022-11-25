package week3;



public class ComplexOperation {
    public static  ComplexNum getSum(ComplexNum c1, ComplexNum c2){
        ComplexNum sumComplex=new ComplexNum(0, 0);
        sumComplex.real=c1.real+c2.real;
        sumComplex.imaginary=c1.imaginary+c2.imaginary;
        return sumComplex;
    }
    public static ComplexNum getDifference(ComplexNum c1, ComplexNum c2){
        ComplexNum diffComplex=new ComplexNum(0, 0);
        diffComplex.real=c1.real-c2.real;
        diffComplex.imaginary=c1.imaginary-c2.imaginary;
        return diffComplex;
    }
    public static ComplexNum getProduct(ComplexNum c1, ComplexNum c2){
        ComplexNum product=new ComplexNum(0, 0);
        product.real=c1.real*c2.real+c1.imaginary*c2.imaginary*(-1);
        product.imaginary=c1.real*c2.imaginary+c1.imaginary*c2.real;
        return product;
    }

    public static void main(String[] args){
        ComplexNum c1=new ComplexNum(1, 2);
        ComplexNum c2=new ComplexNum(3, 4);
        ComplexNum sum=getSum(c2, c1);
        System.out.println("the sum of the complex numbers is "+ sum.real+" + "+sum.imaginary+"i");
        ComplexNum diff=getDifference(c2, c1);
        System.out.println("the difference of the complex numbers is "+ diff.real+" + "+diff.imaginary+"i");
        ComplexNum prouduct=getProduct(c2, c1);
        System.out.println("the product of the complex numbers is "+ prouduct.real+" + "+prouduct.imaginary+"i");


    }
}


class ComplexNum {
    public int real;
    public int imaginary;
    ComplexNum(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

}

