package netaji.it.com;

import java.util.Scanner;

public class Atm {
	private double balance;
	Scanner sc=new Scanner(System.in);
	
	
	public void setBalance(double balance) {
		if(balance<=0) {
			System.out.println("NO SUFFICIENT BALANCE");
		}
		else {
			
		this.balance=balance;
		System.out.println("AVAILABLE BALANCE::"+balance);
		}
	}
	double getBalance() {
		return balance;
	}
	public void setDiposit(double amount) {
		System.out.println("ENTER DIPOSIT AMOUNT::");
		amount=sc.nextDouble();
		this.balance=balance+amount;
		System.out.println("BALANCE SUCCESSFULLY DIPOSITED::");
	}
	double getDiposit() {
		return balance;
	}
	public void setWithdraw(double amount) {
		
			System.out.println("ENTER WITHDRAWL AMOUNT::");
			amount=sc.nextDouble();
			if(balance>amount) {
				this.balance=balance-amount;
		
			System.out.println("PLEASE COLLECT YOUR MONEY::");
		}
		
		else {
			System.out.println("INSUFFICIENT BALANCE");
			
			
		}
	}
	double getWithdraw() {
		return balance;
	}
}
class AllAtmDetails{
	public static void main(String[] args) {
		Atm atm=new Atm();
		atm.setBalance(100);
		System.out.println(atm.getBalance());
		atm.setDiposit(0);
		System.out.println("TOTAL BALANCE IS::"+atm.getDiposit());
		atm.setWithdraw(0);
		System.out.println("AVAILABLE BALANCE IS::"+atm.getWithdraw());
	}
}
