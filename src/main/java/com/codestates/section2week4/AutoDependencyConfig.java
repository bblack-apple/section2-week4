package com.codestates.section2week4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AutoDependencyConfig {
}

/*
@Component : 컴포넌트 스캔에서 사용됩니다.

@Controller & @RestController : 스프링 MVC 및 REST 전용 컨트롤러에서 사용됩니다.

@Service : 스프링 비즈니스 로직에서 사용됩니다.

특별한 처리를 하지 않는다.
개발자들이 핵심 비즈니스 로직이 여기에 있다는비즈니스 계층을 인식하는데 도움이 된다.
@Repository : 스프링 데이터 접근 계층에서 사용됩니다.

스프링 데이터 접근 계층으로 인식하고, 데이터 계층의 예외를 스프링 예외로 변환해준다.
@Configuration : 스프링 설정 정보에서 사용됩니다.

스프링 설정 정보로 인식하고, 스프링 빈이 싱글톤을 유지하도록 추가 처리를 한다.


*/