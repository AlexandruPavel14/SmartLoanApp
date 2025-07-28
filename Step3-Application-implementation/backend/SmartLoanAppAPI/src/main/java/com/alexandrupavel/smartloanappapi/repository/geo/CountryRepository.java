package com.alexandrupavel.smartloanappapi.repository.geo;

import com.alexandrupavel.smartloanappapi.model.geo.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
