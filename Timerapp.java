import java.util.Scanner;
public class Timerapp
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("Enter 1 to start the timer");
int b=a.nextInt();
long startTime=System.currentTimeMillis();
System.out.println("Enter 2 to start the timer");
int c=a.nextInt();
long endTime=System.currentTimeMillis();
System.out.println(endTime-startTime+"ms");
}
}
