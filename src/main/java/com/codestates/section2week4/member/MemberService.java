package com.codestates.section2week4.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
    private final MemberRepository memberRepository;

    // @Autowired - 생성자 의존성 주입에 필요한 설정 정보 대신 의존관계 자동 주입을 해주게 됩니다.
    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void createMember(Member member) {
        memberRepository.postMember(member);
    }

    public Member getMember(Long memberId) {
        return memberRepository.getMember(memberId);
    }

    public void deleteMember(Long memberId) {
        memberRepository.deleteMember(memberId);
    }
}