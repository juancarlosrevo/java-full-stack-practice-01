package co.jcperez.practice.dao.service;

import java.util.List;

public interface IReadService<T> {

	T listarId(Integer id);

	List<T> listar();

}
