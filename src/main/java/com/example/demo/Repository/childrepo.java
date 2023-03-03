package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.child;

public interface childrepo extends JpaRepository<child,Integer> {

}