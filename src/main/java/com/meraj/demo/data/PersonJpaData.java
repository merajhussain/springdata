package com.meraj.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meraj.demo.entiry.Person;

public interface PersonJpaData extends JpaRepository<Person, Integer>{
	
	@Query("select name from Person p where p.name='meraj'")
	String selectMeraj();
	

}
