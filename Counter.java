public class Counter
{
public static void main(String args[])
{
int number=48;
int counter=0;
for(int i=1; i<number; i=i+1)
{
if(number%i==0)
{
counter=counter+1;
}
}
System.out.println(counter);
}
}
