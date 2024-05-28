package riwi.RiwiApp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import riwi.RiwiApp.domain.entities.CoursesEntity;

public interface CoursesRepository extends JpaRepository<CoursesEntity, Long>{
    
}
