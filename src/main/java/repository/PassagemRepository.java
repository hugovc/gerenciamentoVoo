package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Passagem;

public interface PassagemRepository  extends JpaRepository<Passagem, Long> {

}
