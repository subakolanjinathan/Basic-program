public class Interest 
{
double p=1000.0;
double n=2.0;
double r=7.5;
double simpleInterest()
{
double i=(p*n*r)/100.0;
System.out.println(i);
return(i);
}
double compoundInterest()
{
double i=p*((1+r/100)*(1+r/100));
System.out.println(i);
return(i);
}
public static void main(String args[])
{
Interest obj=new Interest();
obj.simpleInterest();
obj.compoundInterest();
}
}



