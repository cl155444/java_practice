package kh.array;

import java.util.Arrays;

public class Array {

	//변수(Variable)
	// 메모리(Rqm) 공간에 DATA(BALUE)값을 저장하는 공간
	
	// 변수의 특징
	// 하나의 변수공간에는 하나의 값만 대입될 수 있음
	
	/*
	 * 배열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음
	 * 				단, "같은 자요형의 값들"만 담을 수 있음
	 * 				= 동종모음(homogeneous collection)이라고 부름
	 * 				= 변수가 나열되어 있는 것
	 * 
	 * -> 배열의 각 공간에 접근할 때 사용하느 개념 index
	 * -> index는 0부터 시작한다.
	 */
	
	public void method1() {
		// 다섯 개의 정수를 변수에 대입한 뒤 정수값을 모두 더한 값을 출력
		/*
		int num1 = 15;
		int num2 = 12;
		int num3 = 57;
		int num4 = 67;
		int num5 = 42;
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(sum);
		*/
		
		// 배열 사용을 위한 절차
		// 1. 배열 선언
		/* 
		 * 변수 선언 방법
		 * 
		 * 자료형 변수명;
		 * 
		 * 배열 선언 방법
		 * 		1) 자료형 배열명[]; // 대괄호가 없으면 자료형 변수명과 같다.
		 * 		2) 자료형[] 배열명; -> 보편적으로 사용하는 방법
		 */
		
		// 변수 선언
		//int num;
		
		//배열 선언
		//int[] nums;
		
		//2. 배열 할당
		/*
		 * 배열에 몇 개의 값이 들어갈 것인지 배열의 크기를 정해주는 과정
		 * 지정한 개수만큼의 값이 들어갈 공간이 할당됨
		 * 
		 * [ 표현법 ]
		 * 
		 * int[] nums; <- 배열 선언
		 * nums = new int[5]; <- 할당 "5칸이 필요하다.
		 * 
		 * int[] arr = new int[5]; <-- 선언과 동시에 할당하는 방법
		 * 
		 * 배열은 참조 자료형이다 // int[] != int : 정수배열은 정수형이 아니기 때문에 기본 자료형이 아니다.
		 */
		
		//nums라는 정수형 배열을 선언하고 2칸 할당받음
		int[] nums = new int[2]; // 해당 변수에 2개의 변수공간을 제공
		
		// 배열에 값을 대입 -> 이를 위해 필요한 개념 = index
		// 예시 : 현재 칸이 2개, 1개의 칸에 10값을 넣고싶음
		// nums를 보면 new int의 위치를 알 수 있는 것(stack에서 주소를 통해 heap의 의치를 찾아냄)
		nums[0] = 10; // index의 첫번째(0)칸에 쓴다는 뜻
					// 이를 주소로 불러오면 변수 2칸이 있는 상태
					// 변수의 순번을 부르는 명칭을 index라 함
		nums[1] = 17;	// index의 두번째(1)칸에 쓴다는 뜻
		System.out.println(/*nums만 넣는 것은 의미가 없다.*/nums[0]);
		System.out.println(nums[1]);
		}
	
	public void method2() {
		// 배열은 아주 중요한 개념
		// 10점 만점에 8점 정도 - 그런데 취업에 도움에 큰 도움이 되지는 않음. 학문적으로는 중요하다는 뜻
		// 개발자가 되고 난 이후에 중요한 개념
		
		//1. 배열 선언 및 할당
		//int i;
		//int[] integers = new int[3]; //값을 할당 -> 3칸을 할당함 0,1,2번 값을 얻은 것
									//어지간하면 변수명을 ~s와 같이 복수로 쓸 것
		// 배역식별자.lengh : 배열의 크기(길이) -> 정수 -> 암기하기
		//System.out.println(integers.length);
		
		//localvariable(지역변수) == 초기화하지 않으면 사용할 수 없음
		//System.out.println(integers[0]);
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * 			-> 변수 공간에 실제 값을 바로 담을 수 있음
		 * 참조자료형 : int[], boolean[], ... 기본자료형에 대응하는 참조자료형이 있음
		 * 			String[]도 마찬가지
		 * 			-> 변수 공간에 주고 값을 담을 수 있음
		 */
		
		int number1 =3;
		int number2 =3;
		System.out.println(number1 == number2);
		
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		System.out.println(numbers1 == numbers2);
		
		// 참조자료형이 경우 == 사용 시
		// 주소값을 비교하기 때문에 원하는 결과를 얻응 수 없다.
		// 특히 문자열의 경우 더욱 그렇다.
		// 그래서 문자열.equals("비교할 문자열") 형태로 사용한다.
		
		//배열 주소를 16진수가 아닌 10진수로 표현하는 방법 참조자료형.hashcode()
		//해시코드 : 주소값을 10진수(int형)형태로 나타낸 것
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
		
	}
	
	public void createLottoNumber() {
		//로또 번호 생성기 ver 0.2
		int[] lottoNumbers = new int[6]; // index가 0~5까지의 주소를 가짐
		
		for(int i = 0; i < 6; i++) {
			lottoNumbers[0] = (int)(Math.random() * 45) +1;
		}
		//Arrays.toString(배열식별자) -> 배열의 요소들을 이쁘게 출력해줌
		System.out.println(Arrays.toString(lottoNumbers));
	}
	public void mathod3() {
		// 구구단을 담는 9칸짜리 배열을 선언 및 할당
		
		//1. 배열을 선언 및 할당
		String[] gugudan = new String[9];
		
		//2. 배열 인덱스에 구구단 대입
		gugudan[0] = "2 x 1 = 2";
		gugudan[1] = "2 x 2 = 4";
		gugudan[2] = "2 x 3 = 6";
		gugudan[3] = "2 x 4 = 8";
		gugudan[4] = "2 x 5 = 10";
		gugudan[5] = "2 x 6 = 12";
		gugudan[6] = "2 x 7 = 14";
		gugudan[7] = "2 x 8 = 16";
		gugudan[8] = "2 x 9 = 18";

		//ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
		//at com.kh.array.Array.method3(Array.java:169)
		//at com.kh.run.Run.main(Run.java:12)
		
		/*
		 * AI 사용 합의
		 * AI 활용해서 내 코드의 잘못된 점을 파악
		 * -> 코드를 통채로 줌 -> 직접 타이핑(복사 붙여넣기 x) -> 잘된다 
		 */
		
		//3. 출력
		System.out.println(Arrays.toString(gugudan));
				
		
	}
	public void method4() {
		/*
		 * love를 배열 이용해서 출력해보기
		 */
		char[] love = new char[4];
		// heap 영역의 주소를 알기
		love[0] = 'l'; // 0번 index에 접근, 대입 연산자를 이용하여 'l'을 대입
		love[1] = 'o';
		love[2] = 'v';
		love[3] = 'e';
		
		System.out.println(Arrays.toString(love));
		love[1] = 'i';
		System.out.println(Arrays.toString(love));
		System.out.println(love.hashCode());
		
		love = new char[5];
		love[4] = 'r';
		System.out.println(Arrays.toString(love));
		// stack 안에 있는 love라는 공간에 새로운 5자리를 준 것이지. 
		// heap 안에 있는 love에 한 자리를 추가하는 것이 아니다.
		// love = new char[5]를 통해 새로운 5개의 주소를 준 것
		// ※ char 형의 기본값은 '', '정수형의 기본값은 0, 실수형의 기본값은 0.0
		System.out.println(love.hashCode());
		/* 
		 * 연결이 끊긴 기존의 배열은 일정 시간이 지나면 GarbageCollection(GC)가 알아서 삭제
		 * 자동 메모리 관리
		 * 
		 * 기존배열식별자에 할당만 새롭게 하나면 -> 기존 참조하고있던 연결이 끊기고 새로운 배열을 가리킴
		 */
		
		// 차형배열 -> 들어갈 수 있는 값 : 주소값
		// 			들어갈 수 있는 타입 : 차형배열
		//		유일한 예외 == null 값

		love =	null;
		// null : 아무것도 존재하지 않음을 의미하는 값
		System.out.println(love);
		
	}
	public void method5() {
		/* 
		배열은 언제 사용하는가?
		사용해야하는 값과 명확한 경우에 사용 
		웹으로 한정짓는 경우 : 임시비밀번호 발급, 인증코드 발급
		자바가 끝나면 과정이 끝날때까지 단 한번도 직접적으로 사용하지 않을 것
		하지만 눈에만 보이지 않을 뿐 자바에서는 항생 배열을 사용하고 있음
		*/
		
		// 사용을 한다면 직접 인덱스 값에 대입하는 방식보다는
		int[] arr = {100,200,300}; // int arr = int[2] 이런 식으로 안쓴다는 의미
		System.out.println(Arrays.toString(arr));
		
	}
	
	/*
	 * 배열 복사해보기
	 * 방법은 2가지
	 * 1. 앝은 복사 ☆☆☆☆ 변수 자료형 이후 가장 중요한 내용
	 * 난이도가 높지는 않음
	 * 
	 * 2. 깊은 복사
	 */
	public void method6() {
		int[] origin = {1, 2, 3};
		System.out.println(Arrays.toString(origin));
		
		// 앝은 복사로 배열 복사해보기
		int[] copy /* 배열 선언*/ = origin;
		System.out.println(Arrays.toString(copy));
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
	}
	//2. 깊은 복사 -> 갚은 복사는 보통 기존 배열의 크기보다 큰 배열로 복사하는 경우가 많음
	public void method7() {
		int[] origin = {1,2,3};
		//처음에는 배열 3개 필요한 줄 알았는데 나중에 보니 6개가 필요했다.
		//for(int i = 0; i < origin.length; i++) {
		//	copy[i] = origin[i];
		
		
		int[] copy2 = new int[10];
		
		// 네이밍컨밴션(첫글짜가 소문자) == 클래스 / 인터페이스 == 첫글자가 대문자
		//arraycopy(원본배열명, 원본에서 복사 시작할 인덱스, 카피 배열명, 카피 배열에서 복사될 인덱스, 복사요소 개수)
		System.arraycopy(origin, 0, copy2, 0, 3);
		System.out.println(Arrays.toString(copy2));
		
		int[] copy3 = Arrays.copyOf(origin,15);
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
	}	
}
	
