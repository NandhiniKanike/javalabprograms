import java.util.Scanner;
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }

}
public class ThrownExample
{
    static void validateAge (int age ) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age must be atleast 18");
        }
        else
        {
            System.out.println("Valid age");
        }
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        try
        {
         
            System.out.println("Enter user age :");
            int age = s.nextInt();
            validateAge(age);

        }
        catch(InvalidAgeException e )
        {
            System.out.println("InvalidAgeException :"+e.getMessage());
        }
        s.close();
        

        
        
    }
    
}
