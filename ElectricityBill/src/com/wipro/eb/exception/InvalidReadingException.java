package com.wipro.eb.exception;

public class InvalidReadingException extends Exception{
	public String toString()
	{
		return "Incorrect Reading";
	}
	public InvalidReadingException(String str){
		super(str);
	}
}