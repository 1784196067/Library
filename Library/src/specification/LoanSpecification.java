package specification;

public interface LoanSpecification<T> {
	public Boolean isSatisfied(T entity);
}
