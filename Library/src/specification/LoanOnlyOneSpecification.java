package specification;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Loan;
import model.Member; 

public class LoanOnlyOneSpecification implements LoanSpecification<Member> {
	private Book wantBook;
	
	public LoanOnlyOneSpecification(Book wantBook) {
		super();
		this.wantBook = wantBook;
	}

	@Override
	public Boolean isSatisfied(Member member) {
		List<Loan> loans = member.getLoans();
		if(loans != null){
		 for(Loan loan: loans){
			if(loan.HasNotBeenReturned() && loan.getBook().getISBN().equals(wantBook.getISBN())){
				return false;				
			}
		 }
		}
		return true;
	}

	public Book getWantBook() {
		return wantBook;
	}

	public void setWantBook(Book wantBook) {
		this.wantBook = wantBook;
	}

	

	
	
	
}
