package part04.ch20.sec09.데이터읽기.사용자정보읽기;

import lombok.Data;

@Data
public class User {
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;
}
