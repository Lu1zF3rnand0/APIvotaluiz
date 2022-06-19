package br.edu.infnet.apivotaluiz.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
		name = "TVoto"
	)
public class Voto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime data;
	private String localizacao;
	
	@ManyToOne
	@JoinColumn(name = "idEleitor")
	@JsonBackReference(value = "voto-eleitor")
	private Eleitor eleitor;
	@ManyToOne
	@JoinColumn(name = "idEleicao")
	@JsonBackReference(value = "voto-candidato")
	private Candidato candidato;
	@ManyToOne
	@JoinColumn(name = "idCandidato")
	@JsonBackReference(value = "voto-eleicao")
	private Eleicao eleicao;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Voto() {
		this.setData(LocalDateTime.now());
	}
	
	public Eleitor getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public Eleicao getEleicao() {
		return eleicao;
	}
	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
}
