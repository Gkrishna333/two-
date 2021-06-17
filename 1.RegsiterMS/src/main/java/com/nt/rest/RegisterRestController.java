package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;
import com.nt.model.Employee;
import com.nt.service.IRegisterService;


@RestController
@RequestMapping("api/register")
public class RegisterRestController {

	@Autowired
	private IRegisterService service;
	
	//1.inserting
	 @PostMapping("/insert") 
	 public ResponseEntity<String> insertRecord(@RequestBody  Employee emp){
		 Employee employee=service.insertrecord(emp);
		 return new ResponseEntity(employee.getId(),HttpStatus.CREATED);
	 }
	
	 @GetMapping("/getid/{id}")
	 public ResponseEntity<Employee>  getIdByRecord(@PathVariable String id){
		Employee emp1= service.getRecordById(id);
		return  new ResponseEntity(emp1,HttpStatus.OK);
	 }
	
	 //3.update record
	 @PutMapping("/update") 
	 public ResponseEntity<Employee> updateRecord(@RequestBody Employee emp){
		 Employee employee=service.updateRecord(emp);
		 return  new ResponseEntity(employee,HttpStatus.OK);
	 }
	 
	 //4.get all record
	 
	 @GetMapping("/all") 
	 public ResponseEntity<List<Employee>>  getAll(){
		List<Employee> li= service.getAll();
		return  new ResponseEntity(li,HttpStatus.OK);
		 
	 }
	 
}
