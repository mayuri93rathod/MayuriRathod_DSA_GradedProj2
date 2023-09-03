package service;

import Interface.GenCredInterface;
//import model.Employee;

import java.util.Random;

public class GenerateCred implements GenCredInterface {

	@Override
	public String generateMail(String fname, String lname, String dept) {
		// TODO Auto-generated method stub
				
		return fname.toLowerCase()+lname.toLowerCase()+"@"+dept+".abc.com";
				
	}

	@Override
	public String generatePWD() {
		// TODO Auto-generated method stub
	
		//String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		//String numbers="0123456789";
		//String specialChar = "@!#$%&^*";
		
		
		
		return "2937@hsmd";
	}

/*	@Override
	public void displayCred() {
		// TODO Auto-generated method stub
		
		 System.out.println("Dear "+emp.getFirstName() +" your generated credentials are as follows");
			System.out.println("Email--> "+emp.getMailID());
			System.out.println("password-->"+emp.getPwd());
	} 
	*/

	
}
