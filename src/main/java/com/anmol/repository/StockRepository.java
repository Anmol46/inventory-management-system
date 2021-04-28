package com.anmol.repository;

import com.anmol.entity.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock,Integer> {
}
