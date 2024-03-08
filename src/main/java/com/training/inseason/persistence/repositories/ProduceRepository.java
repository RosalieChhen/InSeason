package com.training.inseason.persistence.repositories;

import com.training.inseason.persistence.entities.ProduceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduceRepository extends JpaRepository<ProduceEntity, Long> { }
