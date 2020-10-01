package enablement.spring.core.heloworld;

public class HeloWorld {
	private String message;
	
	public HeloWorld() {}
	
	public HeloWorld(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
