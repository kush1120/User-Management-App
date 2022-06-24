package com.bikkadIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.entities.CountryMaster;

@Repository
public interface CountryMasterRepo extends JpaRepository<CountryMaster, Integer>{

}
