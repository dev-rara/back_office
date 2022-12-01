package com.rara.back_office.service;

import com.rara.back_office.dto.CourseListResponseDto;
import com.rara.back_office.dto.CourseRequestDto;
import com.rara.back_office.dto.CourseResponseDto;
import com.rara.back_office.dto.MessageResponseDto;

public interface CourseService {

	//강의 추가
	MessageResponseDto createCourse(CourseRequestDto requestDto);

	//전체 강의 목록 조회
	CourseListResponseDto getCourses();

	//선택한 강의 조회
	CourseResponseDto getCourse(Long id);

	//강의 수정
	CourseResponseDto updateCourse(Long id, CourseRequestDto requestDto);
}
