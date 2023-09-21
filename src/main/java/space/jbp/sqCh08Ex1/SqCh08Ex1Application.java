package space.jbp.sqCh08Ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controllers")
public class SqCh08Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh08Ex1Application.class, args);
	}

}
