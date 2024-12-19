package com.beautysalon.salon.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beautysalon.salon.model.Service;
@Repository
@Qualifier("serviceRepo")
public interface ServiceRepository extends JpaRepository<Service,Long>
 {

	
}
