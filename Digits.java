public class Digits
{
public static void main(String args[])
{
int number=1492;
int copynumber=number;
int counter=0;
while(number>0)
{
number=number/10;
counter=counter+1;
}
System.out.println(counter);
}
}
