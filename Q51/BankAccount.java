//51.	Create a program that helps banks to maintain records. It should have 
//following facilities. o Anybody can create current or saving account with 
//following initial information: account number, name, balance, and branch.
//o display account detail for a particular accounts. o display total money 
//deposited in bank. o allow deposit and  withdrawal in an account  . 
//o for saving account opening balance and minimum balance must be 5000. 
//o for current account opening balance and minimum balance must be 1000. 
//o can not withdraw the amount from the account that makes balance less 
//than the minimum balance. 


package Q51;


import java.util.Scanner;
class BankAccount {
	static Scanner input = new Scanner(System.in);
	String name, actype,branch;
	int accNo, bal, amt;

	BankAccount(String name, int accNo, String actype, int bal,String branch) {
		this.name = name;
		this.accNo = accNo;
		this.actype = actype;
		if(bal>=5000)
		this.bal = bal;
		this.branch=branch;
	}
	
		
	int deposit() {
		System.out.print("Enter amount to deposit:");
		amt = input.nextInt();
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal + amt;
		return 0;
	}

	int withdraw() {
		//System.out.println("Your Balance=" + bal);
		System.out.print("Enter amount to withdraw:");
		amt = input.nextInt();
		if (1000 < amt) {
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal - amt;
		return 0;
	}

	void display() {
		System.out.println("Name:" + name);
		System.out.println("Account No:" + accNo);
		System.out.println("Balance:" + bal);
		System.out.println("Branch :" + branch);

	}

	void dbal() {
		System.out.println("Balance:" + bal);
	}

	public static void main(String args[]) {
		System.out.println("Enter your Name: ");
		String nn = input.nextLine();
		System.out.println("Enter Account Number: ");
		int num = input.nextInt();
		System.out.println("Enter Account Type: ");
		String type = input.next();
		System.out.println("Enter Initial Balance MIN 5000: ");
		int bal = input.nextInt();
		System.out.println("Enter Branch: ");
		String branch = input.next();

		BankAccount b1 = new BankAccount(nn, num, type, bal,branch);
		int menu;
		System.out.println("Menu");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Information");
		System.out.println("4. Exit");
		boolean quit = false;
		do {
			System.out.print("Please enter your choice: ");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				b1.deposit();
				break;

			case 2:
				b1.withdraw();
				break;

			case 3:
				b1.display();
				break;

			case 4:
				quit = true;
				break;
			}
		} while (!quit);
	}
}
