package com.semihyolcu.dockermongorestfulexample.controller;

import com.semihyolcu.dockermongorestfulexample.dto.request.UserRequest;
import com.semihyolcu.dockermongorestfulexample.dto.response.UserResponse;
import com.semihyolcu.dockermongorestfulexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Semih Yolcu
 * Created on 3.02.2023
 */

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping("/add-user")
	public ResponseEntity<UserResponse> addUser(@RequestBody UserRequest userRequest) {
		return new ResponseEntity<>(userService.createUser(userRequest), HttpStatus.CREATED);
	}

	@GetMapping("/get-all-users")
	public ResponseEntity<List<UserResponse>> getAllUsers() {
		return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
	}

	@GetMapping(value = "/get-user/{userName}")
	public ResponseEntity<UserResponse> getUserByName(@PathVariable String userName) {
		return new ResponseEntity<>(userService.getUserByName(userName), HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete-user/{userName}")
	public ResponseEntity<Long> deleteUserByName(@PathVariable String userName) {
		return new ResponseEntity<>(userService.deleteUserByName(userName), HttpStatus.NO_CONTENT);
	}

	@PutMapping("/edit-user/{userName}")
	public ResponseEntity<UserResponse> editUserByName(@PathVariable String userName, @RequestBody UserRequest userRequest) {
		return new ResponseEntity<>(userService.editUserByName(userName, userRequest), HttpStatus.OK);
	}

}
