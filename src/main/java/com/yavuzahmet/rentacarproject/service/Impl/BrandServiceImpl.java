package com.yavuzahmet.rentacarproject.service.Impl;

import com.yavuzahmet.rentacarproject.model.Brand;
import com.yavuzahmet.rentacarproject.repository.BrandRepository;
import com.yavuzahmet.rentacarproject.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    private BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }
}
