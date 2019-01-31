package co.jcperez.practice.dao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jcperez.practice.dao.IVentaDAO;
import co.jcperez.practice.dao.service.IVentaService;
import co.jcperez.practice.model.Venta;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	private IVentaDAO dao;

	@Override
	public Venta listarId(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public List<Venta> listar() {
		return dao.findAll();
	}

	@Override
	public Venta registrar(Venta t) {
		t.getDetalles().forEach(det -> det.setVenta(t));
		return dao.save(t);
	}

}
