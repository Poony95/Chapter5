package hiding;

class BirthDay {
	
/* 접근 제어자 (4가지)
 * private - 내 클래스 안에서만 쓰는것.외부 접근 안됨
  public - 모두 쓸 수 있음
  안쓰는 경우 default - 내 카테고리 안에서만 쓸 수 있음.
  protectide - 상속 관계에서만 public 처럼 사용할 수 있음. */
 
	private int day;
	private int month;
	private int year;
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if(day <1 || day >28) {
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

public class BirthDayTest{
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2023);
	}
}

//기본적으로 하나의 클래스에 하나만 넣지만 간단한 클래스는 public을 뺴고 같이 쓰는 경우도 있음.