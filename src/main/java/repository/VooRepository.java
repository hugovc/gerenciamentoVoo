package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Voo;

public interface VooRepository extends JpaRepository<Voo, Long> {
	

}
