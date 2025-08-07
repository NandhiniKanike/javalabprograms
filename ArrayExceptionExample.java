import java.util.Scanner;

public class ArrayExceptionExample 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        try
        {
            System.out.println("Enter the sixe of the array");
            int size=s.nextInt();
             int[] arr=new int[size];
             System.out.println("Enter"+size+"array elements");
             for(int i=0;i<size;i++)
             {
                
                System.out.print("Element " + i + ": ");
                arr[i]=s.nextInt();
             }
             System.out.println("Enter the index number to be accessed");
             int index=s.nextInt();
             System.out.println("Element at index"+index+":"+arr[index]);
        }
        catch  (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Invalid index! Please access index between 0 and (size - 1).");


        }
        finally 
        {
            s.close();
            System.out.println("Program terminated.");
        }
        
    }


    
}
