package com.codestates.section2week4;

import com.codestates.section2week4.member.MemberRepository;
import com.codestates.section2week4.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoDependencyConfig.class);

        MemberService memberService = ac.getBean("memberService", MemberService.class);

        System.out.println(MemberService.class.isInstance(memberService));
    }
}
