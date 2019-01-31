package co.jcperez.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.jcperez.practice.model.Persona;

public interface IPersonaDAO extends JpaRepository<Persona, Integer> {

}
