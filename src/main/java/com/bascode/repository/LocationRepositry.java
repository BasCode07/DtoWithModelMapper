package com.bascode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bascode.model.Location;

@Repository
public interface LocationRepositry extends JpaRepository<Location, Long>{
	
}
