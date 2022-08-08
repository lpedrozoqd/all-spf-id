package edu.clarape.al.allspfid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.clarape.al.allspfid.controller.I18nController;
import edu.clarape.al.allspfid.controller.MyController;
import edu.clarape.al.allspfid.services.ConstructorInjectedController;
import edu.clarape.al.allspfid.services.PropertyInjectedController;
import edu.clarape.al.allspfid.services.SetterInjectedController;

@SpringBootApplication
public class AllSpfIdApplication {

	public static void main(String[] args) {
		//Asignación inicial:
		//SpringApplication.run(AllSpfIdApplication.class, args);
		
		ApplicationContext ctx = SpringApplication.run(AllSpfIdApplication.class, args);

		I18nController myI18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(">>> " + myI18nController.sayHello());
		System.out.println("");
		MyController myController =  (MyController)ctx.getBean("myController");
		String myControler = myController.sayHello();
		System.out.println(myControler);

		System.out.println("");

		System.out.println("### ID Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(">>> " + propertyInjectedController.getGreeting());

		System.out.println("");

		System.out.println("### ID Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(">>> " + setterInjectedController.getGreeting());

		System.out.println("");

		System.out.println("### ID Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(">>> " + constructorInjectedController.getGreeting());

		System.out.println("");

		System.out.println("### PrimaryBean: PrimaryGreeting");
		System.out.println(">>> " + myController.sayHello());



	}

}
