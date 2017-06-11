package specification;

import java.util.ArrayList;
import java.util.List;

import model.Loan;
import model.Member;

public class HasReachMaxSpecification implements LoanSpecification<Member> {

	@Override
	public Boolean isSatisfied(Member member) {
		List<Loan> loans = member.getLoans();
		int i = 0;
		if(loans != null){
			for(Loan loan: loans){
				if(loan.HasNotBeenReturned()){
					i++;
				}
			}		
		}else{
			return true;
		}
		if( i >= 3){
			return false;
		}else{
			return true;
		}
	}

}
