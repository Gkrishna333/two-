package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.RegisterRepo;

@Service
public class RegisterServiceImple  implements IRegisterService{

	@Autowired
	private RegisterRepo repo;
	
	//1.insert record
	@Override
	public Employee insertrecord(Employee emp) {
		Employee employee=repo.save(emp);
		return emp;
	}

	//2.getbyid record
	@Override
	public Employee getRecordById(String id) {
		Optional<Employee> opt=repo.findById(id);
		return opt.get() ;
	}

	//3.updating record
	@Override
	public Employee updateRecord(Employee emp) {
	Employee employee= repo.save(emp);
		return employee;
	}

	//4.get all record
	@Override
	public List<Employee> getAll() {
		return repo.findAll();
	}
	

}
