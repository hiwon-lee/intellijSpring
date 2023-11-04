package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);  // null을 처리하는 방법
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
