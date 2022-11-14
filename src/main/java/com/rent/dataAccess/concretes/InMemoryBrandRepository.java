package com.rent.dataAccess.concretes;

import com.rent.dataAccess.abstracts.BrandRepository;
import com.rent.entities.concretes.Brand;

import java.util.List;

public class InMemoryBrandRepository implements BrandRepository {
    @Override
    public List<Brand> getAll() {
        return null;
    }
}
