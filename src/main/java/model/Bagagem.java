package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Bagagem {
	
	
	
    public Bagagem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bagagem(Long id, Passagem passagem, String numeroIdentificacao) {
		super();
		this.id = id;
		this.passagem = passagem;
		this.numeroIdentificacao = numeroIdentificacao;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "passagem_id")
    private Passagem passagem;
    
    private String numeroIdentificacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Passagem getPassagem() {
		return passagem;
	}

	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}

	public String getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(String numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
    
    
    
}
    
