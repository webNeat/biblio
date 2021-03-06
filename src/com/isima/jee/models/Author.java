package com.isima.jee.models;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(detachable = "true")
public class Author {
	static private int lastNum;
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key id;
	@Persistent
	private int num;
	@Persistent
	private String firstName;
	@Persistent
	private String lastName;
	@Persistent
	private String adress;
	@Persistent(mappedBy = "author")
	@Element(dependent = "true")
	private List<Book> books = new ArrayList<Book>();
	public static int getLastNum(){
		return lastNum;
	}
	public static void setLastNum(int n){
		lastNum = n;
	}
	public Author() {
		super();
	}
	public Author(int num, String firstName, String lastName, String adress,
			List<Book> books) {
		super();
		this.num = num;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.books = books;
		if(num > lastNum)
			lastNum = num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Author [num=" + num + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", adress=" + adress + ", books="
				+ books + "]";
	}
}
