module thisIsJava {
	// Project Structure 에서 지정한 모듈 Name을 requires
	requires thisIsJava.module.a;
	requires lombok;
	requires java.desktop;
	requires org.json;
	requires java.sql;
}