package com.in28minutes.learnspringboot.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.bean.Course;

@RestController
//@SpringBootConfiguration // : 스프링부트 어플리케이션 구성을 제공하는 클래스.
//@EnableAutoConfiguration // : 자동구성을 활성화.
//@ComponentScan // : 사용할 패키지를 검색하여 참조,,? (import와 비슷..?)
public class CoursesController {
	
//	@Autowired
//	private Course course;
//	
//	String value = "/courses/" + course.getId();
	
//	http://localhost:8080/courses
	@GetMapping("/courses") 	//다른 사용자가 정보를 보낼때 get
	public List<Course> getAllCourses(){
		return List.of(new Course(1, "Learn Microservices", "in28minutes"),
				new Course(2, "Learn Fu;; Stack with Angular and React", "in28minutes"));
	}
	
	//http://localhost:8080/courses/1
	@GetMapping("courses/1")
	public Course getAllCourseDetails(){
		
		return new Course(1, "Learn Microservices 1", "in28minutes");
	}
}
