package co.jcperez.practice.dao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jcperez.practice.dao.IDetalleVentaDAO;
import co.jcperez.practice.dao.service.IDetalleVentaService;
import co.jcperez.practice.model.DetalleVenta;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService {

	@Autowired
	private IDetalleVentaDAO dao;

	@Override
	public DetalleVenta registrar(DetalleVenta t) {
		return dao.save(t);
	}

	@Override
	public DetalleVenta listarId(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public List<DetalleVenta> listar() {
		return dao.findAll();
	}

}
