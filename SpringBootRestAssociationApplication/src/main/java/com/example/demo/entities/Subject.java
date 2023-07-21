package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="subject")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int subjectid;
	@Column
String descr;
	@Column
String name;
	@OneToMany(mappedBy ="subject" )
	@Cascade(value = CascadeType.ALL)
	@JsonIgnoreProperties("subject")
List<Question> questions;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subjectid, String descr, String name, List<Question> questions) {
		super();
		this.subjectid = subjectid;
		this.descr = descr;
		this.name = name;
		this.questions = questions;
	}
	
	public Subject(String descr, String name) {
		super();
		this.descr = descr;
		this.name = name;
	}
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		for(Question s:questions)
			s.setSubject(this);
		this.questions = questions;
	}
	
	
	
	
	
}

