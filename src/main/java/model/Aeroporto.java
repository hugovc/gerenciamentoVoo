package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Aeroporto {
   
	
	

	public Aeroporto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aeroporto(Long id, String codigoIATA, String nome, Cidade cidade) {
		super();
		this.id = id;
		this.codigoIATA = codigoIATA;
		this.nome = nome;
		this.cidade = cidade;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String codigoIATA;
    
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoIATA() {
		return codigoIATA;
	}

	public void setCodigoIATA(String codigoIATA) {
		this.codigoIATA = codigoIATA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
    
   
}
