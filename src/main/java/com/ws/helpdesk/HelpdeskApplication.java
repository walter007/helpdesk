package com.ws.helpdesk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ws.helpdesk.entities.Chamado;
import com.ws.helpdesk.entities.Cliente;
import com.ws.helpdesk.entities.Tecnico;
import com.ws.helpdesk.enuns.Perfil;
import com.ws.helpdesk.enuns.Prioridade;
import com.ws.helpdesk.enuns.Status;
import com.ws.helpdesk.repositories.ChamadoRepository;
import com.ws.helpdesk.repositories.ClienteRepository;
import com.ws.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico("Valdir Cezar","423.457.770-93","valdir@mail.com","123");
		tec1.addPerfis(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente("Linus Torvalds","705.117.440-13","torvalds@mail.com","123");
		
		Chamado chamado = new Chamado(Prioridade.MEDIA,Status.ANDAMENTO,"Chamado 01","Primeiro chamado",tec1,cli1);
		
		tecnicoRepository.save(tec1);
		clienteRepository.save(cli1);
		chamadoRepository.save(chamado);
		
	}

}
