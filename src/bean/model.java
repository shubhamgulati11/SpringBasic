package bean;

public class model {

	String name,email,contact;
	int age;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getContact() {
		return contact;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public model(String name, String email, String contact, int age) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.age = age;
	}
	public model() {
		super();
	}
	
	
}
