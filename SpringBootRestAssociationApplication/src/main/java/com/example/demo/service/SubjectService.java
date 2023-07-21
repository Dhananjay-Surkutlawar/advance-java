package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Subject;
import com.example.demo.repository.SubjectRepository;

@Service
public class SubjectService {
 @Autowired
	SubjectRepository srepo;
 
 public List<Subject> getall()
 {
	 return srepo.findAll();
 }
 public int save(Subject s)
 {
	 int n=1;
	 try
	 {
		 srepo.save(s);
	 }
	 catch(Exception e)
	 {
		 n=0;
		 e.printStackTrace();
	 }
	 return n;
 }
}
