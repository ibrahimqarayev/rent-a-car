package com.rent.bussiness.abstracts;

import com.rent.bussiness.responses.GetAllBrandsResponse;
import com.rent.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
}
