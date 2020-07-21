package com.wipro.bank.acc;

public abstract class Account {
	int tenure;
	float principal;
	float rateOfInterest;
	public void setInterest(int age, String gender)
	{
		if(age<60 && gender.equals("Male"))
		{
			rateOfInterest=9.8f;
		}
		else if(age>=60 && gender.equals("Male"))
		{
			rateOfInterest=10.5f;
		}
		else if(age<58 && gender.equals("Female"))
		{
			rateOfInterest=10.2f;
		}
		else if(age>=58 && gender.equals("Female"))
		{
			rateOfInterest=10.8f;
		}

	}
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest)
	{
		return totalPrincipleDeposited+maturityInterest;
	}
			public abstract float calculateInterest();
			public abstract float calculateAmountDeposited();


}
