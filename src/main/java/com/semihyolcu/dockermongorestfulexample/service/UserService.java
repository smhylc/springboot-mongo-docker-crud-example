package com.semihyolcu.dockermongorestfulexample.service;

import com.semihyolcu.dockermongorestfulexample.dto.request.UserRequest;
import com.semihyolcu.dockermongorestfulexample.dto.response.UserResponse;
import com.semihyolcu.dockermongorestfulexample.mapper.UserMapper;
import com.semihyolcu.dockermongorestfulexample.model.User;
import com.semihyolcu.dockermongorestfulexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Semih Yolcu
 * Created on 3.02.2023
 */

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public UserResponse createUser(UserRequest userRequest) {
		User u = userRepository.save(UserMapper.INSTANCE.toModel(userRequest));
		return UserMapper.INSTANCE.toResponse(u);
	}

	public List<UserResponse> getAllUsers() {
		return UserMapper.INSTANCE.toResponseList(userRepository.findAll());
	}

	public UserResponse getUserByName(String userName) {
		UserResponse response = UserMapper.INSTANCE.toResponse(userRepository.findUsersByUserName(userName));
		if (response == null) {
			return null;
		}
		return response;
	}

	public Long deleteUserByName(String userName) {
		Long response = userRepository.deleteUserByUserName(userName);
		if (response == null) {
			return null;
		}
		return response;
	}

	public UserResponse editUserByName(String userName, UserRequest userRequest) {
		User user = userRepository.findUsersByUserName(userName);
		if (user == null) {
			return null;
		}
		user.setUserName(userRequest.getUserName());
		user.setUserLastName(userRequest.getUserLastName());
		user.setUserSalary(userRequest.getUserSalary());

		userRepository.save(user);

		return UserMapper.INSTANCE.toResponse(user);
	}


}
