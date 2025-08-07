class Rectangle
{
    double length,breadth;
    Rectangle()
    {
        length=1.1;
        breadth=1.1;

    }
    Rectangle (double length,double breadth )
    {
        this.length=length;
        this.breadth=breadth;
    }
    void displayArea()
    {
        double area=length*breadth;
        System.out.println("Area of rectangle is :"+area);
    }


}


public class ConstructorOverloading 
{
    public static void main(String[] args) 
    {
        Rectangle r1=new Rectangle();
        r1.displayArea();
        Rectangle r2 =new Rectangle(1.3,1.5);
        r2.displayArea();
        
    }
     
}

   

    

