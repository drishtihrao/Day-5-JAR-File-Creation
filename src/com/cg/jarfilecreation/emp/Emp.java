package com.cg.jarfilecreation.emp;
/*
 * Class Emp displays the employee id
 * The jar file of class emp is created so that it can be imported by other classes in a remote location 
 */
public class Emp {
	private static int empId = 155369;
	public static void getEmpId() {
		System.out.println("The emp id is " + empId);
	}
}
