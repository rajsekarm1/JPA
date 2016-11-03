package com.udemy.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Stud")
public class Stud {

	@Id
	@Column(name="stud_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public Stud(){
		
	}
	public Stud(String name, University university) {
		super();
		this.name = name;
		this.university = university;
	}

	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="university_id")
	private University university;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	
}
