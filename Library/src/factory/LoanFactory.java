package factory;

import java.time.LocalDateTime;
import model.Book;
import model.Loan;
import model.Member;
import specification.HasReachMaxSpecification;
import specification.LoanOnlyOneSpecification;

public class LoanFactory {
	public static Loan CreateLoan(Book book, Member member){
		Loan loan = new Loan();
		HasReachMaxSpecification hasReachMaxSpecification = new HasReachMaxSpecification();
		LoanOnlyOneSpecification loanOnlyOneSpecification = new LoanOnlyOneSpecification(book);		
		loan.setBook(book);
		loan.setMember(member);
		if(hasReachMaxSpecification.isSatisfied(member)){
			if(loanOnlyOneSpecification.isSatisfied(member)){
				book.setLoanTo(member);
				loan.setLoanDate(LocalDateTime.now());
				loan.setDateForReturn(loan.getLoanDate().plusDays(10));
				return loan;
			}else{
				System.out.println("借书操作失败，同一书只能借阅一本");
			}
		}else{
			System.out.println("借书操作失败，最多只能借阅3本书");
		}		
		return null;
	}
}
