package riwi.RiwiApp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import riwi.RiwiApp.domain.entities.SubmissionsEntity;

public interface SubmissionsRepository extends JpaRepository<SubmissionsEntity, Long>{
    
}
