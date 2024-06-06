package com.operaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operaciones.entity.Operacion;

public class OperacionRepository {

	@Repository
	public interface ProductoRepository extends JpaRepository<Operacion, Long> {
		
	}
}
