package com.codestates.section2week4.member;

import com.codestates.section2week4.DependencyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberTest {
    public static void main(String[] args) {
        // ApplicationContext 가 바로 Spring Container 이다.
        ApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);

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

/*
ApplicationContext 가 스프링 컨테이너입니다.

기존에 DependencyConfig 를 사용해서 직접 객체를 생성하고 의존 주입을 했지만, 스프링 컨테이너를 이용한 의존 주입을 사용합니다.

스프링 컨테이너는 @Configuration 이 붙은 DependencyConfig 를 설정 정보로 사용합니다.

@Bean 이 적힌 메서드를 모두 호출해서 반환된 객체를 스프링 컨테이너에 등록합니다.
직접 자바 코드로 설정 및 등록했던 것을 스프링 컨테이너에 객체만 스프링 빈으로 등록해주고 스프링 컨테이너에서 찾아서 사용하도록 변경된 것입니다.
*/