class Employee
{
    String name;
    double salary;
    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;

    }
    void displayDetails()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary :"+salary);
    }
}
class Manager extends Employee
{
    String department;
    Manager (String name,double salary ,String department)
    {
        super(name,salary);
        this.department=department;
    }
    void displayDetails()
    {
        
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary :"+salary);
        System.out.println("Department name :"+department);

    }
}
public class SingleInheritance 
{
    public static void main(String[] args) 
    {

        Manager m = new Manager("Nandhini",75000 ,"IT" );
        m.displayDetails();
        Employee e=new Employee("Nandhini",75000 );
        e.displayDetails();
        
    }
    
}
