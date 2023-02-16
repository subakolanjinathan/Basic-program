public class Test1
{
static void recursion(int i)
{
if(i<=10)
{
System.out.println(i);
recursion(i+1);
}
}
public static void main(String args[])
{
Test1.recursion(1);
}
}
