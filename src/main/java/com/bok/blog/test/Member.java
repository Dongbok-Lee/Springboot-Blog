package com.bok.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Member {
	private int id;
	private String username;
	private String password;
	private String email;
}
