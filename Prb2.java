package Assignment2;
import java.util.Scanner;
class Prb2
{
    public static void main (String args[])
    {
        int sum=0;
        int r=0;
        Scanner fc = new Scanner (System.in);
        System.out.println("Enter a number =");
        int n = fc.nextInt();
        
        while (n>0)
        {
            r=(n%10);
            sum=(sum*10+r);
            n=n/10;
        }
        System.out.println("reverse number ="+sum);
    }
}