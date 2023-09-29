package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Bagagem;

public interface BagagemRepository  extends JpaRepository<Bagagem, Long> {

}
