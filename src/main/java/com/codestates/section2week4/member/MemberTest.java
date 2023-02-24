package com.codestates.section2week4.member;

import com.codestates.section2week4.DependencyConfig;

public class MemberTest {
    public static void main(String[] args) {
        DependencyConfig dependencyConfig = new DependencyConfig();
        MemberService memberService = dependencyConfig.memberService();

        Member member = new Member(0L, "lucky@codestates.com", "KimLucky", "010-1234-5678");
        // 내가 작성한 멤버 정보를 memberRepository 에 저장
        memberService.createMember(member);

        // memberRepository 에 저장된 멤버를 아이디를 활용하여 가져옴
        Member currentMember = memberService.getMember(0L);

        // 이건 무슨 의미인지 잘 모르겠음;
        System.out.println("회원 가입한 유저 : " + member.getName());
        System.out.println("현재 첫번째 유저 : " + member.getName());

        if(member.getName().equals(currentMember.getName())) {
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }

        memberService.deleteMember(0L);

        if(memberService.getMember(0L) == null) {
            System.out.println("회원 삭제가 정상적으로 완료되었습니다.");
        }
    }
}
