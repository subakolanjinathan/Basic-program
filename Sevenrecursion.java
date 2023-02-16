public class Sevenrecursion
{
public static void sk(int i)
{
if(i<=100)
{
if(i%7==0)
{
System.out.println(i);
}
sk(i+1);
}
}
public static void main(String args[])
{
sk(1);
}
}
