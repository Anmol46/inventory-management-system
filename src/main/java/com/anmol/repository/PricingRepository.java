package com.anmol.repository;

import com.anmol.entity.Pricing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PricingRepository extends CrudRepository<Pricing, Integer> {


}
