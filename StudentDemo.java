class Student
{
    int id;
    String name;
    double marks;
    Student(int id,String name, double marks)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    void displayStudentDetails()
    {
        System.out.println("Student ID is:"+id);
        System.out.println("Student Name is :"+name);
        System.out.println("Student Marks:"+marks);

    }
}
public class StudentDemo
{
    public static void main(String[] args) 
    {
        Student s= new Student(101,"Nandhini",100.00);
        s.displayStudentDetails();

        
    }
}