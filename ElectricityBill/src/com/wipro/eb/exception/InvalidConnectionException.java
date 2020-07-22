package com.wipro.eb.exception;

public class InvalidConnectionException extends Exception{
	public String toString()
	{
		return "Incorrect Connection Type";
	}
	public InvalidConnectionException(String str){
		super(str);
	}
}
