import java.util.Scanner;
public class DivisionExample 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        try
        {
            System.out.println("Enter the numerator :");
            int numerator=s.nextInt();
            System.out.println("Enter the denominator :");
            int denominator=s.nextInt();
            int result =numerator/denominator;
            System.out.println("Result is :"+result);
        }
        catch(ArithmeticException e )
        {
            System.out.println(e);
            System.out.println("Division by zero occurs");
        }
        finally
        {
            System.out.println("Program execution completed");
            s.close();
        }

        
    }
    
}
