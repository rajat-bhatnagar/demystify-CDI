package data;

public class Book {
	private String title;
	private String number;
	
	public Book() {
		super();
	}
	public Book(String title, String number) {
		super();
		this.title = title;
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", number=" + number + "]";
	}
}
