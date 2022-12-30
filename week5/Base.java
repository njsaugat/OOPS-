package week5;

class Base {
    // overloading:
    public void add(int num1, int num2 ){
        System.out.println(num1+num2);
    }
    public void add(int num1, int num2, int num3 ){
        System.out.println(num1+num2+num3);
    }
    public void add(double num1, double num2 ){
        System.out.println(num1+num2);
    }
    
}

class Derived extends Base{
    @Override
    public void add(int num1,int num2){
        System.out.println(num1-num2);
    }
}

