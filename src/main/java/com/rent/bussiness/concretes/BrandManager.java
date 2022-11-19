package com.rent.bussiness.concretes;

import com.rent.bussiness.abstracts.BrandService;
import com.rent.bussiness.requests.CreateBrandRequest;
import com.rent.bussiness.responses.GetAllBrandsResponse;
import com.rent.dataAccess.abstracts.BrandRepository;
import com.rent.entities.concretes.Brand;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;


    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public void addBrand(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brandRepository.save(brand);
    }
}
