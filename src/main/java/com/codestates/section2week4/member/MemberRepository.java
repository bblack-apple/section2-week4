package com.codestates.section2week4.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemberRepository {
    private static Map<Long, Member> members = new HashMap<>();

    public void postMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public Member getMember(Long memberID) {
        return members.get(memberID);
    }

    public void deleteMember(Long memberId) {
        members.remove(memberId);
    }
}
