package com.yavuzahmet.rentacarproject.controller;

import com.yavuzahmet.rentacarproject.model.Brand;
import com.yavuzahmet.rentacarproject.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/brands/")
public class BrandsController {
    private BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    public List<Brand> getAllBrands(){
        return brandService.getAllBrands();
    }
}
