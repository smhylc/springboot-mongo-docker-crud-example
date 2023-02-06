package com.semihyolcu.dockermongorestfulexample.repository;

import com.semihyolcu.dockermongorestfulexample.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Semih Yolcu
 * Created on 3.02.2023
 */

public interface UserRepository extends MongoRepository<User, String> {

	User findUserByUserName(String userName);

	Long deleteUserByUserName(String userName);

}
