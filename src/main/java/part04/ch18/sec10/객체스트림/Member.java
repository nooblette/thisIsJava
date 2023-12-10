package part04.ch18.sec10.객체스트림;

import java.io.Serializable;

public class Member implements Serializable {
	private static final long SERIAL_VERSION_UID = -622284561026719240L;
	private String id;
	private String name;

	public Member(String id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString(){
		return id + ": " + name;
	}
}
