package com.semihyolcu.dockermongorestfulexample.mapper;

import com.semihyolcu.dockermongorestfulexample.dto.request.UserRequest;
import com.semihyolcu.dockermongorestfulexample.dto.response.UserResponse;
import com.semihyolcu.dockermongorestfulexample.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	UserResponse toResponse(User user);

	@Mapping(source = "userName", target = "userName")
	@Mapping(source = "userLastName", target = "userLastName")
	@Mapping(source = "userSalary", target = "userSalary")
	User toModel(UserRequest userRequest);

	List<UserResponse> toResponseList(List<User> user);


}
