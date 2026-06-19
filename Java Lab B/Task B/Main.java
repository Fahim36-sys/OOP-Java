public class Main 
{
	public static void main(String[] args)
{	
	Account a1 = new Account();
	
	a1.setAccountNumber(26640801);
	a1.setAccountHolderName("Fahim Hasnat");
	a1.setBalance(420);
	
	System.out.println("Account Number: "+a1.getAccountNumber());
    System.out.println("Account Holder Name: "+a1.getAccountHolderName());
	System.out.println("Balance: "+a1.getBalance());
}
}