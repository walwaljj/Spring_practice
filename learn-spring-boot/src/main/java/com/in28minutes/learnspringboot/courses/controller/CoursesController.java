package com.in28minutes.learnspringboot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.learnspringboot.courses.bean.Course;
import com.in28minutes.learnspringboot.courses.repository.CourseRepository;

@RestController
//@SpringBootConfiguration // : 스프링부트 어플리케이션 구성을 제공하는 클래스.
//@EnableAutoConfiguration // : 자동구성을 활성화.
//@ComponentScan // : 사용할 패키지를 검색하여 참조,,? (import와 비슷..?)
public class CoursesController {
	
	@Autowired
	private CourseRepository repository;
	
//	http://localhost:8080/courses
	@GetMapping("/courses") 	//다른 사용자가 정보를 보낼때 get
	public List<Course> getAllCourses(){
		
		return repository.findAll();//jparepository의 findAll은 모든 정보를 database에 반환함.
//		return List.of(new Course(1, "Learn Microservices", "in28minutes"),
//				new Course(2, "Learn Fu;; Stack with Angular and React", "in28minutes"));
	}
	
	//Get
	@GetMapping("/courses/{id}")
	public Course getAllCourseDetails(@PathVariable long id){
		Optional<Course> course = repository.findById(id); // Course 클래스를 Optional에 넣기
		
		if(course.isEmpty()) {
			throw new RuntimeException("Course not found with id "+id); // course가 비어 있는지 확인 , 비워져 있다면 예외 문구 출력,
		}
		return course.get();// 비워져 있지 않다면 
//		return new Course(1, "Learn Microservices 1", "in28minutes");
	}
	
	//POST 
	@PostMapping("/courses")//
	public void createCourse(@RequestBody Course course) {
							//json request , course entity 맵핑
		
		repository.save(course);
	}
	
	//PUT
	@PutMapping("/courses/{id}")//특정 resource를 업데이트한다.
	public void updateCourse(@PathVariable long id ,@RequestBody Course course) {
		//특정 리소스를 업데이트 하기위해 식별해야함..ㄴ id를 넣어줌,
		repository.save(course);
	}
	
	
	//Delete
	@DeleteMapping("/courses/{id}")//특정 resource를 업데이트한다.
	public void deleteCourse(@PathVariable long id ) {// ,@RequestBody Course course 리소스는 삭제하거나 어딘가로 보내지 않을것이기에 식별자인 id만,.
		//특정 리소스를 업데이트 하기위해 식별해야함..ㄴ id를 넣어줌,
		repository.deleteById(id);
	}
}
