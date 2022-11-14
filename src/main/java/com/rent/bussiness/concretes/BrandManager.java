package com.rent.bussiness.concretes;

import com.rent.bussiness.abstracts.BrandService;
import com.rent.dataAccess.abstracts.BrandRepository;
import com.rent.entities.concretes.Brand;

import java.util.List;

public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
