package test;

import static org.junit.Assert.*;

import org.junit.Test;

import factory.LoanFactory;
import model.Book;
import model.Loan;
import model.Member;

public class LibraryTest {

	@Test
	public void test() {
		
		System.out.println("----------学生借书1：正常----------");
		Member stu = new Member("Luxi");
		Book book1 = new Book("101111", "AngulsrJS权威教程1");
		Loan loan = stu.Loan(book1);
		System.out.println(stu.toString());
		
		System.out.println("----------学生借书2。1：正常----------");
		Book book2 = new Book("101112", "AngulsrJS权威教程2");
		loan = stu.Loan(book2);
		System.out.println(stu.toString());
		
		System.out.println("----------学生借书3：正常----------");
		Book book3 = new Book("101113", "AngulsrJS权威教程3");
		loan = stu.Loan(book3);
		System.out.println(stu.toString());
		
		System.out.println("----------学生借书4.1:超过3本，操作错误----------");
		Book book4 = new Book("101114", "AngulsrJS权威教程4");
		loan = stu.Loan(book4);
		System.out.println(stu.toString());
		
		System.out.println("----------学生还书:book3----------");
		stu.Return(book3);
		System.out.println(stu.toString());
		
		System.out.println("----------学生借书2.2:借书操作失败，同一书只能借阅一本----------");
		Book book5 = new Book("101112", "AngulsrJS权威教程2");
		loan = stu.Loan(book5);
		System.out.println(stu.toString());
		
		System.out.println("----------学生借书4.2:正常----------");
		loan = stu.Loan(book4);
		System.out.println(stu.toString());
		
		
		
	}

}
