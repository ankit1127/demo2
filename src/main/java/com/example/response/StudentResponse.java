package com.example.response;


public class StudentResponse {
	
//  LOMBOK GETTER SETTER
//	@Getter
//	@Setter
	private long id;
	private String firstName;
	private String lastName;
	
	//dont want to populate as json response
	//@JsonIgnore above the field which u dont want to populate as json   
	
	//@JsonProperty
	
	//Lombok getter setter try above
	//@AllArgsConstructor
	 
public long getId() {
	return id; 
}
public void setId(long id) {
	this.id = id;
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
	public StudentResponse(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
