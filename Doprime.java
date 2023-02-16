public class Doprime
{
public static void main(String args[])
{
for(int i=1; i<=10; i=i+1)
{
boolean flag=false;
for(int j=2; j<=i/2; j=j+1)
{
if(i%j==0)
{
flag=true;
}
}
if(flag)
{
System.out.println("Not prime number"+i);
}
else
{
System.out.println("prime number"+i);
}
}
}
}
