package com.carrezerv.company.repository;

import com.carrezerv.company.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarEntityRepository extends JpaRepository<CarEntity, Integer> {
}