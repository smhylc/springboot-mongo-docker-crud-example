package com.semihyolcu.dockermongorestfulexample.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Semih Yolcu
 * Created on 3.02.2023
 */

@Getter
@Setter
@Document
public class User {
	@Id
	private String userId;

	private String userName;
	private String userLastName;
	private Double userSalary;
}
