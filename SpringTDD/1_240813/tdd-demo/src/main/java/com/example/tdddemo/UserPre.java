package com.example.tdddemo;

import lombok.Getter;

@Getter
public class UserPre {
	private String name;

	public UserPre(String name) {
		if(name.length() < 2) {
			throw new IllegalArgumentException("이름은 2자 이상이어야 합니다.");
		}
		this.name = name;
	}
}