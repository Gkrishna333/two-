package com.nt.restconsumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Employee;

@FeignClient("REGISTER")
@RequestMapping("api/register")
public interface EmployeeRestconsumer {

	@PostMapping("/insert") 
	 public ResponseEntity<String> insertRecord(@RequestBody Employee emp);
	
	 @GetMapping("/getid/{id}")
	 public ResponseEntity<Employee>  getIdByRecord(@PathVariable String id);
	 
	 @PutMapping("/update") 
	 public ResponseEntity<Employee> updateRecord(@RequestBody Employee emp);
	 
	 @GetMapping("/all") 
	 public ResponseEntity<List<Employee>>  getAll();
	
		
	
}
