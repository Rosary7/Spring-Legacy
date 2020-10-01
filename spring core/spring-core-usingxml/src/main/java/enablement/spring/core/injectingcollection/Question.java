package enablement.spring.core.injectingcollection;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<String> answers;

	public Question() {
	}

	public Question(int id, String question, List<String> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println();
		System.out.println(id + " " + question);
		System.out.println("Answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
