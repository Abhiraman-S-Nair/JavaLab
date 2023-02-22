package test;


import java.util.Scanner;
public class synchro
{
    public static void main(String args[]) throws InterruptedException
    {
        
        Fibonacci fb = new Fibonacci();
        OddSeries os = new OddSeries();

        os.start();
        os.join();
        fb.start();

    }
}

class Display
{
    synchronized void display(int x)
    {
        System.out.println(x);
    
    try {Thread.sleep(200);}
    catch(Exception e) {}
    }
}

class Fibonacci extends Thread
{
    Display d= new Display();
    Scanner sc = new Scanner(System.in);
    public void run()
    {
        System.out.println("Enter the fub num");
        int n = sc.nextInt();
        int a =1,b=0,sum=0;
        for(int i=0;i<n;i++)
        {
            sum = a+b;
            b=a;
            a=sum;
            d.display(a);
        }
    }

}

class OddSeries extends Thread
{
    Display d = new Display();
    Scanner sc = new Scanner(System.in);
    public void run()
    {
        System.out.println("Enter number for OddSeries");
        int od = sc.nextInt();
        int j=0;
        while(j !=od ) 
        {
            if(j%2 !=0)
            {
                d.display(j);
            }
            j++;
        }

    }
}
