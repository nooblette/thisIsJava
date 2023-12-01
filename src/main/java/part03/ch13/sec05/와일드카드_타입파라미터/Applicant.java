package part03.ch13.sec05.와일드카드_타입파라미터;

public class Applicant<T> {
	public T kind;

	public Applicant(T kind){
		this.kind = kind;
	}
}
