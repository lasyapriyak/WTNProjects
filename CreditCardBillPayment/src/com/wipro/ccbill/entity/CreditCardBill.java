package com.wipro.ccbill.entity;
import java.util.Date;

import com.wipro.ccbill.exception.InputValidationException;
public class CreditCardBill {
	private String creditCardNo;
	private String customerId;
	private Date billDate;
	private Transaction monthTransactions[];
	
	public CreditCardBill () {super();}
	
	public CreditCardBill(String creditCardNo, String customerId, Date billDate, Transaction[] monthTransactions)
	{
		this.creditCardNo = creditCardNo;
		this.customerId = customerId;
		this.billDate = billDate;
		this.monthTransactions = monthTransactions;
	}
	public double getTotalAmount(String transactionType)
	{
		if(transactionType.equals("CR") || transactionType.equals("DB"))
		{
			double amount=0;
			for(int i=0;i<monthTransactions.length;i++)
			{
				if(monthTransactions[i].getTransactionType().equals(transactionType)) 
				{
					amount=amount+monthTransactions[i].getTransactionAmount();
				}
			}
			return amount;
		}
		return 0;
	}
	public double calculateBillAmount() throws InputValidationException
	{
		String valid = null;
		try {
			valid = validateData();
			if(valid.equals("valid"))
			{
				if(monthTransactions!=null && monthTransactions.length!=0)
				{
					double amountSpend=getTotalAmount("DB");
					double amountpaid=getTotalAmount("CR");
					double difference=Math.abs(amountSpend-amountpaid);
					double interest=(difference*(19.9/100))/12;
					return difference+interest;
				}
				else
					return 0.0;
				
			}
			
			
		}
		catch(InputValidationException e) {
			throw new InputValidationException("Invalid");
		}
		return 0.0;
		
		
	}
	public String validateData() throws InputValidationException
	{
		if(creditCardNo==null || creditCardNo.length()!=16 || customerId==null || customerId.length()<6 )
		{
			throw new InputValidationException("Invaliddd");
		}
		else
		{
			return "valid";
		}
	}

}
