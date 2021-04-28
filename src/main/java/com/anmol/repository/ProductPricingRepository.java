package com.anmol.repository;

import com.anmol.entity.ProductPricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPricingRepository extends JpaRepository<ProductPricing,Integer>{
}
