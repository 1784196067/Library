package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import factory.LoanFactory;

public class Member {
	private String name;
	
	private List<Loan> loans = new ArrayList<Loan>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(ArrayList<Loan> loans) {
		this.loans = loans;
	}

	public final void Return(Book book){
		Loan loan = FindCurrentLoanFor(book);
		if(loan != null){
			Iterator<model.Loan> it = loans.iterator();
			while(it.hasNext()){
			    Loan x = it.next();
			    if(x.getBook().getISBN().equals(book.getISBN())){
			        it.remove();
			    }
			}			
			loan.MarkAsReturned();
			book.setLoanTo(null);
		}else{
			System.out.println("你没有借阅这本书。");
		}
	}
	
	public final Boolean CanLoan(Book book){
		return book.getLoanTo() == null;
	}
	
	public Loan Loan(Book book){
		Loan loan = null;
		if(CanLoan(book)){
			loan = LoanFactory.CreateLoan(book, this);
			if(loan != null){
				getLoans().add(loan);
			}			
		}
		return loan;
	}
	
	public Loan FindCurrentLoanFor(Book book){
		for(Loan loan : getLoans()){
			if(loan.getBook().getISBN().equals(book.getISBN())){
				return loan;
			}
		}
		return null;
	}

	public Member(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "你好！" + name + "，你目前借阅了" + loans.size() + "本书，请记得及时归还！";
	}
	
}
