package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepo repo;
	
	
	//insert a single object
	public Employee insert(Employee s) {
		return repo.save(s);
	}
	
	//findbyID
	public Employee findbyid(Integer id) {
		Employee rs = repo.findById(id).orElse(null);
		return rs;
	}
	//findbyIDName
	public Employee finByName(String name) {
		Employee rs = (Employee) repo.findByName(name);
		return rs;
	}
	
	
	//retrieve all the objects
	public List<Employee> getall(){
		return repo.findAll();
	}
	
	
	//delete
	public String deleteByid(int id) {
		repo.deleteById(id);
		return "deleted the id value:"+id; 
	}
	
	
	//update
	public Employee update(Employee s) {
		Employee ss=repo.findById(s.getId()).orElse(null);
		ss.setName(s.getName());
		ss.setFathername(s.getFathername());
		ss.setAge(s.getAge());
		ss.setDob(s.getDob());
		ss.setAddress(s.getAddress());
		ss.setNumber(s.getNumber());
		ss.setJobpost(s.getJobpost());
		return repo.save(ss);
	}
	
}