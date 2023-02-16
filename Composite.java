public class Composite
{
public static void main(String args[])
{
int number=48;
int count=0;
for(int i=2; i<=number; i=i+1)
{
if(number%i==0)
{
count=count+1;
}
}
System.out.println(count);
if(count>2)
{
System.out.println("Composite number");
}
else
{
System.out.println("Not composite number");
}
}
}
