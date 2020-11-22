package Assignment2;
import java.util.Scanner;
class Prb5
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a First Number");
        int n = sc.nextInt();
        System.out.println("Enter a Last Number");
        int k=0,m= sc.nextInt();
        
        for(int i=n;i<=m;i++)
        {
            for (int j=2;j<i-1;j++)
            {
                if(i%j==0)
               
                {
                    k=k+1;
                }
                    
                
            }
        
            if(k==0)
            {
                System.out.println("Prime numbers between two numbers"+i);
            }
            else
            {
               k=0; 
            }
        }
    }
}