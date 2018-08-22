package com.qa.repository;

import com.qa.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iBookingRepository extends JpaRepository<Booking, Long> {
}
