package com.bok.blog.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bok.blog.model.Board;



public interface BoardRepository extends JpaRepository<Board, Integer>{
	
}
 