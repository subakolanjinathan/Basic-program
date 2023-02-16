import java.util.Scanner;
public class ATM
{
public static void main(String args[])
{
int balance = 100000,withdraw,deposit;
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("Automated Teller Machine");
System.out.println("choose 1 or withdraw");
System.out.println("choose 2 for Doposit");
System.out.println("choose 3 for check balance");
System.out.println("choose 4 for EXIT");
System.out.println("choose the operation you want to perform");
int choice = sc.nextInt();
switch(choice)
{
case 1:
System.out.print("Enter money to be withdraw:");
withdraw = sc.nextInt();
if(balance>=withdraw)
{
balance=balance-withdraw;
System.out.println("please collect your money");
}
else
{
System.out.println("Insufficient Balance");
}
System.out.println("");
break;
case 2:
System.out.print("Enter money to be doposited");
deposit = sc.nextInt();
balance= balance+deposit;
System.out.println("your money has been successfully deposited ");
System.out.println("");
break;
case 3:
System.out.println("Balance:"+balance);
System.out.println("");
break;
case 4:
System.exit(0);
}
}
}
}
