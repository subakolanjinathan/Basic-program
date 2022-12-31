public class Area 
{
double areaofsquare(double a)
{
double area=a*a;
System.out.println(area);
return area;
}
double areaofrectangle(double l,double b)
{
double area=l*b;
System.out.println(area);
return area;
}
public static void main(String args[])
{
Area obj=new Area();
obj.areaofsquare(4.0);
obj.areaofrectangle(5.0,7.0);
}
}
