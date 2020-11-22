package Assignment2;

import java.util.Scanner;

class Prb9
{
     public static void main(String args[])
    {
       int i=0,j,flag=0;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a no of array elements =");
        int n = sc.nextInt();
       // System.out.println("Search an array elements =");
       // int j = sc.nextInt();
        
        int a[]= new int[n];
        System.out.println("Enter a array elements =");
        for ( i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        
      System.out.println("Search an array elements =");
         j = sc.nextInt();
        for( i=0;i<n;i++)
        {
            //System.out.println(a[i]);
          if ( a[i] == j)
           {
               flag = 1;
               break;
           }
            else
           {
                flag = 0;
           }
        }
        if (flag == 1)
        {
            System.out.println("position of array element="+(i+1));
        }
        else
        {
            System.out.println("position of array element not found");
        }
      
}
}