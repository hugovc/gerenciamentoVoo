package model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Passagem {
    
	
	
	public Passagem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passagem(Long id, Voo voo, Classe classe, String numeroIdentificacao, String nomePassageiro,
			String cpfPassageiro, LocalDateTime dataNascimentoPassageiro, double precoTotal, boolean despachoBagagem) {
		super();
		this.id = id;
		this.voo = voo;
		this.classe = classe;
		this.numeroIdentificacao = numeroIdentificacao;
		this.nomePassageiro = nomePassageiro;
		this.cpfPassageiro = cpfPassageiro;
		this.dataNascimentoPassageiro = dataNascimentoPassageiro;
		this.precoTotal = precoTotal;
		this.despachoBagagem = despachoBagagem;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "voo_id")
    private Voo voo;
    
    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;
    
    private String numeroIdentificacao;
    
    private String nomePassageiro;
    
    private String cpfPassageiro;
    
    private LocalDateTime dataNascimentoPassageiro;
    
    private double precoTotal;
    
    private boolean despachoBagagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public String getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(String numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}

	public String getCpfPassageiro() {
		return cpfPassageiro;
	}

	public void setCpfPassageiro(String cpfPassageiro) {
		this.cpfPassageiro = cpfPassageiro;
	}

	public LocalDateTime getDataNascimentoPassageiro() {
		return dataNascimentoPassageiro;
	}

	public void setDataNascimentoPassageiro(LocalDateTime dataNascimentoPassageiro) {
		this.dataNascimentoPassageiro = dataNascimentoPassageiro;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public boolean isDespachoBagagem() {
		return despachoBagagem;
	}

	public void setDespachoBagagem(boolean despachoBagagem) {
		this.despachoBagagem = despachoBagagem;
	}
    
    
    
}
