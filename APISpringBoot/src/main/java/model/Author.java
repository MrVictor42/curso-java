package model;

import java.util.ArrayList;
import java.util.List;

public class Author {
	
	private long idAuthor;
	private String name;
	private List<Book> books = new ArrayList<Book>();
	
	public Author() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(long idAuthor) {
		this.idAuthor = idAuthor;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}