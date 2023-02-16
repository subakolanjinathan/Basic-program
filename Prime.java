 public class Prime
{
public static void main(String args[]) 
{
 boolean flag=false;
 int number=13;
 for(int i=2;i<number;i=i+1)
{
 if(number%i==0)
{
 flag=true;
}
} 
 if(flag)
{
System.out.println("Not prime number"+number);
}
 else
{
 System.out.println(" prime number"+number);
}
}
}











 




































