package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name="studentinfo")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone no")
	private Long phoneno;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhone() {
		return phoneno;
	}
	public void setPhone(Long phoneno) {
		this.phoneno = phoneno;
	}
	
	
}
