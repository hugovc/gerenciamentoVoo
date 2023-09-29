package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Bagagem;
import repository.BagagemRepository;

@RestController
@RequestMapping("/api")
public class EtiquetaController {
    @Autowired
    private BagagemRepository bagagemRepository;
    
    @GetMapping("/etiquetas/{id}")
    public Bagagem emitirEtiqueta(@PathVariable Long id) {
        Bagagem etiqueta = bagagemRepository.findById(id).orElseThrow();
        
        etiqueta.getPassagem().getNumeroIdentificacao();
        etiqueta.getNumeroIdentificacao();
        etiqueta.getPassagem().getNomePassageiro();
        
        return etiqueta;
    }
}

