package io.inspur;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.inspur.dao")
public class RunInspurApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunInspurApplication.class, args);
	}
}
