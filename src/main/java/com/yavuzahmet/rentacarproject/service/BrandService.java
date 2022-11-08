package com.yavuzahmet.rentacarproject.service;

import com.yavuzahmet.rentacarproject.model.Brand;
import com.yavuzahmet.rentacarproject.service.requests.CreateBrandRequest;
import com.yavuzahmet.rentacarproject.service.response.GetAllBrandsResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandService{
    List<GetAllBrandsResponse> getAllBrands();
    void addBrand(CreateBrandRequest createBrandRequest);
}
