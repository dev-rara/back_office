package com.rara.back_office.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MessageResponseDto {

	private String msg;
	private int statusCode;

	public MessageResponseDto(String msg, int statusCode) {
		this.msg = msg;
		this.statusCode = statusCode;
	}
}
