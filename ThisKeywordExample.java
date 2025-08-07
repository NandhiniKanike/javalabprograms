class Student
{
    int id;
    String sname;
    Student(int id,String sname)
    {
        this.id =id;
        this.sname=sname;
       
    }
    void displayDetails()
    {
        System.out.println("Student ID is :"+id);
        System.out.println("Student name is :"+sname);
    }
}
public class ThisKeywordExample 
{
    public static void main(String[] args) 
    {
        Student s=new Student(101,"Nandhini");
        s.displayDetails();
        
        
    }
    
}
