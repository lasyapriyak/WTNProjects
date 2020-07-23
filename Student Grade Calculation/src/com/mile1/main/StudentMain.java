package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student data [] = new Student [10];
	
	/**
	 * 
	 */
	StudentMain () {// Constructor
		for (int i = 0; i < data. length; i++) {
		 data [i]= new Student ();
		}
		// initialize the objects
		data [0] = new Student ("A1", new int [] {72,73,74}, null);
		data [1] = new Student ("B1", new int [] {75,76,77}, null);
		data [2] = new Student ("C1", new int [] {99,99,99}, null);
		data [3] = new Student ("C3", new int [] {100,100,99}, null);
		data [4] = new Student ("B2", new int [] {13,88,13}, null);
		data [5] = new Student ("C3", new int [] {14,14,99}, null);
		data [6] = new Student ("A2", new int [] {77,55,12}, null);
		data [7] = new Student (null, new int [] {13,88,13}, null);
		data [8] = new Student ("A2", null, null);
				// this is invalid object -- so no grade calculation
		data [9] = null; // this is invalid object – so no grade calculation
		//	expectedgrades =new String [] {"A","A","A+","A+","F","F","F",name is null,mark array is null,object is null}
		 
		 
	}
	public static void main(String[] args) {
		StudentMain s=new StudentMain();
		StudentService ss=new StudentService();
		for(int i=0;i<data.length;i++)
		{
			StudentReport r=new StudentReport();
			try
			{
//				System.out.println("DAta "+i+" "+data[i]);
			if((r.validate(data[i])).equals("VALID"))
			{
				System.out.println(r.findGrades(data[i]));
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
					
		}
//		System.out.println(ss.findNumberOfNullName(data));  //TC6
//		System.out.println(ss.findNumberOfNullObjects(data)); //TC7
//		System.out.println(ss.findNumberOfNullMarksArray(data)); //TC8
		
		
		
	}

		
	
}