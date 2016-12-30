package data;

public class Book {
	private String title;
	private String number;
	private Float price;
	
	public Book() {
		super();
	}
	
	public Book(String title, String number) {
		super();
		this.title = title;
		this.number = number;
	}
	
	public Book(String title, String number, Float price) {
		super();
		this.title = title;
		this.number = number;
		this.price = price;
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
	
	public Float getPrice() {
		return price;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
}
