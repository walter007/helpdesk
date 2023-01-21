package com.ws.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.helpdesk.entities.Chamado;
import com.ws.helpdesk.entities.Cliente;
import com.ws.helpdesk.entities.Tecnico;
import com.ws.helpdesk.enuns.Perfil;
import com.ws.helpdesk.enuns.Prioridade;
import com.ws.helpdesk.enuns.Status;
import com.ws.helpdesk.repositories.ChamadoRepository;
import com.ws.helpdesk.repositories.ClienteRepository;
import com.ws.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico("Valdir Cezar","423.457.770-93","valdir@mail.com","123");
		tec1.addPerfis(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente("Linus Torvalds","705.117.440-13","torvalds@mail.com","123");
		
		Chamado chamado = new Chamado(Prioridade.MEDIA,Status.ANDAMENTO,"Chamado 01","Primeiro chamado",tec1,cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(chamado));
	}
}
