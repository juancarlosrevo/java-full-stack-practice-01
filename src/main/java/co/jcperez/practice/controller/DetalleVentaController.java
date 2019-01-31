package co.jcperez.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.jcperez.practice.dao.service.IDetalleVentaService;
import co.jcperez.practice.model.DetalleVenta;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {

	@Autowired
	private IDetalleVentaService service;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetalleVenta> listarId(@PathVariable int id) {
		return new ResponseEntity<DetalleVenta>(service.listarId(id), HttpStatus.OK);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DetalleVenta>> listar() {
		return new ResponseEntity<List<DetalleVenta>>(service.listar(), HttpStatus.OK);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetalleVenta> registrar(@RequestBody DetalleVenta p) {
		return new ResponseEntity<DetalleVenta>(service.registrar(p), HttpStatus.CREATED);
	}
}
