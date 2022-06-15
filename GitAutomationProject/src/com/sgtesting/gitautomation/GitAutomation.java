package com.sgtesting.gitautomation;


abstract class Employee1
{
	Employee1(String eName,int eId)
	{
		System.out.println("Employee1 Name : "+eName+" & Employee1 id : "+eId);
	}
	
	abstract void displaySalary(double sal);
}

class Employee2 extends Employee1
{
	Employee2(String name,int id)
	{
		super(name,id);
	}
	
	void displaySalary(double esal)
	{
		System.out.println("Employee2 salary is :"+esal);
	}
}
public class GitAutomation {

	public static void main(String[] args) {
		
		Employee2 obj=new Employee2("Sangu",1234);
		obj.displaySalary(8389.25);

	}

}
