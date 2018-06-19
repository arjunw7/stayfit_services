package com.stayfit.services.repository;

import com.stayfit.services.domain.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AttendanceRepository implements JpaRepository<Attendance, Integer> {
}
