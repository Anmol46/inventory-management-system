package com.anmol.repository;

import com.anmol.entity.CategoryLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryLogRepository extends JpaRepository<CategoryLogEntity,Integer> {

}
