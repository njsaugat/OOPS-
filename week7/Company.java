package week7;
public class Company {

    class Salesman{
        String name;
        String salesmanCode;
        double salesAmount;
        public double commissionFinder(){
            if(this.salesAmount<2000){
                return 0.08*this.salesAmount;
            }else if(this.salesAmount<=5000){
                return 0.1*this.salesAmount;
            }
            return 0.12*this.salesAmount;
        }
    }

    public static void main(String[] args){
        // Salesman s1=new Salesman();
        Company c1= new Company();//outerclass in main
        Company.Salesman sm1= c1.new Salesman();
        sm1.name="hari";
        sm1.salesAmount=32450;
        System.out.println(sm1.commissionFinder());
        
    }


}
