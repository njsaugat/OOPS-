package week3;

class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    Employee(String firstName,String lastName,double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            this.salary=0;
            return;
        }
        this.salary = salary;
    }
    public double yearlySalary(){
        return this.salary*12;
    }

    public void setBonus(){
        this.salary=this.salary*1.1;
    }
    

}

public class EmployeeTest{
    public static void main(String[] args){
        Employee e1=new Employee("Hari", "Shrestha", 40000);
        Employee e2=new Employee("Syam", "Karki", 30000);
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getSalary());
        System.out.println(e2.getFirstName());
        System.out.println(e2.getLastName());
        System.out.println(e2.getSalary());
        System.out.println("");
        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());
        System.out.println("");
        e1.setBonus();
        e2.setBonus();
        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());



    }
}
