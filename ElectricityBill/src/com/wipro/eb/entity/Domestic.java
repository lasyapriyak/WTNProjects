package com.wipro.eb.entity;

public class Domestic extends Connection{
	public Domestic(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		int k=currentReading-previousReading;
		if(k<=50)
			return (float)slabs[0]*k;
		else if(k>50 && k<=100)
			return (float)((slabs[0]*50)+(slabs[1]*(k-50)));
		else
			return (float)((slabs[0]*50)+(slabs[1]*50)+(slabs[2]*(k-100)));
		
	}
}
