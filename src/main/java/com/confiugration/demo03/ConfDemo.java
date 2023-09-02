package com.confiugration.demo03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Address(String street, String city) {};
record Person(String name , int age , Address address) {};
@Configuration
public class ConfDemo {

	@Bean
	public String name () {
		return "Rahul";
	}
	@Bean 
	public int age() {
		return 16;
	}
	@Bean
	public Address address() {
		return new Address("Lane 8","New York");
	}
	@Bean
	public Person getPerson() {
		return new Person("Rahul",14, new Address("Baker Street","California"));
	}
	@Bean
	public Person getPerson1(String name , int age , Address address) {
		return new Person(name , age , address);
	}
}
