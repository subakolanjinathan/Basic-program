public class Armstrong
{
public static void main(String args[])
{
int number=153;
int copynumber=number;
int sum=0;
while(number>0)
{
int a=number%10;
sum=sum+a*a*a;
number=number/10;
}
if(copynumber==sum)
{
System.out.println("Armstrong number");
}
}
}
