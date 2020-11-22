package Assignment2;
import java.util.Scanner;
class Prb8
{
    public static void main(String args[])
    {
       
        Scanner fc = new Scanner(System.in) ;
        System.out.println("Enter a array elements =");
        int n = fc.nextInt();
        
        int a[]= new int[n];
        
        for (int i=0;i<a.length;i++)
        {
            a[i] = fc.nextInt();
        }
        
          System.out.println("Reversing a array element");
          
           for (int i=n-1;i>=0;i--)
           {
               System.out.println(a[i]+" ");
           }
    }
}