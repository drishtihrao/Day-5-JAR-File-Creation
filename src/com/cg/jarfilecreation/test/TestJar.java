package com.cg.jarfilecreation.test;
/*
 * The TestJar class imports the jar files of Emp and Org classes
 * The jar file of class emp and org is created so that it can be imported by other classes in a remote location 
 * The methods defined in the Emp class and Org class can be accessed from any remote location after importing the jar files
 */
import com.cg.jarfilecreation.emp.Emp;
import com.cg.jarfilecreation.pack2.Org;

public class TestJar {
	public static void main(String args[]) {
		 Emp.getEmpId();
		 Org.display();
	 }
}
