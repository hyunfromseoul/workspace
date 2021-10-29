
/*
 # 멤버 변수 (field, class member variable)
 1. 클래스(객체) 블록에 선언된 변수다. (객체의 멤버)
 2. 메모리의 heap 영역에 저장됨
 3. 초기화하지 않아도 각 데이터타입의 기본값이 됨
 4. 객체를 지정한 참조변수가 사라지거나 주소값이 없어지면 자동 소멸
 
 # 지역 변수 (local variable)
 1. 메서드나 생성자 안의 변수다.
 2. 메모리 stack 영역에 저장됨
 3. 초기화하지 않으면 쓰지 못함 
 4. 선언된 블록을 벗어나면 메모리에서 자동 소멸
 */

public class MemberLocalVariable {

	int a; //멤버 변수, 자동 값 초기화
	
	void printNumber(int c) { // () 매개변수 == 지역변수
		int b = 0; //지역변수
		System.out.println("멤버변수: " + a);
		System.out.println("지역변수: " + b);
//		System.out.println("지역변수: " + b); 값을 초기화하지 않아서 사용 불가능
		System.out.println("매개변수: " + c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}
