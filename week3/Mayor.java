package week3;

public class Mayor {
    
    public static int mayorCount;
    
    public String name;
    private double salary;
    public int gadiCount;
    public int age;
    public int countChildren;
    public Mayor(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return this.salary;
    }
    // public static void 
    
    public static void main(String[ ] args){
        // Mayor Balen=new Mayor("Balen");
        // Mayor Suray=new Mayor("Balen");
        Mayor Balen =new Mayor("Baleb");
        // Balen.setName("Balen");
        // Balen.salary;
        Balen.setSalary(30000);
        System.out.println("The salary of Balen is " + Balen.getSalary());  
    }

}
