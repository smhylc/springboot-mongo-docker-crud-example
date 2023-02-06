package com.semihyolcu.dockermongorestfulexample.dto.request;

import lombok.Data;

/**
 * @author Semih Yolcu
 * Created on 3.02.2023
 */

@Data
public class UserRequest {

	private String userName;
	private String userLastName;
	private Double userSalary;

}
