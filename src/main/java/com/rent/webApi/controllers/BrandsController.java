package com.rent.webApi.controllers;


import com.rent.bussiness.abstracts.BrandService;
import com.rent.bussiness.responses.GetAllBrandsResponse;
import com.rent.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


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
}






