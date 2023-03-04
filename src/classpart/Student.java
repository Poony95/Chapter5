package classpart;

// package 이름은 소문자로 시작 class 이름은 대문자로 시작! 
// 변수 이름은 소문자로 시작해서 단어바뀔 때부터 대문자, 매서드도 같음.

public class Student {
	int studentID; // 변수 (소문자시작, 단어바뀌는 것 대문자)
	String studentName;
	int grade;
	String address;
	
	public Student() {}
	
	public Student (int id, String name) { //이름을 매개변수로 입력받는 생성자
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfor() {
		System.out.println(studentID + "," + studentName + "," + grade + "학년" + ","  + address);
	}
	
	public static void main(String[] args) {
		
		int i = 10;
		
		Student studentGUk = new Student(); // 메서드도 소문자 시작 변환될 것 대문자
		studentGUk.studentID = 213180077;
		studentGUk.studentName = "국동완";
		studentGUk.address = "서울시 영등포구 여의도동";
		studentGUk.grade = 3;
		
		Student studentRyu = new Student();
		studentRyu.studentID = 213180076;
		studentRyu.studentName = "류예인";
		studentRyu.address = "서울시 동작구 노량진1동";
		studentRyu.grade = 3;
		
		studentGUk.showStudentInfor();
		studentRyu.showStudentInfor();
		
		System.out.println(studentGUk);
		System.out.println(studentRyu); 
	}
}

/* 객체 지향프로그래밍 "의사나 행위가 미치는 대상 " 구체적, 추상적 데이터 단위
(Object Oriented Programming, OOP)
- 객체를 정의 / - 객체의 기능 구현 / - 객체 사이의 협력 구현
<-> 절차적 프로그래밍 : 시간에 따른 프로그래밍 (일어나고-씻고-학교가고...)

클래스의 속성 = property, attribute 이라고도 부름.
*/