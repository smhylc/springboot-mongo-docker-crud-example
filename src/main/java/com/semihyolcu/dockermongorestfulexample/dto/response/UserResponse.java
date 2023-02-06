package com.semihyolcu.dockermongorestfulexample.dto.response;

import lombok.Data;

/**
 * @author Semih Yolcu
 * Created on 3.02.2023
 */

@Data
public class UserResponse {
	private String userName;
	private String userLastName;
}
