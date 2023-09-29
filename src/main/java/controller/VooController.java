package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Voo;
import repository.VooRepository;

    @RestController
	@RequestMapping ("/api")
	public class VooController {
	    @Autowired
	    private VooRepository vooRepository;
	    
	    @GetMapping("/voos")
	    public List<Voo> listarVoos() {
	        return vooRepository.findAll();
	    }
	    
	    @PostMapping("/voos")
	    public Voo cadastrarVoo(@RequestBody Voo voo) {
	        return vooRepository.save(voo);
	    }
	    
	    @PutMapping("/voos/{id}")
	    public Voo alterarVoo(@PathVariable Long id, @RequestBody Voo vooAtualizado) {
	        Voo voo = vooRepository.findById(id).orElseThrow();
	        
	        voo.setAeroportoOrigem(vooAtualizado.getAeroportoOrigem());
	        voo.setAeroportoDestino(vooAtualizado.getAeroportoDestino());
	        voo.setNumeracao(vooAtualizado.getNumeracao());
	        voo.setDataHoraPartida(vooAtualizado.getDataHoraPartida());
	        voo.setClasses(vooAtualizado.getClasses());
	        
	        return vooRepository.save(voo);
	    }
	    
	    @DeleteMapping("/voos/{id}")
	    public ResponseEntity<?> cancelarVoo(@PathVariable Long id) {
	        Voo voo = vooRepository.findById(id).orElseThrow();
	        
	        vooRepository.delete(voo);
	        
	        return ResponseEntity.ok().build();
	    }
	}


