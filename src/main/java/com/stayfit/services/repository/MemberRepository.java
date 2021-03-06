package com.stayfit.services.repository;

import com.stayfit.services.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{

    public List<Member> findMemberByTrainerId(int id);

    public List<Member> findMemberByFitnessCenterId(int id);
}
