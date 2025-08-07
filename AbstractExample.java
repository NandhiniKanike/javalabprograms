abstract class Shape
{

    abstract void calculateArea();
}
class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    void calculateArea()
    {
        double area=3.14*radius*radius;
        System.out.println("Area of  a circle:"+area);

    }
}
class Square extends Shape
{
    int side;
    Square(int side)
    {
        this .side=side;
    }
    void calculateArea()
    {
        int area = side*side;
        System.out.println("Area of  a square:"+area);


    }
}
public class AbstractExample 
{
    public static void main(String[] args) 
    {
        Circle c=new Circle(5.2);
        c.calculateArea();
        Square s=new Square(5);
        s.calculateArea();
    }
    

        
        
    
    
}
