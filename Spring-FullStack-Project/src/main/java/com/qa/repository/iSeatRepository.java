package com.qa.repository;

import com.qa.domain.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iSeatRepository extends JpaRepository<Seats, Long> {
}
