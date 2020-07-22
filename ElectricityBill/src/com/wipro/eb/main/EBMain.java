package com.wipro.eb.main;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.service.ConnectionService;

public class EBMain {

	public static void main(String[] args) throws InvalidReadingException, InvalidConnectionException {
		// TODO Auto-generated method stub
		System.out.println(new ConnectionService().generateBill(130,100,"Commercial")); //1
		
		System.out.println(new ConnectionService().generateBill(160,100,"Domestic")); //2
		
		System.out.println(new ConnectionService().generateBill(200,100,"Domestic")); //3
		
		System.out.println(new ConnectionService().generateBill(130,100,"Commercial")); //4
		  
		System.out.println(new ConnectionService().generateBill(160,100,"Commercial")); //5
		
		System.out.println(new ConnectionService().generateBill(200,100,"Commercial")); //6
		
		System.out.println(new ConnectionService().validate(130,100,"Commercial"));  //7
		
//		System.out.println(new ConnectionService().validate(100,130,"Commercial")); //8 - Invalid
		
//		System.out.println(new ConnectionService().validate(130,100,"Comm")); //9 Invalid	
		
		System.out.println(new ConnectionService().generateBill(50,100,"Commercial")); //10 - Commercial Invalid
		
		System.out.println(new ConnectionService().generateBill(50,100,"Domestic")); //10 - Domestic Invalid
		
		System.out.println(new ConnectionService().generateBill(150,100,"Comm")); //10 - Commercial Invalid
		
		System.out.println(new ConnectionService().generateBill(150,100,"Dom")); //10 - Domestic Invalid
		
		
	}

}
