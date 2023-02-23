package com.example.demo.Service;

import java.util.ArrayList;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.employee;
import com.example.demo.repository.Repository;

@Service
public class StudService {

	@Autowired
	private Repository repo;

// addStudent
	public employee addStudent(employee obj) {
		return repo.save(obj);
	}

// getStudent
	public List<employee> getStudent() {
		List<employee> arr = new ArrayList<>();
		arr = repo.findAll();
		return arr;
	}

//deleteById  
	public void deleteById(int id) {
		repo.deleteById(id);
	}

}
