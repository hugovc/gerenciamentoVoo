package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Classe {
   
	
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classe(Long id, Voo voo, String tipo, int quantidadeAssentos, double valorAssento) {
		super();
		this.id = id;
		this.voo = voo;
		this.tipo = tipo;
		this.quantidadeAssentos = quantidadeAssentos;
		this.valorAssento = valorAssento;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "voo_id")
    private Voo voo;
    
    private String tipo;
    
    private int quantidadeAssentos;
    
    private double valorAssento;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}

	public double getValorAssento() {
		return valorAssento;
	}

	public void setValorAssento(double valorAssento) {
		this.valorAssento = valorAssento;
	}
 
}
