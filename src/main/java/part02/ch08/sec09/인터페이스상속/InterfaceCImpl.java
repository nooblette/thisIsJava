package part02.ch08.sec09.인터페이스상속;

public class InterfaceCImpl implements InterfaceC{
	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl - methodA call");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl - methodB call");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl - methodC call");
	}
}
