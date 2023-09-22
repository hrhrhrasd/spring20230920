package com.example.spring20230920.repository;

import com.example.spring20230920.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findall();

}
