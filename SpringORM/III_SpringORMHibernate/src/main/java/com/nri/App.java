package com.nri;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nri.dao.BookDao;
import com.nri.entities.Book;

public class App {
	public static void main(String[] args) {
		System.out.println("Spring Hibernate ORM - Library Management System -");

		ApplicationContext iocObj = new ClassPathXmlApplicationContext("appconfig.xml");

		BookDao bkDao = iocObj.getBean(BookDao.class, "bookDao");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean go = true;

		while (go) {
			System.out.println("Press 1-> To Add a Book");
			System.out.println("Press 2-> To Update a Book");
			System.out.println("Press 3-> To Delete a Book");
			System.out.println("Press 4-> To Get a Book");
			System.out.println("Press 5-> To Get all Book");
			System.out.println("Press 6-> Exit The Application");
			
			int bkid;
			String bkname;
			String bkauthor;
			int r;
			Book b;
			try {

				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					// Insert
					System.out.println("Enter the bbok id:");
					bkid = Integer.parseInt(br.readLine());
					
					System.out.println("Enter the book name: ");
					bkname = br.readLine();
					
					System.out.println("Enter the book author: ");
					bkauthor = br.readLine();
					
					b = new Book();
					b.setBid(bkid);
					b.setBname(bkname);
					b.setBauthor(bkauthor);
					
					r = bkDao.rcrInsert(b);
					System.out.println(r+" record got inserted");
					
					break;
				case 2:
					// Update
					System.out.println("Enter the bbok id:");
					bkid = Integer.parseInt(br.readLine());
					
					System.out.println("Enter the book name: ");
					bkname = br.readLine();
					
					System.out.println("Enter the book author: ");
					bkauthor = br.readLine();
					
					b = new Book();
					b.setBid(bkid);
					b.setBname(bkname);
					b.setBauthor(bkauthor);
					
					bkDao.rcrUpdate(b);
					System.out.println("Record got updated");
					break;
				case 3:
					// Delete
					System.out.println("Enter the bok id to be deleted:");
					bkid = Integer.parseInt(br.readLine());
					
					bkDao.deleteBook(bkid);
					System.out.println("Record got Deleted");
					break;
				case 4:
					//Get a Book
					System.out.println("Enter the bbok id:");
					bkid = Integer.parseInt(br.readLine());
					
					b = bkDao.rcrGetBook(bkid);
					System.out.println(b);
					break;
				case 5:
					//Get All Books
					List<Book> blist = bkDao.getAllBook();
					for(Book bk: blist)
							System.out.println(bk);
					break;
				case 6:
					// Exit
					go = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Option");
			}
		}
		System.out.println("Thanks for using spring hibernate LMS App\nSee you soon");
	}
}
