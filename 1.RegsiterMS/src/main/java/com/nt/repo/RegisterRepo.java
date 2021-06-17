package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.model.Employee;

public interface RegisterRepo extends MongoRepository<Employee, String> {

}
