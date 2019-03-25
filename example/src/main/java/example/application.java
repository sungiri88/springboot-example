package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class application {
	public static void main(String[] args )
	{
		ApplicationContext ctx=SpringApplication.run(application.class, args);
	}
}
