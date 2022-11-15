package com.rent.webApi.controllers;


import com.rent.bussiness.abstracts.BrandService;
import com.rent.bussiness.requests.CreateBrandRequest;
import com.rent.bussiness.responses.GetAllBrandsResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping
    public void addBrand(@RequestBody CreateBrandRequest createBrandRequest) {
        brandService.addBrand(createBrandRequest);
    }
}






