public class Neon
{
public static void main(String args[])
{
int number=9;
int copynumber=number;
int sum=0;
int a=(number*number);
while(a>0)
{
int b=a%10;
sum=sum+b;
a=a/10;
}
if(copynumber==sum)
{
System.out.println("Neon number");
}
else
{
System.out.println("Not neon number");
}
}
}
