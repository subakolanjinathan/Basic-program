public class Customer
{
String name;
long Aadhar;
long mobile;
public static void main(String args[])
{
Customer cust1=new Customer();
cust1.name="suba";
cust1.Aadhar=7587890;
Bank b=new Bank();
b.CreateAccount(cust1);
}
}
