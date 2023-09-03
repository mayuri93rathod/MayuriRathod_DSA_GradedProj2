package model;

public class Employee {

	private String firstName;
	private String lastName;
	private String mailID;
	private String pwd;
	
	
	public Employee(String firstName, String lastName ) {
		// TODO Auto-generated constructor stub
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMailID() {
		return mailID;
	}


	public void setMailID(String mailID) {
		this.mailID = mailID;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	
	
	
}
