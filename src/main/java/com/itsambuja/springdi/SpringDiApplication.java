package com.itsambuja.springdi;

import com.itsambuja.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		MyController myControllers = (MyController) ctx.getBean("myController");

		String greeting = myControllers.sayHello();

		System.out.println(greeting);
	}

}
