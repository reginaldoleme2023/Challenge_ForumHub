package com.forumhub.api.controller;

import com.forumhub.api.domain.course.Course;
import com.forumhub.api.domain.course.CourseRepository;
import com.forumhub.api.domain.course.DataCreateCourse;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cursos")
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @PostMapping
    @Transactional
    public void store(@RequestBody DataCreateCourse course){

        repository.save(new Course(course));
    }

}
