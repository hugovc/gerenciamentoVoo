package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Passagem;
import repository.PassagemRepository;

@RestController
@RequestMapping("/api")
public class VoucherController {
    @Autowired
    private PassagemRepository passagemRepository;
    
    @GetMapping("/vouchers/{id}")
    public Passagem emitirVoucher(@PathVariable Long id) {
        Passagem voucher = passagemRepository.findById(id).orElseThrow();
        voucher.getNumeroIdentificacao();
        voucher.getVoo().getNumeracao();
        voucher.getVoo().getAeroportoOrigem().getNome();
        voucher.getVoo().getAeroportoDestino().getNome();
        voucher.getNomePassageiro();
        voucher.isDespachoBagagem();
        
        return voucher;
    }
}
