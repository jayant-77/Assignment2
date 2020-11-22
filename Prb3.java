package Assignment2;
import java.util.Scanner;
class Prb3
{
    public static void main(String args[])
    {
        //int i=2;
      Scanner fc = new Scanner (System.in);
      System.out.println("Enter a first Number =");
      int k=0,n = fc.nextInt();
      
      //int k=0;
    for (int i=2;i<n;i++)
       {
             if (n%i==0)
                     {
                        k=k+1;
                     }
        }
                     if (k==0)
                    {
                       System.out.println("Number is prime ="+n);
                    }
                     else
                    {
                        System.out.println("Number is not prime ="+n);
                     }
      
}
}
