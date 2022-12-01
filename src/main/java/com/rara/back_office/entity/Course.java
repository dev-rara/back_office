package com.rara.back_office.entity;

import com.rara.back_office.dto.CourseRequestDto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Course extends Timestamped{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	private String instructor;

	private Double cost;

	public Course(CourseRequestDto requestDto) {
		this.title = requestDto.getTitle();
		this.instructor = requestDto.getInstructor();
		this.cost = requestDto.getCost();
	}

	public void update(CourseRequestDto requestDto) {
		this.title = requestDto.getTitle();
		this.instructor = requestDto.getInstructor();
		this.cost = requestDto.getCost();
	}
}
