package part03.ch12.sec12.어노테이션;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // 어노테이션 적용 대상 : 메서드
@Retention(RetentionPolicy.RUNTIME) // 어노테이션 유지 정책 : RUNTIME(애플리케이션 실행시 적용하며 실행하는 동안 유지)
public @interface PrintAnnotation {
	String value() default "-"; // 기본 속성 value() 정의, 기본값 "-"로 지정
	int number() default 15; // number() 속성 정어ㅢ, 기본값 15
}
