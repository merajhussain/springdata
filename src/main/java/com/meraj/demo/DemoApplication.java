package com.meraj.demo;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meraj.demo.config.DbSource;
import com.meraj.demo.data.PersonJpaData;
import com.meraj.demo.entiry.Person;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaData personrepo;
	@Autowired
	DbSource db;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		//personrepo.findAll();
		
		
		personrepo.deleteAll();
		logger.info("print all persons->{}",personrepo.findAll());
		
		Person person = new Person();
		person.setName("meraj");
		personrepo.save(person);
		
		 
		   
		   
		   
		 logger.info(  personrepo.selectMeraj());
		
	}

}
