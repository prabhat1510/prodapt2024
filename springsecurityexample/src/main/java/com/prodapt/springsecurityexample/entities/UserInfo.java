package com.prodapt.springsecurityexample.entities;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="user_info")
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	@NonNull
	private String userName;
	@NonNull
	private String password;
}
