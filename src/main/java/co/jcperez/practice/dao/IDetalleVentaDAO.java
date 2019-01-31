package co.jcperez.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.jcperez.practice.model.DetalleVenta;

public interface IDetalleVentaDAO extends JpaRepository<DetalleVenta, Integer> {

}
