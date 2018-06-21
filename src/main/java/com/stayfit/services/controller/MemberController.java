package com.stayfit.services.controller;

import com.stayfit.services.domain.Member;
import com.stayfit.services.domain.Trainer;
import com.stayfit.services.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/members")
    public List<Member> retrieveUsers(){
        return memberRepository.findAll();
    }

    @GetMapping("/members/{id}")
    public Member retrieveUserByID(@PathVariable int id){
        Optional<Member> member =  memberRepository.findById(id);

        if(!member.isPresent())
            throw new NullPointerException();
        else
            return member.get();
    }
    @GetMapping("/membersByTrainerID/{id}")
    public List<Member> retrieveMemberByTrainerID(@PathVariable int id){
        return memberRepository.findMemberByTrainerId(id);
    }


    @DeleteMapping("/member/{id}")
    public void deleteMember(@PathVariable int id){
        memberRepository.deleteById(id);
    }

    @PostMapping("/member")
    public Member createMember(@RequestBody Member member){
        return memberRepository.save(member);
    }
}
