package com.in28minutes.learnspringboot.courses.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity//(name = "Course1") 테이블을 만들어줌,
public class Course {
	
	@Id				
	@GeneratedValue // Id, GeneratedValue 설정하면 column등 자동으로 생성됨.
	private long id;
	
//	@Column(name="couse_name") : 컬럼명 바꾸기 name -> couse_name으로.. '-'는 SQL에서 인식 못함. '_'로 해야함.
	private String name;
	private String author;
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public Course() {}

	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
