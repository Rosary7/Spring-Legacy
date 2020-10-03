package enablement.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import enablement.spring.core.heloworld.HeloWorld;

@ComponentScan(basePackages = "enablement.spring.core")
public class Application {

	public static void main(String[] args) {
		heloWorldEg();
    }

	private static void heloWorldEg() {
	      ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);;
	      HeloWorld obj = (HeloWorld) context.getBean("heloworldmessage");

	      String msg = obj.getMessage();
	      System.out.println(msg);
	}

}