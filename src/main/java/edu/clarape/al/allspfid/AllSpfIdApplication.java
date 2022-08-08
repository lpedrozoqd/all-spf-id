package edu.clarape.al.allspfid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.clarape.al.allspfid.controller.MyController;

@SpringBootApplication
public class AllSpfIdApplication {

	public static void main(String[] args) {
		//Asignación inicial:
		//SpringApplication.run(AllSpfIdApplication.class, args);
		
		ApplicationContext ctx = SpringApplication.run(AllSpfIdApplication.class, args);
		MyController myController =  (MyController)ctx.getBean("myController");
		String myControler = myController.sayHello();
		System.out.println(myControler);
	}

}
