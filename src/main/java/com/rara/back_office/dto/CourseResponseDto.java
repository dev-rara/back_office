package com.rara.back_office.dto;

import com.rara.back_office.entity.Course;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseResponseDto {

	private String title;

	private String instructor;

	private Double cost;

	private LocalDateTime createdAt;

	private LocalDateTime modifiedAt;

	public CourseResponseDto(Course course) {
		this.title = course.getTitle();
		this.instructor = course.getInstructor();
		this.cost = course.getCost();
		this.createdAt = course.getCreatedAt();
		this.modifiedAt = course.getModifiedAt();
	}
}
