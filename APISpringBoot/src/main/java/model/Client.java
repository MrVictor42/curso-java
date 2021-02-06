package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private long idClient;
	private String name;
	private List<Book> books = new ArrayList<Book>();
	
	public Client() {
		
	}
	
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long id) {
		this.idClient = id;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void addProduct(Book product) {
		books.add(product);
	}
	
	public void removeProduct(Book product) {
		books.add(product);
	}
}