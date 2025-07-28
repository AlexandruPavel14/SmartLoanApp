package com.alexandrupavel.smartloanappapi.repository.geo;

import com.alexandrupavel.smartloanappapi.model.geo.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentRepository extends JpaRepository<Continent, Long> {
}
