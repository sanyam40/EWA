/*P12_3. Write a producer-consumer program for Ryan and Monica where Monica (Producer) keeps on depositing the money up to a certain limit and Ryan (Consumer) keeps withdrawing the money up to a certain number of times.
When the balance gets insufficient, Ryan will wait for Monica to deposit more money and Monica will notify him again.
--Definition of Done:
-Create two thread objects either by extending the Thread class or implementing the Runnable interface
-You can ask the user to enter the initial amount and perform the desired operation inside the run()
-Show the desired result */

class ProducerConsumer implements Runnable {
	private BankAccount bankAccount;
	
	public ProducerConsumer() {
		bankAccount = new BankAccount(10000);
	}
	
	@Override
	public void run() {
		if(Thread.currentThread().getName() == "Ryan") {
			bankAccount.makeWithdrawl(15000);
		}else if(Thread.currentThread().getName() == "Monica") {
			bankAccount.makeDeposit(10000);
		}
	}
}
class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	synchronized void makeWithdrawl(int amount) {
		System.out.println("Available Balance: "+this.getBalance()+"$");
		System.out.println(Thread.currentThread().getName()+" is going to withdraw "+amount+"$");
		while(this.getBalance() < amount) {
			System.out.println("Insufficient balance!! waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance = this.getBalance() - amount;
		System.out.println(amount+"$ withdrawn successfully by "+Thread.currentThread().getName());
		System.out.println("Updated Balance amount after withdraw: "+this.getBalance()+"$");
	}
	
	synchronized void makeDeposit(int amount) {
		System.out.println(Thread.currentThread().getName()+" is going to deposit "+amount+"$");
		this.balance = this.getBalance() + amount;
		System.out.println("Updated Balance amount after deposit: "+this.getBalance()+"$");
		notify();
	}
}

public class canvas_p12_2{

	public static void main(String[] args) {
		ProducerConsumer p = new ProducerConsumer();
		Thread t1 = new Thread(p, "Ryan");
		Thread t2 = new Thread(p, "Monica");
		t1.start();
		t2.start();
	}
}