package com.krishnavyas.appref.refring.Authentication;

import java.io.Serializable;

import com.krishnavyas.appref.refring.entities.ProfilePage;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String name;
	
	public String emailid;
	
	public String password;
	
	@OneToOne(mappedBy = "user")
	public ProfilePage profilepage;
	
}
