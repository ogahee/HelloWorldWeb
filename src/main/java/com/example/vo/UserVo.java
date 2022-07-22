package com.example.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVo {
	private String userid;
	private String passwd;
	private String username;
	private int userage;
	private String gender;
	
}
