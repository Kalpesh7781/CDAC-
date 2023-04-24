package day4;

public class Author {
	private String aname;
	private String email;
	private char gender;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Author(String aname, String email, char gender) {
		 setAname(aname);
		 setEmail(email);
		 setGender(gender);
		 	 
	}
	@Override
	public String toString() {
		return " aname=" + aname + ", email=" + email + ", gender=" + gender + " ";
	}
	 
 
}
