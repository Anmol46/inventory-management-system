package com.anmol.repository;

import com.anmol.entity.ProductLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLogRepository extends JpaRepository<ProductLogEntity,Integer>{
}
