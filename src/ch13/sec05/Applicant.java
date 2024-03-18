package ch13.sec05;

// 신청자의 종류를 결정하지 못해서
// 신청자의 종류를 제네릭으로 선언..! 
// 어떤 타입이든 필드로 올 수 있게 하고 싶음
public class Applicant<T> {
	public T kind;
	
	public Applicant(T kind) {
		this.kind = kind;
	}
}
