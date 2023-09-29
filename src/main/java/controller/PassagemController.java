package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Passagem;
import repository.PassagemRepository;

@RestController
@RequestMapping("/api")
public class PassagemController {
    @Autowired
    private PassagemRepository passagemRepository;
    
    @GetMapping("/passagens")
    public List<Passagem> listarPassagens() {
        return passagemRepository.findAll();
    }
    
    @PostMapping("/passagens")
    public Passagem comprarPassagem(@RequestBody Passagem passagem) {
        return passagemRepository.save(passagem);
    }

	/*
	 * @GetMapping("/passagens/{cpf}") public List<Passagem>
	 * obterPassagensPorCpf(@PathVariable String cpf) { return
	 * passagemRepository.findByCpfPassageiro(cpf); }
	 */
    
    @DeleteMapping("/passagens/{id}")
    public ResponseEntity<?> cancelarPassagem(@PathVariable Long id) {
        Passagem passagem = passagemRepository.findById(id).orElseThrow();
        
        passagemRepository.delete(passagem);
        
        return ResponseEntity.ok().build();
    }
}
