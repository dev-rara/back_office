package com.rara.back_office.dto;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class CourseRequestDto {

	private String title;

	private String instructor;

	private Double cost;

	private LocalDateTime createdAt;

	private LocalDateTime modifiedAt;
}
