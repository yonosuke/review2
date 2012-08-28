package jp.co.dhw.review1;

public class Teacher extends User {
	private String subject;
	public Teacher(Integer id, String firstName, String lastName, String subject) {
		super(id, firstName, lastName);
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}
}