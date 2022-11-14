package com.rent.dataAccess.abstracts;

import com.rent.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
