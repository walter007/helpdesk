package com.ws.helpdesk.entities;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa{
	List<Chamado> chamados = new ArrayList<>();

	public Tecnico() {
		super();
	}

	public Tecnico(Integer id, String nome, String cpf, String email) {
		super(id, nome, cpf, email);
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}
	
}
