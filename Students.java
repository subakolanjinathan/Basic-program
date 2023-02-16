public class Students
{
int rollno;
String name;
double mark;
void printGrade()
{
if(mark>90 && mark<=100)
{
System.out.println("Grade A");
}
if(mark>=75 && mark<=89)
{
System.out.println("Grade B");
}
if(mark>=55 && mark<=74)
{
System.out.println("Grade C");
}
if(mark>=54 && mark<=35)
{
System.out.println("Grade D");
}
}
Students(int a,String b,double c)
{
rollno=a;
name=b;
mark=c;
}
public static void main(String args[])
{
Students s1=new Students(1,"suba",60.0);
Students s2=new Students(2,"indhu",85.0);
Students s3=new Students(3,"muthu",98.0);
s1.printGrade();
s2.printGrade();
s3.printGrade();
}
}
