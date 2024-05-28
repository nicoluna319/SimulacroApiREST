package riwi.RiwiApp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import riwi.RiwiApp.domain.entities.EnrollmentsEntity;

public interface EnrollmentsRepository extends JpaRepository<EnrollmentsEntity, Long>{
    
}
