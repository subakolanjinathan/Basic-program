public class Doforprime
{
public static void main(String args[])
{
for(int number=1; number<=10; number=number+1)
{
boolean flag=false;
for(int i=2; i<=number/2; i=i+1)
{
if(number%i==0)
{
flag=true;
}
}
if(flag)
{
System.out.println("Notprime  "+number);
}
else
{
System.out.println("Prime no  "+number);
}
}
}
}
