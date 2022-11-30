package com.rara.back_office.controller;

import com.rara.back_office.dto.CourseListResponseDto;
import com.rara.back_office.dto.CourseRequestDto;
import com.rara.back_office.dto.CourseResponseDto;
import com.rara.back_office.dto.MessageResponseDto;
import com.rara.back_office.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CourseController {
	private final CourseService courseService;

	@PostMapping("/courses")
	public MessageResponseDto createCourse(@RequestBody CourseRequestDto requestDto) {
		return courseService.createCourse(requestDto);
	}

	@GetMapping("/courses")
	public CourseListResponseDto getCourses() {
		return courseService.getCourses();
	}

	@GetMapping("/courses")
	public CourseResponseDto getCourse(@RequestParam Long id) {
		return courseService.getCourse(id);
	}
}
