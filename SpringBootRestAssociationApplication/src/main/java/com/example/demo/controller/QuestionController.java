package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.QuestionService;

@RestController
public class QuestionController {
@Autowired
	QuestionService qservice;
}
