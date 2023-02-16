public class Overriding 
{
public static void main(String args[])
{
B obj=new B();
obj.banana();
} 
}
class A
{
void banana()
{
System.out.println("Good for health");
}
}
class B extends A
{
void banana()
{
System.out.println("Energy");
}
}
