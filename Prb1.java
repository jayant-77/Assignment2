package Assignment2;
import java.util.Scanner;
class Prb1
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number =");
        int N = sc.nextInt();
        
        for (int i=1;i<=10;i++)
        {
            System.out.println( N + " x "  + i + " = " + N * i);
        }
    }
}