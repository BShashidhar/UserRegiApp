package com.userUegistration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "Admin")
public class Admin {
	@Id
	private int adminId;

	private String adminName;

	private String adminPassword;
}
