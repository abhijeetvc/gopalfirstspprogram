package com.gopalfirstspproject.gopalfirstspprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController  // = @Controller + @ResponseBody
//@RequestMapping(value="/start")
@SpringBootApplication  // = @Configuration, @EnableAutoConfiguration, @ComponentScan
public class GopalfirstspprogramApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext
		SpringApplication.run(GopalfirstspprogramApplication.class, args);
	}

//	@GetMapping(value="/check")
//	public String getData(){
//
//		return "First Spring program...";
//	}
//
//	@GetMapping(value="/add/{num1}/{num2}")
//	public Integer addNos(@PathVariable Integer num1,@PathVariable Integer num2){
//		return num1+num2;
//	}

}




