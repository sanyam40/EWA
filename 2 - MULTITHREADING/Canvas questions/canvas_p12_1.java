// SANYAM 21CSU234 FS-III-A

/* P12. Write a program to depict “two people one bank account” problem and How Ryan and Monica end up with inconsistent amount leading to concurrency issues and how you can solve this issue using the synchronized block/keyword.
--Definition of Done:
-Create two thread objects namely Ryan and Monica either by extending Thread class or implementing Runnable interface
-You can ask the user to enter the initial amount and perform the desired operation inside run()
-Show the desired result. */

class BankAccount {
	private int balance;
	
	public BankAccount() {
		this.balance = 100;		// initial balance
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amount) {
		this.balance = amount;
	} 
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
class RyanandMonica extends Thread{
    private BankAccount bankAccount;

    public RyanandMonica(BankAccount account){
        this.bankAccount=account;
    }

    public void run(){
        for(int i=0;i<2;i++){
            try {
                synchronized(bankAccount){
                    makewithdrawl(50);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" is going for shopping!");
			if (this.bankAccount.getBalance() < 0) {
				System.out.println("overdrawn");
		}		
    }

    public void makewithdrawl(int amount){
        System.out.println(Thread.currentThread().getName()+" is going to withdraw "+amount);
		if(this.bankAccount.getBalance() >= amount) {
			
			System.out.println(Thread.currentThread().getName()+" is going to sleep!!!");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
			
			System.out.println(Thread.currentThread().getName()+" woke up...");
			bankAccount.withdraw(amount);
			
			System.out.println(Thread.currentThread().getName()+" has withdrawn "+amount+" dollars");
			//System.out.println("Updated balance is: "+bankAccount.getBalance());
			
		} else {
			System.out.println("Insufficient Balance!");
		}

    }
}
public class canvas_p12_1{
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        RyanandMonica sanyam=new RyanandMonica(account);
        RyanandMonica sahil=new RyanandMonica(account);

        sanyam.start();
        sahil.start();


    }
}