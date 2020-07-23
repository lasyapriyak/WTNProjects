package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {
	public String findGrades(Student studentObject){
		try {
			if(validate(studentObject).equals("VALID")) {
			int y[]=studentObject.getMarks();
			int sum=0,f=0;
			String grade = "F";
			for(int i=0;i<y.length;i++)
			{
				if(y[i]<35)
				{
					grade="F";
					f=1;
					break;
				}
				
					sum=sum+y[i];
				
			}
			if(f==0)
			{
				if(sum<150)
					grade="C";
				else if(sum<200)
					grade="B";
				else if(sum<250)
					grade="A";
				else
					grade="A+";
					
			}
			
			return grade;
			}
		} catch (NullNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullMarksArrayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullStudentObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public String validate(Student s) throws NullNameException,NullMarksArrayException,NullStudentObjectException
	{
//		System.out.println(s);
		if(s==null) {
			throw new  NullStudentObjectException();
		}
		else
		{
			if(s.getName()==null)
				throw new NullNameException();
			else if(s.getMarks()==null)
				throw new NullMarksArrayException();
			else
				return "VALID";
		}
		
		
	}

}
