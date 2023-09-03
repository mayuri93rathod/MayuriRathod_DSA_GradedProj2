package Main;

import java.util.Scanner;

import service.GenerateCred;

import model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerateCred gencred = new GenerateCred();
		
		Employee emp = new Employee("Mayuri", "Rathod");
		
		int depart_no;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		
				System.out.println("\nPlease enter the department from the following: ");
				
				System.out.println("1.Technical");
				System.out.println("2.Admin");
				System.out.println("3.Human Resource");
				System.out.println("4.Legal\n");
				
				depart_no = sc.nextInt();
				String mailID;
				String pwd;
				
				switch(depart_no) {
				
				case 1: mailID=gencred.generateMail(emp.getFirstName(), emp.getLastName(), "tech");
						pwd = gencred.generatePWD();
						emp.setMailID(mailID);
				        emp.setPwd(pwd);
						
				        System.out.println("Dear "+emp.getFirstName() +" your generated credentials are as follows");
						System.out.println("Email--> "+emp.getMailID());
						System.out.println("password-->"+emp.getPwd());
				        
					    break;
					    
				case 2: mailID= gencred.generateMail(emp.getFirstName(), emp.getLastName(), "admn");
						pwd = gencred.generatePWD();
						
						emp.setMailID(mailID);
				        emp.setPwd(pwd);
				        
				        System.out.println("Dear "+emp.getFirstName() +" your generated credentials are as follows");
						System.out.println("Email--> "+emp.getMailID());
						System.out.println("password-->"+emp.getPwd());
				        
				        
				        
				    break;
				    
				case 3: mailID=gencred.generateMail(emp.getFirstName(), emp.getLastName(), "hr");
				        pwd = gencred.generatePWD();
				        emp.setMailID(mailID);
				        emp.setPwd(pwd);
				        
				        System.out.println("Dear "+emp.getFirstName() +" your generated credentials are as follows");
						System.out.println("Email--> "+emp.getMailID());
						System.out.println("password-->"+emp.getPwd());
				       
				    break;
				    
				case 4: mailID=gencred.generateMail(emp.getFirstName(), emp.getLastName(), "legal");
				        pwd = gencred.generatePWD();
				        emp.setMailID(mailID);
				        emp.setPwd(pwd);
				        
				        System.out.println("Dear "+emp.getFirstName() +" your generated credentials are as follows");
						System.out.println("Email--> "+emp.getMailID());
						System.out.println("password-->"+emp.getPwd());
		
				    break;
				    
				default:System.out.println("Enter valid option");
					break;
				
				}
				
		
		}while(depart_no != 5);
		
		sc.close();
		

	}

}
