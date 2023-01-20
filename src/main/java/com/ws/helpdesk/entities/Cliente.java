package com.ws.helpdesk.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.ws.helpdesk.enuns.Perfil;

@Entity
public class Cliente extends Pessoa{
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "cliente")
	List<Chamado> chamados = new ArrayList<>();

	public Cliente() {
		super();
		addPerfis(Perfil.CLIENTE);
	}

	public Cliente(String nome, String cpf, String email, String senha) {
		super(nome, cpf, email, senha);
		addPerfis(Perfil.CLIENTE);
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}
}
