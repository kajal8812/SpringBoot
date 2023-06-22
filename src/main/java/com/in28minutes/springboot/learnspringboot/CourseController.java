package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8091/courses%20list

@RestController
public class CourseController {

	@RequestMapping("/courses list")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course(1, "learn-spring-framework", "shiva"), new Course(2, "learn java", "Reena")

		);
	}
}
