package model;

public class Book {
	private String ISBN;
	
	private String Title;
	
	private Member LoanTo;

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public final String getTitle() {
		return Title;
	}

	public final void setTitle(String title) {
		Title = title;
	}

	public Member getLoanTo() {
		return LoanTo;
	}

	public void setLoanTo(Member loanTo) {
		LoanTo = loanTo;
	}

	public Book(String iSBN, String title) {
		super();
		ISBN = iSBN;
		Title = title;
	}
	
	
}
