package com.bok.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bok.blog.model.User;


//DAO
//자동으로 bean등록이 된다.
//@Repository 생락이 가능하다.
public interface UserRepository extends JpaRepository<User, Integer>{
	//JPA Naming 쿼리
	//SELECT*FROM user WHERE username = ? AND password = ?; 가 동작한다.
	User findByUsernameAndPassword(String username, String password);
	
	//@Query(value="SELECT*FROM user WHERE username = ?1 AND password = ?2", nativeQuery = true) 이거와 같음
	//User login(String username, String password);
}
