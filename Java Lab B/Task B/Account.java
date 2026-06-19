class Account
{
private	int accountNumber; 
private String accountHolderName; 
private double balance;
    
public	 void setAccountNumber(int an)
        {
		   accountNumber = an;
	    }	

public   void setAccountHolderName(String ahn) 
        {
		   accountHolderName = ahn;
	    }
   
public   void setBalance(double b)
        { if(b>=0)
		    {
               balance = b;
		    }
		  else
		  {
			System.out.println("Fokinni"); 
			balance = 0;
		  }
           
		   
	    }

public    int getAccountNumber() 
	    {
			return accountNumber;
		}
    
public	String getAccountHolderName() 
	   { 
	        return accountHolderName;
	   }
    
public	double getBalance() 
	   {
		   return balance;
	   }  
    
public	void showDetails() 
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
	}

}