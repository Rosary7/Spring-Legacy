package enablement.spring.core.heloworld;

import org.springframework.stereotype.Component;

//The HeloWorld bean is decorated with the @Component annotation. Such classes are auto-detected by Spring.
@Component(value = "heloworldmessage") 
public class HeloWorld {
	private String message = "Hello there!";

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
