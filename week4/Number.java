package week4;

public class Number {
    private double number;
    Number(double number){
        this.number=number;
    }
    public boolean isZero(){
        if(this.number==0){
            return true;
        }return false;
    }
    public boolean isPositive(){
        if(this.number>0){
            return true;
        }return false;
    }
    public boolean isOdd(){
        if(this.number%2==1){
            return true;
        }
        return false;
    }
    public boolean isEven(){
        if(this.number==0){
            return true;
        }return false;
    }
    public boolean isPrime(){
        for(int i=2;i<this.number;i++){
            if(this.number%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean isArmstrong(){
        double copyNumber=this.number;
        double sum=0;
        while(copyNumber!=0){
            double remainder=copyNumber%10;
            sum=sum+Math.pow(remainder, 3);
            copyNumber=(int)copyNumber/10;
            copyNumber=(double)copyNumber;
            System.out.println(sum);
        }
        if(sum==this.number){
            return true;
        }
        return false;
        
    }
    public double getFactorial(){
        double factorial=1;
        for(double i=1;i<=this.number;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public double getSqrt(){
        // double copyNumber=this.number;
        double leftNum=0;
        double rightNum=this.number;
        double sqrtNum=0;
        while(leftNum<=rightNum){
            sqrtNum=(int)(leftNum+(rightNum-leftNum)/2);
            System.out.println(sqrtNum);
            if(sqrtNum*sqrtNum==this.number){
                return sqrtNum;
            }else if(sqrtNum*sqrtNum>this.number){
                rightNum=sqrtNum-1;                
            }else{
                leftNum=sqrtNum+1;
            }
        }
        return -1;
    }
    public double getSqr(){
        return this.number*this.number;
    }
    public double sumDigits(){
        double copyNumber=this.number;
        double sum=0;
        while(copyNumber!=0){
            double remainder=copyNumber%10;
            sum+=remainder;
            copyNumber=(int)copyNumber/10;
            copyNumber=(double)copyNumber;

            // sum+=
        }
        return sum;
    }
    public double getReverse(){
        double copyNumber=this.number;
        double reverse=0;
        while(copyNumber!=0){
            double remainder=copyNumber%10;
            reverse=reverse*10+remainder;
            copyNumber=(int)copyNumber/10;
            copyNumber=(double)copyNumber;

        }
        return reverse;
    }

    public static void main(String[] args){
        Number number=new Number(9);
        
        System.out.println(number.getSqrt());
    }
}
