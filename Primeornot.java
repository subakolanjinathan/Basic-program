public class Primeornot
{
public static void main(String args[])
{
int number=53;
boolean flag=false;
for(int i=2;i<=number/2;i=i+1)
{
if(number%i==0)
{
flag=true;
break;
}
}
if(flag)
{
System.out.println("Not prime number is"+number);
}
else
{
System.out.println("prime number is"+number);
}
}
}

