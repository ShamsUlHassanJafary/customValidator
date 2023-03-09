package com.example.customValidatorExample;

import javax.validation.Valid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CustomValidatorExampleApplication {

	@GetMapping("/dto")
	public MyDto showDto(@RequestBody @Valid MyDto dto) {
		MyDto myDto = new MyDto();
		myDto.setName(dto.getName());

		return myDto;
	}

	public static void main(String[] args) {

		// MyDto dto = new MyDto();
		// dto.setName("sh");
		// String legth = dto.getName();
		// System.out.println(legth);

		SpringApplication.run(CustomValidatorExampleApplication.class, args);
	}

}
