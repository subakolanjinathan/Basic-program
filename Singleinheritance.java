public class Singleinheritance
{
public static void main(String args[])
{
STR str=new STR();
str.act();
str.dance();
}
}
class TR
{
void act()
{
System.out.println("good acting skill");
}
}
class STR extends TR
{
void dance()
{
System.out.println("good dance skill");
}
}

