package com.rara.back_office.dto;

import com.rara.back_office.entity.Course;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseResponseDto {

	private String title;

	private String instructor;

	private Double cost;

	public CourseResponseDto(Course course) {
		this.title = course.getTitle();
		this.instructor = course.getInstructor();
		this.cost = course.getCost();
	}
}
