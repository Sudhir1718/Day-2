package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.employee;

public interface Repository extends JpaRepository<employee,Integer> {

}
