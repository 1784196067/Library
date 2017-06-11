package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Loan {
	private LocalDateTime LoanDate;
	
	private LocalDateTime DateForReturn;
	
	private LocalDateTime ReturnDate;
	
	private Book book;
	
	private Member member;
	
	public LocalDateTime getLoanDate() {
		return LoanDate;
	}

	public void setLoanDate(LocalDateTime loanDate) {
		LoanDate = loanDate;
	}

	public LocalDateTime getDateForReturn() {
		return DateForReturn;
	}

	public void setDateForReturn(LocalDateTime dateForReturn) {
		DateForReturn = dateForReturn;
	}

	public LocalDateTime getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		ReturnDate = returnDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Boolean HasNotBeenReturned(){
		return ReturnDate == null;
	}
	
	public void MarkAsReturned(){
		ReturnDate = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "Loan [LoanDate=" + LoanDate + ", DateForReturn=" + DateForReturn + ", ReturnDate=" + ReturnDate
				+ ", book=" + book + ", member=" + member + "]";
	}
	
	
}
