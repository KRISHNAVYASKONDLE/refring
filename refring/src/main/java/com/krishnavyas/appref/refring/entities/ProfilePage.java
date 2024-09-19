package com.krishnavyas.appref.refring.entities;

import com.krishnavyas.appref.refring.Authentication.User;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProfilePage {

	@Id
	@GeneratedValue
	public Long id;

	@OneToOne
	@JoinColumn(name="user_id")
	public User user;
	
	@Embedded
	public Adress adress;
		
}
