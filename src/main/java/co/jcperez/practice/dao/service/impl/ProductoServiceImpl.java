package co.jcperez.practice.dao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jcperez.practice.dao.IProductoDAO;
import co.jcperez.practice.dao.service.IProductoService;
import co.jcperez.practice.model.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	
	@Autowired
	private IProductoDAO dao;

	@Override
	public Producto listarId(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public List<Producto> listar() {
		return dao.findAll();
	}

	@Override
	public Producto registrar(Producto t) {
		return dao.save(t);
	}

	@Override
	public Producto modificar(Producto t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

}
