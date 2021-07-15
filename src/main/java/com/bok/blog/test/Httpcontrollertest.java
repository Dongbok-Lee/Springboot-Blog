package com.bok.blog.test;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML)
//@Controller

// 사용자가 요청 -> 응답(Data)

@RestController
public class Httpcontrollertest {
	
	private static final String TAG = "HttpControllerTest:";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = Member.builder().username("ssar").password("1234").email("ssar@nate.com").build();
		System.out.println(TAG+"getter :"+m.getUsername());
		m.setUsername("cos");
		System.out.println(TAG+"setter :"+m.getUsername());
		return"lombok test 완료";
	}
	
	@GetMapping("/http/get")
		public String getTest(Member m) {//MessageConverter(스프링 부트)

			
			return "get 요청:"+m.getId()+","+m.getUsername()+","+m.getEmail();
		}
	@PostMapping("/http/post") //text/plain, application/json
		public String postTest(@RequestBody Member m) {
			return "post 요청:"+m.getId()+","+m.getUsername()+","+m.getEmail();
			
		}
	@PutMapping("/http/put")
		public String putTest(@RequestBody Member m) {
			return "put요청 "+m.getId()+","+m.getPassword()+","+m.getEmail();
		}
	@DeleteMapping("/http/delete")
		public String deleteTest() {
			return "delete 요청";
		}
}
