public class Clock
{
public static void main(String args[])
{
double hour=2.0;
double mintus=20.0;
double teta=0.5*(60*hour-11*mintus);
if(teta<0)
{
teta=-1*teta;
}
if(teta>180)
{
teta=360-teta;
}
System.out.println(teta);
}
}
