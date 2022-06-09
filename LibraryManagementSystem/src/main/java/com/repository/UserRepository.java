package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, String> {

}
