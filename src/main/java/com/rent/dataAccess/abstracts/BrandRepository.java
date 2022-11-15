package com.rent.dataAccess.abstracts;

import com.rent.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
