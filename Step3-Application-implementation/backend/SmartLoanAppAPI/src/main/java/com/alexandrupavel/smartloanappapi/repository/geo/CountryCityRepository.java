package com.alexandrupavel.smartloanappapi.repository.geo;

import com.alexandrupavel.smartloanappapi.model.geo.CountryCity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryCityRepository extends JpaRepository<CountryCity, Long> {
}
