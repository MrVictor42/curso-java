package model;

public class Book {
	
	private long idBook;
	private String name;
	private String description;
	private double price;
	private double discount;
	private Author author;
	private Gender gender;
	
	public Book() {
		
	}
	
	public long getIdBook() {
		return idBook;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setIdBook(long idBook) {
		this.idBook = idBook;
	}
}