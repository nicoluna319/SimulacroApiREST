package riwi.RiwiApp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import riwi.RiwiApp.domain.entities.AssignmentsEntity;

public interface AssignmentsRepository extends JpaRepository<AssignmentsEntity, Long>{
    
}
