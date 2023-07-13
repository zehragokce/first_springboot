package com.example.first_springboot;

// courses
// course: id,name,author

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    //courses
    //course:id,name,author
    //what we want to do is to map URL to this specific method

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> retrieveAllCourses(){
        List<Course> list = Arrays.asList(
                new Course(1, "Learn AWS", "withGokce"),
                new Course(2, "Learn DevOps", "withGokce")
        );
        return new ResponseEntity<>(list, HttpStatusCode.valueOf(404));
    }

}
