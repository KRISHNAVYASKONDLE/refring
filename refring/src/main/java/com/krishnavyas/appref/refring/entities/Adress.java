package com.krishnavyas.appref.refring.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adress {

	public String doorno;
	
	public String street;
			
	public int pincode;

	public String state;

}
