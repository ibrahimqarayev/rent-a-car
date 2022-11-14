package com.rent.dataAccess.concretes;

import com.rent.dataAccess.abstracts.BrandRepository;
import com.rent.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Audi"));
        brands.add(new Brand(3, "Mercedes"));
        brands.add(new Brand(4, "Ferrari"));
        brands.add(new Brand(5, "Porsche"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
