public class Flag
{
public static void main(String args[])
{
int number=7;
boolean flag=false;
for(int i=2; i<number; i=i+1)
{
if(number%i==0)
{
flag=true;
}
}
if(flag)
{
System.out.println(" Not Prime number");
}
else
{
System.out.println("prime number");
}
}
}
