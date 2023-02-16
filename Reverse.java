public class Reverse
{
public static void main(String args[])
{
int number=987654321;
int reverse=0;
while(number!=0)
{
int a=number%10;
reverse=reverse*10+a;
number=number/10;
}
System.out.println("Reverse of the given number"+reverse);
}
}
