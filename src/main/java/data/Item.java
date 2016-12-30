package data;

public class Item {
	private Book book;
	private Integer quantity;
	
	public Item() {
		super();
	}

	public Item(Book book, Integer quantity) {
		super();
		this.book = book;
		this.quantity = quantity;
	}
	
	/*
	 * Business methods
	 */
	
	public Float getSubTotal(){
		return round(book.getPrice() * quantity);
	}
	
	private Float round(Float number){
		return (float) (Math.round(number * 100) / 100.0);
	}

	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result
				+ ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}
	
	
}
