package com.bikkadIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.entities.StateMaster;

@Repository
public interface StateMasterRepo extends JpaRepository<StateMaster, Integer>{

}
