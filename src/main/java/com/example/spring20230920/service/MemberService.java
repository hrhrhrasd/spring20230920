package com.example.spring20230920.service;

import com.example.spring20230920.domain.Member;
import com.example.spring20230920.repository.MemberRepository;
import com.example.spring20230920.repository.MemoryMemberRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();



    public Long join(Member member) {
        //같은 이름 중복회원 불가
        memberRepository.findByName(member.getName())
                .ifPresent(m-> {
                    try {
                        throw new IllegalAccessException("이미 존재하는 아이디 입니다");
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });//중복 회원 검증


        memberRepository.save(member);
        return member.getId();
    }


    public List<Member> findMembers() {
        return memberRepository.findall();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
