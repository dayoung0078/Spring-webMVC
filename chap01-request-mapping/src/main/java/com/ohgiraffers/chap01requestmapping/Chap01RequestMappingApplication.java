package com.ohgiraffers.chap01requestmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chap01RequestMappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap01RequestMappingApplication.class, args);


//    MethodMappingTestController mt = new MethodMappingTestController();
//    mt.registMenu();

    /*
    * DI?
    * 스프링 프레임워크의 DI(Dependency Injection)는 객체 지향 프로그래밍에서 사용되는 디자인 패턴 중 하나
    * DI는 객체 간의 의존 관계를 외부에서 주입함으로써 객체 간의 결합도를 낮추고 유연하고 확장 가능한 애플리케이션을 만들 수 있도록 도와줍니다
    *
    * IOC?
    * IOC(Inversion of Control)는 소프트웨어 공학에서 사용되는 디자인 원칙 중 하나
    * 제어의 역전을 의미하며, 객체의 생명주기와 의존성 관리를 프레임워크나 컨테이너에게 위임함으로써
    * 객체 간의 결합도를 낮추고 유연한 애플리케이션을 만들 수 있게 해줍니다.
    *
    * 1. 느슨한 결합(Loose Coupling): 객체들 간의 의존성이 줄어들어 변경에 대한 영향이 적어집니다.
      2. 유연성과 확장성(Flexibility and Extensibility): 새로운 구현체를 추가하거나 기존 구현체를 변경할 때 코드 수정이 쉽고 안전합니다.
      3. 테스트 용이성(Testability): 의존성 주입을 통해 의존 객체를 쉽게 대체하거나 모의 객체(mock object)를 사용하여 단위 테스트가 용이해집니다.
    *
    * */
    }

}
