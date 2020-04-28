package report;

public class SecondConverter {
	public static void main(String[] args) {
		//100000초를 일, 시간, 분, 초의 단위로만 표현
		double day =100000.0/60/60/24;
		double hour =100000.0/60/60;
		double minute =100000.0/60;
		double second = 100000.0;
		System.out.printf("100000초는 날짜로 %f일, 시간으로 %f시간, 분으로 %f분, 초로는 %f초 입니다. \n" , day, hour, minute, second);

		//100000초를 수치상이 아닌 각각의 단위를 다 사용해서 표현
		int a = 100000;
		int b = 100000/60;
		//분
		int c = 100000%60;
		//나머지 초
		int d = b/60;
		//시간
		int e = b%60;
		//나머지 분
		int f = d/24;
		//일
		int g = d%24;
		//나머지 시간

		System.out.printf("100000초는 날짜로 %d일 %d시간 %d분 %d초, 시간으로 %d시간 %d분 %d초, 분으로 %d분%d초, 초로는 %d초 입니다. \n", 
				f, g, e, c, d, e, c, b, c, a);
		
		//100000초가 1년보다 큰지 확인하기
		int year = 1;
		int yeartosecond = 1*365*24*60*60;
		if (a > yeartosecond) {
			System.out.printf("%d초는 %d년보다 큽니다.", a, year);
			
		}
		else if (a == yeartosecond){
			System.out.printf("%d초는 %d년과 같습니다.", a, year);
		}
		else {
			System.out.printf("%d초는 %d년보다 작습니다.", a, year);
		}
		
	}

}
