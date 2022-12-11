package com.nri.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.nri.entities.Book;

public class BookDao {

	private HibernateTemplate hibernateTemplate;
	Integer result;
	// Insert
	@Transactional
	public int rcrInsert(Book b) {
		result = (Integer)this.hibernateTemplate.save(b);
		return result;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// Update
	@Transactional
	public void rcrUpdate(Book b) {
		this.hibernateTemplate.update(b);
	}
	
	// Get a Single Book
	public Book rcrGetBook(int bid) {
		Book b = this.hibernateTemplate.get(Book.class, bid);
		return b;
	}
	
	// Get All The Books
	public List<Book> getAllBook(){
		List<Book> b = this.hibernateTemplate.loadAll(Book.class);
		return b;
	}
	
	// Delete
	@Transactional
	public void deleteBook(int bid) {
		Book b = this.hibernateTemplate.get(Book.class, bid);
		this.hibernateTemplate.delete(b);
	}
}