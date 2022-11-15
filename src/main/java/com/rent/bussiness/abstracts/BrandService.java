package com.rent.bussiness.abstracts;

import com.rent.bussiness.requests.CreateBrandRequest;
import com.rent.bussiness.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

   void addBrand(CreateBrandRequest createBrandRequest) ;
}
