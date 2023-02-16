public class Perfect
{
public static void main(String args[])
{
int number=28;
int sum=0;
for(int i=1;i<number;i=i+1)
{
if(number%i==0)
{
sum=sum+i;
}
}
if(sum==number)
{
System.out.println("perfectno"+number);
}
else
{
System.out.println("not perfectno"+number);
}
}
}

