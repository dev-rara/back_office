package com.rara.back_office.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CourseListResponseDto extends MessageResponseDto{
	List<CourseResponseDto> courseList = new ArrayList<>();

	public CourseListResponseDto() {
		super("Success", HttpStatus.OK.value());
	}

	public void addCourse(CourseResponseDto responseDto) {
		courseList.add(responseDto);
	}
}
