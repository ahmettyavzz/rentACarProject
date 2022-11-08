package com.yavuzahmet.rentacarproject.repository;

import com.yavuzahmet.rentacarproject.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
