package co.jcperez.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.jcperez.practice.model.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer> {

}
