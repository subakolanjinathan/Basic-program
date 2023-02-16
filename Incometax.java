public class Incometax
{
double salary=1200000.0;
double newTax=0;
double oldtax=0;
void incomtax()
{
switch(1)
{
case 1:
if(salary>250000 && salary<=500000)
{
newTax=(salary-250000)*5/100;
oldTax=(salary-250000)*5/100;
}
case 2:
if(salary>500000 && salary<=750000)
{
newTax=(salary-500000)*10/100+12500;
oldTax=(salary-500000)*20/100+12500;
}
case 3:
if(salary>750000 && salary<=1000000)
{
newTax=(salary-750000)*15/100+37500;
oldTax=(salary-750000)*20/100+62500;
}
default:
if(salary>1000000 && salary<=1200000)
{
newTax=(salary-1000000)*20/100+74500;
oldTax=(salary-200000)*30/100+112500;
}
System.out.println("if salary is"+salary+"rs per annum");
System.out.println("old tax is"+oldtax+"rs");
System.out.println("new tax is"+newtax+"rs");
System.out.println("differents between old tax and new tax is"+(oldtax-newtax)+"rs");
}
}
}
