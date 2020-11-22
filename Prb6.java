package Assignment2;
import java.util.Scanner;
class Prb6
{
   public static void main(String args []) 
   {
       int sum=0;
       float avg;
       Scanner fc = new Scanner (System.in);
       System.out.println("Enter a array Elements");
       int n = fc.nextInt();
        
       int a[]= new int[n];
       for (int i=0;i<a.length;i++)
       {
           a[i] = fc.nextInt();
           sum = sum+a[i];
           //avg = sum/n;
       }
        
         avg = (sum/n);
       System.out.println("sum and average of array elements ="+sum);
       System.out.println("average of array elements ="+avg);
   }
}