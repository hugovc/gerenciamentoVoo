package model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
	public class Voo {
	
	
	
	
	    public Voo() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Voo(Long id, Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino, String numeracao,
			LocalDateTime dataHoraPartida, List<Classe> classes) {
		super();
		this.id = id;
		this.aeroportoOrigem = aeroportoOrigem;
		this.aeroportoDestino = aeroportoDestino;
		this.numeracao = numeracao;
		this.dataHoraPartida = dataHoraPartida;
		this.classes = classes;
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @ManyToOne
	    @JoinColumn(name = "aeroporto_origem_id")
	    private Aeroporto aeroportoOrigem;
	    
	    @ManyToOne
	    @JoinColumn(name = "aeroporto_destino_id")
	    private Aeroporto aeroportoDestino;
	    
	    @Column(unique = true)
	    private String numeracao;
	    
	    private LocalDateTime dataHoraPartida;
	    
	    @OneToMany(mappedBy = "voo")
	    private List<Classe> classes;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Aeroporto getAeroportoOrigem() {
			return aeroportoOrigem;
		}

		public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
			this.aeroportoOrigem = aeroportoOrigem;
		}

		public Aeroporto getAeroportoDestino() {
			return aeroportoDestino;
		}

		public void setAeroportoDestino(Aeroporto aeroportoDestino) {
			this.aeroportoDestino = aeroportoDestino;
		}

		public String getNumeracao() {
			return numeracao;
		}

		public void setNumeracao(String numeracao) {
			this.numeracao = numeracao;
		}

		public LocalDateTime getDataHoraPartida() {
			return dataHoraPartida;
		}

		public void setDataHoraPartida(LocalDateTime dataHoraPartida) {
			this.dataHoraPartida = dataHoraPartida;
		}

		public List<Classe> getClasses() {
			return classes;
		}

		public void setClasses(List<Classe> classes) {
			this.classes = classes;
		}
	    
	    
	    
	}


