import java.lang.Math;
public class Armstrongno 
{
	public static void main(String[] args) 
{
		int number=153;
		int copynumber=number;
		int sum=0;
		int power=0;
int a=0;
//to find the no of digits
		while(number>0)
		{
			number=number/10;
			power=power+1;
		}
number=copynumber;

		while(number>0)
		{
			a=number%10;
			sum+=(Math.pow(a,power));
			number=number/10;
		}
if(copynumber==sum);
System.out.println(copynumber+"is armstrong number");

//else
//System.out.println(copynumber+"is not armstrong number");
}
}



