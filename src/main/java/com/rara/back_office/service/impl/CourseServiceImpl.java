package com.rara.back_office.service.impl;

import com.rara.back_office.dto.CourseListResponseDto;
import com.rara.back_office.dto.CourseRequestDto;
import com.rara.back_office.dto.CourseResponseDto;
import com.rara.back_office.dto.MessageResponseDto;
import com.rara.back_office.entity.Course;
import com.rara.back_office.repository.CourseRepository;
import com.rara.back_office.service.CourseService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
	private final CourseRepository courseRepository;

	@Override
	@Transactional
	public MessageResponseDto createCourse(CourseRequestDto requestDto) {
		Course course = new Course(requestDto);
		courseRepository.save(course);
		return new MessageResponseDto("Success", HttpStatus.OK.value());
	}

	@Override
	@Transactional(readOnly = true)
	public CourseListResponseDto getCourses() {
		CourseListResponseDto courseListResponseDto = new CourseListResponseDto();

		List<Course> courses = courseRepository.findAll();
		for (Course course: courses) {
			courseListResponseDto.addCourse(new CourseResponseDto(course));
		}
		return courseListResponseDto;
	}

	@Override
	@Transactional(readOnly = true)
	public CourseResponseDto getCourse(Long id) {
		Course course = courseRepository.findById(id).orElseThrow(
			() -> new IllegalArgumentException("강의가 존재하지 않습니다.")
		);
		return new CourseResponseDto(course);
	}

	@Override
	@Transactional
	public CourseResponseDto updateCourse(Long id, CourseRequestDto requestDto) {
		Course course = courseRepository.findById(id).orElseThrow(
			() -> new IllegalArgumentException("강의가 존재하지 않습니다.")
		);
		course.update(requestDto);
		courseRepository.save(course);

		return new CourseResponseDto(course);
	}
}
