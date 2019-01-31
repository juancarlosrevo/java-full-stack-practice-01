package co.jcperez.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.jcperez.practice.model.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {

}
