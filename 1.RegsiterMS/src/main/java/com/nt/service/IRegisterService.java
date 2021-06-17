package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IRegisterService {
	
	public Employee insertrecord(Employee emp);

	public Employee getRecordById(String id);
	
	public Employee updateRecord(Employee emp);
	
	public List<Employee> getAll();
}
