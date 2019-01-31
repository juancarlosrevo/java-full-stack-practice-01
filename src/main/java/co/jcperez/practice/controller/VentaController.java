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

import co.jcperez.practice.dao.service.IVentaService;
import co.jcperez.practice.model.Venta;

@RestController
@RequestMapping("/venta")
public class VentaController {

	@Autowired
	private IVentaService service;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Venta> listarId(@PathVariable int id) {
		return new ResponseEntity<Venta>(service.listarId(id), HttpStatus.OK);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Venta>> listar() {
		return new ResponseEntity<List<Venta>>(service.listar(), HttpStatus.OK);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Venta> registrar(@RequestBody Venta p) {
		return new ResponseEntity<Venta>(service.registrar(p), HttpStatus.CREATED);
	}
}
