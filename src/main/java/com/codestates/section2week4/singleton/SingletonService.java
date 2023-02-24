package com.codestates.section2week4.singleton;

public class SingletonService {
    // static 영역에 객체 딱 1개만 생성 가능. 미리 생성해놓음.
    private static final SingletonService instance = new SingletonService();

    // 객체 인스턴스가 필요하면 getter 로만 조회 가능
    // 이 메서드 사용하여 호출하면 항상 "동일한 static instance" 가져옴.
    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 private 로 선언하여 외부에서 new 키워드를 통해 객체를 생성할 수 없도록 합니다.
    private SingletonService() {}
}
