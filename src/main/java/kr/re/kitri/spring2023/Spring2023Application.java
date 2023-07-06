package kr.re.kitri.spring2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Spring2023Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring2023Application.class, args);
	}

}
