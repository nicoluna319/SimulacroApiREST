package riwi.RiwiApp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import riwi.RiwiApp.domain.entities.MessagesEntity;

public interface MessagesRepository extends JpaRepository<MessagesEntity, Long>{
    
}
