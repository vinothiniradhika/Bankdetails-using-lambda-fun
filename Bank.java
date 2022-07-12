package mybank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
interface ATM{
	public abstract void withdraw(int w);
}
interface CDM{
    public abstract void deposit(int d);
}
public class Bank {
	static int balance;
	Bank(int balance){
		this.balance=balance;
	}
	public void showbalance() {
		System.out.println(this.balance);
	}
	/*public void withdraw(int wa){
		this.balance=this.balance-wa;
		System.out.println(this.balance);
	}*/
	//ATM wd=(balance,wa)->System.out.println(balance-wa);
	/*public void deposit(int da) {
		this.balance=this.balance+da;
		System.out.println(this.balance);
	}*/
	//CDM deposit=(balance,da)->System.out.println(balance+da);
public static void main(String[] args) {
	String name=null;
	String balanceString=null;
	String withdrawString=null;
	String depositString=null;
	int balance=0;
	int wa=0;
	int da=0;
	try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter the amount in your account");
		balanceString=br.readLine();
		balance=Integer.parseInt(balanceString);
		System.out.println("please enter the amount to be withdrawn");
		withdrawString=br.readLine();
		wa=Integer.parseInt(withdrawString);
		System.out.println("please enter the amount to be deposited");
		depositString=br.readLine();
		da=Integer.parseInt(depositString);
		}catch(IOException e) {
		System.out.println(e);
	}
	Bank b1=new Bank(balance);
	ATM c1=(int w)->System.out.println("balance amount after withdrawn the amount "+(b1.balance-w));
	c1.withdraw(wa);
	CDM c=(int d)->System.out.println("balance amount after depositing amount "+(b1.balance+d));
	c.deposit(da);
	/*b1.showbalance();
	b1.withdraw(wa);
	b1.deposit(da);*/
}
}
