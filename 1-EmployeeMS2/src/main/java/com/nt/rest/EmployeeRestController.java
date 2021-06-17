package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;
import com.nt.restconsumer.EmployeeRestconsumer;

@RestController()
@RequestMapping("api/emp")
public class EmployeeRestController {

	@Autowired
	private EmployeeRestconsumer consumer;
	
	
	@PostMapping("/insert")
	public String insertRecord(@RequestBody Employee emp) {
		ResponseEntity<String> re=consumer.insertRecord(emp);
		return  "REGISTER ID=>"+re.getBody();
	}
	
	@GetMapping("/getid/{id}")
	public Employee getRecordById(@PathVariable String id) {
		ResponseEntity<Employee> re=consumer.getIdByRecord(id);
		return re.getBody();
	}
	
	@PostMapping("/update")
	public Employee updateRecord( @RequestBody  Employee emp) {
		ResponseEntity<Employee> re=consumer.updateRecord(emp);
		return re.getBody();
	}
	
	@PostMapping("/all")
	public List<Employee> getAll() {
		ResponseEntity<List<Employee>> re=consumer.getAll();
		return re.getBody();
	}
	
}
