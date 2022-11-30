package com.rara.back_office.service;

import com.rara.back_office.dto.CourseListResponseDto;
import com.rara.back_office.dto.CourseRequestDto;
import com.rara.back_office.dto.MessageResponseDto;

public interface CourseService {

	//강의 추가
	MessageResponseDto createCourse(CourseRequestDto requestDto);

	//전체 강의 목록 조회
	CourseListResponseDto getCourses();
}
