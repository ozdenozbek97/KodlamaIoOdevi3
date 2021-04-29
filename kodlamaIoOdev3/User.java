package kodlamaIoOdev3;

public class User {
	
	int id;
	String fisrtName;
	String lastName;
	String Email;
	String password;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFisrtName() {
		return fisrtName;
	}
	
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullName() {
		return this.fisrtName + " " + this.lastName;
	}
	

}
