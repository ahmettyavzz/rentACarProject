package com.yavuzahmet.rentacarproject.service;

import com.yavuzahmet.rentacarproject.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandService{
    List<Brand> getAllBrands();
}
