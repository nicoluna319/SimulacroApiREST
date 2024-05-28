package riwi.RiwiApp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import riwi.RiwiApp.domain.entities.LessonsEntity;

public interface LessonsRepository extends JpaRepository<LessonsEntity, Long>{
    
}
