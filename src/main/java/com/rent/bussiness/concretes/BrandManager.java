package com.rent.bussiness.concretes;

import com.rent.bussiness.abstracts.BrandService;
import com.rent.bussiness.requests.CreateBrandRequest;
import com.rent.bussiness.responses.GetAllBrandsResponse;
import com.rent.dataAccess.abstracts.BrandRepository;
import com.rent.entities.concretes.Brand;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;


    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> responseList = new ArrayList<>();
        for (Brand brand : brands) {
            GetAllBrandsResponse brandsResponse = new GetAllBrandsResponse();
            brandsResponse.setId(brand.getId());
            brandsResponse.setName(brand.getName());
            responseList.add(brandsResponse);
        }
        return responseList;
    }

    @Override
    public void addBrand(CreateBrandRequest createBrandRequest)  {
        Brand brand = new Brand();
            brand.setName(createBrandRequest.getName());
            brandRepository.save(brand);
    }
}
