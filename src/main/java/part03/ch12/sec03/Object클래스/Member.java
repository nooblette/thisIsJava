package part03.ch12.sec03.Object클래스;

public class Member {
	public String id;
	public Member(String id){
		this.id = id;
	}

	@Override
	public boolean equals(Object object){
		if(object instanceof Member target){
			return id.equals(target.id);
		}
		return false;
	}
}
