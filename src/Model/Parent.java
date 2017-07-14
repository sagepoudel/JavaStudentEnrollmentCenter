package Model;

public class Parent {
public Parent(int id,String username, String password) {
		super();
		this.id=id;
		this.username = username;
		this.password = password;
	}
public Parent() {
	// TODO Auto-generated constructor stub
}
private String username;
private String password;
private int id;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
