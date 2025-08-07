class Display
{
    void show(int value)
    {
        System.out.println("Integer Value: "+value);

    }
    void show(String message)
    {
        System.out.println("String Message:"+message);

    }

}






public class MethodOverloading 
{
    public static void main(String[] args) 
    {
        Display d=new Display();
        d.show(101);
        d.show("Nandhini");
        
    }
    
}
