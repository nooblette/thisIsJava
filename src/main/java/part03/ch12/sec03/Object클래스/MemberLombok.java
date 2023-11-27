package part03.ch12.sec03.Object클래스;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberLombok {
	private String id;
	private String name;
	private int age;
}
