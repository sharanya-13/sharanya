package com.byla.model;

public class SavingsAccount extends Account
{
	private double minimumDepositAmount;
	private int noofTransactionsPerDay;
    
	public SavingsAccount(int accountNo,String openedDate,double balance,double minimumDepositAmount, int noofTransactionsPerDay) {

		this.minimumDepositAmount = validateminimumDepositAmount(minimumDepositAmount);
		this.noofTransactionsPerDay = noofTransactionsPerDay;
	}
	public double getMinimumDepositAmount() {
		return minimumDepositAmount;
	}
	public void setMinimumDepositAmount(double minimumDepositAmount) {
		this.minimumDepositAmount = minimumDepositAmount;
	}
	public int getNoofTransactionsPerDay() {
		return noofTransactionsPerDay;
	}
	public void setNoofTransactionsPerDay(int noofTransactionsPerDay) {
		this.noofTransactionsPerDay = noofTransactionsPerDay;
	}
    public double validateminimumDepositAmount(double minimumDepositAmount) 
    	{
        	if(minimumDepositAmount>=3000)
        		return minimumDepositAmount;
        	
        	throw new RuntimeException("minimumDepositAmount cannot be less than 3000");
        }
     public int validatenoofTransactionsPerDay(int noofTransactionsPerDay)
    	{
    		if(noofTransactionsPerDay<=15)
    			return noofTransactionsPerDay;
    		
    		throw new RuntimeException("noofTransactionsPerDay shouldnot be greater than 15 ");
    		
    	}
     public double UpdatedBalance() {
    	 return getBalance()+getMinimumDepositAmount();
     }
}
