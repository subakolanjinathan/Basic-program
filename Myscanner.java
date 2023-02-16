import java.util.Scanner;
public class Myscanner
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a");
int a=sc.nextInt();
System.out.println("Enter value of b");
int b=sc.nextInt();
int c=a+b;
System.out.println("sum of a and b"+c);
sc.close();
}
}

import java.util.Scanner;
public class Myscanner
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a");
String a=sc.nextInt();
System.out.println("Enter value of b");
String b=sc.nextInt();
String c=a+b;
System.out.println("sum of a and b"+c);
sc.close();
}
}
