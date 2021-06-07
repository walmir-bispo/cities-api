package com.github.wbsj14.citiesapi.countries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

//    @Query(value = "SELECT * FROM pais WHERE nome = ?1", nativeQuery = true)
//    Optional<Country> findByName(String name);

}
