public class Doperfect
{
public static void main(String args[])
{
for(int number=1; number<=1000; number=number+1)
{
int sum=0;
for(int i=1; i<number; i=i+1)
{
if(number%i==0)
{
sum=sum+i;
}
}
if(sum==number)
{
System.out.println("perfectno  "+number);
}
else
{
System.out.println("notperfect "+number);
}
}
}
}
