package com.ws.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ws.helpdesk.entities.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
	
}
