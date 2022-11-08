package com.yavuzahmet.rentacarproject.controller;

import com.yavuzahmet.rentacarproject.model.Brand;
import com.yavuzahmet.rentacarproject.service.BrandService;
import com.yavuzahmet.rentacarproject.service.requests.CreateBrandRequest;
import com.yavuzahmet.rentacarproject.service.response.GetAllBrandsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("getAllBrands")
    public List<GetAllBrandsResponse> getAllBrands(){
        return brandService.getAllBrands();
    }

    @PostMapping("addBrand")
    public void addBrand(CreateBrandRequest createBrandRequest){
        brandService.addBrand(createBrandRequest);
    }
}
