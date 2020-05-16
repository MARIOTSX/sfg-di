package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.I18Controller; 

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		I18Controller i18Controller = (I18Controller) ctx.getBean("i18Controller");

		System.out.println("Esum esum esum " + i18Controller.sayHello());

		//MyController myController= (MyController) ctx.getBean("myController");
	    //System.out.println(myController.sayHello());

	//	System.out.println(greet);
	}
}
