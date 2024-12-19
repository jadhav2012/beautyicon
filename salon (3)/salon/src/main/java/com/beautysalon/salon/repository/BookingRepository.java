package com.beautysalon.salon.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beautysalon.salon.model.Booking;

@Repository
@Qualifier("bookRepo")
public interface BookingRepository extends JpaRepository<Booking,Integer> {

}
