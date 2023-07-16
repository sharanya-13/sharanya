package com.byla.model;

public class Main
{
	public static void main(String[] args) {
	    Account[] acc = null;
	    acc = new Account[10];
	    acc[0] = new SavingsAccount(7001,"11-1-2001",30000,2000,2);;
		acc[2] = new SavingsAccount(7002,"10-6-2002",1000,1500,1);
		acc[3] = new SavingsAccount(7003,"6-10-2011",4000,1000,3);
		acc[4] = new SavingsAccount(7004,"16-7-2002",5000,1200,2);
		acc[5] = new SavingsAccount(7005,"23-8-2004",6000,2000,4);
		acc[6] = new CurrentAccount(7006,"20-6-2007",3000,1000);
		acc[7] = new CurrentAccount(7007,"2-9-2000",2000,1000);
		acc[1] = new CurrentAccount(7008,"3-5-2002",6000,1600);
		acc[8] = new CurrentAccount(7009,"5-8-2005",8000,1500);
		acc[9] = new CurrentAccount(7000,"2-12-2009",2000,1000);
		
		    Bank ba = new Bank("State bank of india ","delhi"); 
        ba.addAccount(acc[0]);
        ba.addAccount(acc[1]);
        ba.addAccount(acc[2]);
        ba.addAccount(acc[3]);
        ba.addAccount(acc[4]);
        
        ba.addAccount(acc[5]);
        ba.addAccount(acc[6]);
        ba.addAccount(acc[7]);
        ba.addAccount(acc[8]);
        ba.addAccount(acc[9]);
        
        ba.showAccounts();
       
        System.out.println(ba.Transaction('D',7001,1000));
        System.out.println(ba.Transaction('W',7006,1000));
		
	}
}
