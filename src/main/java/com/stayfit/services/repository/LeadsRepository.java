package com.stayfit.services.repository;

import com.stayfit.services.domain.Leads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadsRepository extends JpaRepository<Leads, Integer> {
}
