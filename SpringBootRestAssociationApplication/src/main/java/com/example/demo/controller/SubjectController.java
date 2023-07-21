package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Subject;
import com.example.demo.service.SubjectService;

@RestController
public class SubjectController {
@Autowired
SubjectService sservice;
@GetMapping("/getall")
public List<Subject> getall()
{
	return sservice.getall();
}
@PostMapping("/save")
public int save(Subject s)
{
	return  sservice.save(s);
}
}
