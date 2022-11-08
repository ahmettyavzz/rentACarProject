package com.yavuzahmet.rentacarproject.service.Impl;

import com.yavuzahmet.rentacarproject.model.Brand;
import com.yavuzahmet.rentacarproject.repository.BrandRepository;
import com.yavuzahmet.rentacarproject.service.BrandService;
import com.yavuzahmet.rentacarproject.service.requests.CreateBrandRequest;
import com.yavuzahmet.rentacarproject.service.response.GetAllBrandsResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    private BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAllBrands() {
        //brand'i getAllBrandResponse'a mapleme

        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<>();
        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponses.add(responseItem);
        }
        return brandsResponses;
    }

    @Override
    public void addBrand(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brandRepository.save(brand);
    }
}
