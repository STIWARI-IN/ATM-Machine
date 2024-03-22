package project;

import java.util.Scanner;

class ATM{
	
	int Pin = 1234;
	int Balance = 50000;
	
	public void setupPin() {
		
		System.out.println("Enter Your 4 digit pin");
		Scanner sc = new Scanner(System.in);
		int enterPin = sc.nextInt();
		
		if(enterPin==Pin) {
			menu();
		}
		else {
			System.out.println("Incorrect Pin! 2 Attempts left");
		}	
	}
	
	public void menu() {
		
		System.out.println("Select Choices :");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw Balance");
		System.out.println("3. Deposite Money");
		System.out.println("4. Exit");
		
	    Scanner sc = new Scanner(System.in);
	    int opt = sc.nextInt();
	    
	    if(opt ==1) {
	    	
	    	CheckBalance();
	    }
	    else if(opt==2) {
	    	WithdrawBalance();
	    	
	    }
	    else if(opt==3) {
	    	DepositeMoney();
	    }
	    
	    else if(opt==4) {
	    	return;
	  
	    } 
	    
	    else {
	    	System.out.println("Enter a valid choice");
	    	
	    }  
	    
	}
	

	public void CheckBalance() {
		System.out.println("Balance : " + Balance);
		menu();
	}
	
	
	public void WithdrawBalance() {
		System.out.println("Enter Amount to Withdraw");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		} 
		else {
			
			Balance = Balance - amount;
			System.out.println("Money Withdraw Successful");
			System.out.println("Remaining A/c balance : "+ Balance);
			
		} 
		
		menu();
	}
		
	
	public void DepositeMoney() {
		System.out.println("Enter Amount");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		Balance = Balance + amount;
		
		System.out.println("Deposite Successfully");
		
		System.out.println("Total A/c balance :" + Balance);
	     menu();
	
	}
}
 
public class ATM_Machine {

	public static void main(String[] args) {
		
		ATM action = new ATM();
		action.setupPin();
		
	
	}

}
