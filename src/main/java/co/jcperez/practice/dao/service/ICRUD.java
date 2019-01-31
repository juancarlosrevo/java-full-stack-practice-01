package co.jcperez.practice.dao.service;

public interface ICRUD<T> extends IReadService<T>, IAddService<T>, IDeleteService<T> {
	
	T modificar(T t);

}
